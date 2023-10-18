# <h1 align ="center"> TODO-APPLICATION-SIMPLE-CRUD-OPERATIONS</h1>
## Overview
The Toto Application is a simple application that allows you to perform CRUD (Create, Read, Update, Delete) operations on a list of items. This application does not use the MVC architecture and consists of two main classes: a controller class and a Beanbag class.
*** 
## Getting Started

To get started with the Toto Application, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone <repository_url>
   ```
 ***
 * Open the project in your preferred Java development environment.
* Compile and run the application.
 ***
## Features
### Controller Class
The Controller class is responsible for handling HTTP requests and contains APIs for performing CRUD operations on the list of items.

Endpoints
* `GET /todos`: Retrieve a list of all items.

* `GET /todo/{id}`: Retrieve a specific item by ID.

* `POST /todo`: Create a new item.

* `PUT /todo/id/{id}`: Update an existing item by ID.

* `DELETE /todo/delete/id/{id}`: Delete an item by ID.
  ***
 ## Beanbag Class
The Beanbag class contains the data source, which is a list of items. This class provides methods for managing the list of items.
 ***
 ## Usage
To use the Toto Application, you can make HTTP requests to the API endpoints provided by the Controller class.
* Retrieve all todos
```bash
GET /todos
```
* Retrieve a specific todo by ID:
``` bash
GET /todo/id/{id}
```
* Create a new item:
  ``` bash
  POST /todos
Request Body:
``` bash
{
  "todoId": 5,
  "todoName": "Database Management",
  "todoStatus":true
}
 ```

* Update an existing item by ID:
 `simply give the id in a pathvariable and set the flag status as true or false what ever you want it simply update the boolean status value of the todo.`
* Delete an item by ID:
  ``` bash
  DELETE/delete/todo/id/{id}
  ```
  ***
 ## Contributing
If you'd like to contribute to the Toto Application, please fork the repository and submit a pull request with your changes.
***
## License
This project is licensed under the MIT License. See the LICENSE file for details.
***
## Contact
If you have any questions or need assistance, feel free to contact the project maintainers:

gulshan shukla: [gulshanshukla630@gmail.com](mailto:gulshanshukla630@gmail.com)



Thank you for using the Toto Application!









