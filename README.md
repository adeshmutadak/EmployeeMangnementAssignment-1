
# Employee Management Assignment

This project is an Employee Management System that allows you to perform CRUD (Create, Read, Update, Delete) operations on employee records. It is developed using Java and the Spring Boot framework.



## Prerequisites
 - Java Development Kit (JDK) version 8 or higher
 - Maven
 - Git
 - mySQL
## API End Points
- POST /api/employee/Create a new employee record.
- GET /api/employee/getAllEmployee Retrieve a list of all employees.
- PUT /api/employee/update/{id} Update an existing employee record with the specified ID.
- DELETE /api/employee/deleteById/{id} Delete an employee record with the specified ID.
- DELETE /api/employee/deleteAll Delete all employee records.
- GET /api/employee/getById/{id} Retrieve an employee record with the specified ID.

## Data Model
The Employee class represents an employee record with the following attributes:

- employeeId: Unique identifier for the employee.
- firstName: First name of the employee.
- lastName: Last name of the employee.
- email: Email address of the employee.
- phoneNumber: Phone number of the employee.
- jobRole: Job role of the employee.
- salary: Salary of the employee.

## Contributing
If you would like to contribute to this project, feel free to submit a pull request. Make sure to follow the existing code style and provide detailed information about the changes you have made.

## Contact
If you have any questions or suggestions, please feel free to contact [Adesh Mutadak] via email at [adeshmutadak@gmail.com].
