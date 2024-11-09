package seg3x02.employeeGql.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import org.bson.types.ObjectId

@Document(collection = "employee")
data class Employee(
    // Changed from val to var
        var name: String,
        var dateOfBirth: String,
        var city: String,
        var salary: Float,
        var gender: String? = null,
        var email: String? = null
) {
    @Id
    var id: String = ObjectId().toString()
}
