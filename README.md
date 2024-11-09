Emile Leonhardt  
300193674  
  
To run:  
Launch Docker  
Run the following command in the Command Prompt:    
**docker run -d -p 27017:27017 --name mongodb -d mongo**  

Then go to the client branch.  
In the command prompt run the following:    
**cd (client branch)**  
**npm install --legacy-peer-deps** (to solve dependency issues for a regular npm install)  
**ng serve**  

Then go the the server branch.  
In the command prompt, run the following:  
**cd (server branch path)**  
**.\gradlew bootRun**  
  
go to http://localhost:4200/employee to view the application.  
go to http://localhost:9000/graphiql?path=/graphql for the graphql interface  
  
  

   



[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/TCK6WrAb)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17040813&assignment_repo_type=AssignmentRepo)
# employeeGql
