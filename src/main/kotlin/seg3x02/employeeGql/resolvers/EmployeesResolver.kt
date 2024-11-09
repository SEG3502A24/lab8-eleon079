package seg3x02.employeeGql.resolvers

import org.springframework.stereotype.Controller

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import seg3x02.employeeGql.entity.Employee
import seg3x02.employeeGql.repository.EmployeesRepository
import seg3x02.employeeGql.resolvers.types.CreateEmployeeInput

@Controller
class EmployeesResolver (private val employeesRepository: EmployeesRepository) {
   
    @QueryMapping
    fun employees(): List<Employee> = employeesRepository.findAll()

    @MutationMapping
    fun newEmployee(@Argument createEmployeeInput: CreateEmployeeInput): Employee {
        val name = requireNotNull(createEmployeeInput.name) { "Name is required" }
        val dateOfBirth = requireNotNull(createEmployeeInput.dateOfBirth) { "Date of birth is required" }
        val city = requireNotNull(createEmployeeInput.city) { "City is required" }
        val salary = requireNotNull(createEmployeeInput.salary) { "Salary is required" }
        val gender = createEmployeeInput.gender?.takeIf { it.isNotBlank() }
        val email = createEmployeeInput.email?.takeIf { it.isNotBlank() }
    
        val employee = Employee(name, dateOfBirth, city, salary, gender, email)
        employeesRepository.save(employee)
        return employee
    }

    @MutationMapping
    fun deleteEmployee(@Argument name: String): Boolean {
        val exists = employeesRepository.existsByName(name)
        if (exists) {
            employeesRepository.deleteByName(name)
            return true
        }
        return false
    }
    @MutationMapping
    fun updateEmployee(@Argument name: String, @Argument createEmployeeInput: CreateEmployeeInput): Employee {
        val employee = employeesRepository.findByName(name) ?: throw Exception("Employee not found")

        createEmployeeInput.name?.let { employee.name = it }
        createEmployeeInput.dateOfBirth?.let { employee.dateOfBirth = it }
        createEmployeeInput.city?.let { employee.city = it }
        createEmployeeInput.salary?.let { employee.salary = it }

        createEmployeeInput.gender?.let {
            employee.gender = it.takeIf { it.isNotBlank() }
        }
        createEmployeeInput.email?.let {
            employee.email = it.takeIf { it.isNotBlank() }
        }

        employeesRepository.save(employee)
        return employee
    }

}