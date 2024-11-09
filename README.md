Emile Leonhardt  
300193674  
  
To run:  
Launch Docker  
Run the following command in the Command Prompt:    
**docker run -d -p 27017:27017 --name mongodb -d mongo**  

Then go the the server branch.  
In the command prompt, run the following:  
**cd (server branch path)**  
**.\gradlew bootRun**  

Then go to the client branch.  
In the command prompt run the following:    
**cd (client branch path)**  
**npm install --legacy-peer-deps** (to solve dependency issues for a regular npm install)  
**ng serve**  
  
go to http://localhost:4200/employee to view the application.  
go to http://localhost:9000/graphiql?path=/graphql for the graphql interface       
  
  
Demonstrating the program:

***GraphQL interface:***  
![lab8_img1](https://github.com/user-attachments/assets/424a0952-4b00-40ec-bbfc-7e00dd3b1285)
![lab8_img2](https://github.com/user-attachments/assets/e3916156-93e1-4bb5-bc44-d1f1b9310918)
![lab8_img3](https://github.com/user-attachments/assets/7237c583-40cb-4166-a952-db589869e16c)
![lab8_img4](https://github.com/user-attachments/assets/d8a3e552-1a68-4f3d-830d-ea1ff9264ff2)
![lab8_img5](https://github.com/user-attachments/assets/85defa25-abb4-4555-bb71-7a7a12689748)  
***GraphQL and Angular side by side:***
![lab8_img6](https://github.com/user-attachments/assets/d40bdb3c-6ee6-42ff-9355-afa4e063d96a)  
***Adding an employee through the Angular interface:***
![lab8_img7](https://github.com/user-attachments/assets/53207d49-4d56-43be-87fd-ec3325dd51fd)
![lab8_img8](https://github.com/user-attachments/assets/29048792-df4c-4117-bb24-de33c94e1b94)
***Deleting an employee through the GraphQL interface:***
![lab8_img9](https://github.com/user-attachments/assets/a3f41efc-4731-4e60-8355-cd39aa6092f5)

  

   



[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/TCK6WrAb)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17040813&assignment_repo_type=AssignmentRepo)
# employeeGql
