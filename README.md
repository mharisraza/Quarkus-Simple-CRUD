# Quarkus CRUD API

This project is a simple CRUD (Create, Read, Update, Delete) API implemented using the Quarkus framework. It serves as a learning exercise for Java developers familiar with Spring Boot who want to explore Quarkus and its benefits.

## Introduction

The Quarkus CRUD API project provides a straightforward implementation of a CRUD API using Quarkus. It demonstrates the fundamental concepts of Quarkus, such as dependency injection, RESTful web services, data persistence.

The goal of this project is to help Java developers familiar with Spring Boot transition to Quarkus by comparing the two frameworks and showcasing the benefits of using Quarkus in terms of performance and resource consumption.

# Prerequisite:
- MySQL (8.0 Preferred)
- Java (17 Preferred)

## Project Structure

The project follows a standard Maven project structure. The main components of the project are as follows:

- `src/main/java`: Contains the Java source code of the application.
- `src/main/resources`: Contains the configuration files and static resources.
- `src/test/java`: Contains the test cases for the application.
- `src/test/resources`: Contains the test configuration files.
-------------------------------------------------------------------------------------
- `src/main/java/com/harisraza/resources`:  Contains the resources (controllers) classes responsible for handling the API endpoints.
- `src/main/java/com/harisraza/services`: Contains the service interfaces and inside `/impl` directory contains their respective implementation classes for implementing business logic.
- `src/main/java/com/harisraza/exceptions`: Contains the exception classes and inside `/handles` directory contains their's respective handling classes to handle exception when thrown.

The Quarkus CRUD API exposes the following endpoints:

- `GET /api/note/{id}`: Retrieve an note by its ID.
- `POST /api/note`: Creates a new note.
- `PUT /api/note/{id}`: Updates an existing item by providing its ID.
- `DELETE /api/note/{id}`: Deletes an note.

The API follows RESTful conventions and returns JSON responses.

# Configuration
Go to the `src/main/resources/` and edit the `application.properties` to configure MySQL Database name and credentials.

## Running the Application
To run the Quarkus CRUD API, execute the following command:

if maven installed:
```mvn compile quarkus:dev```
else: 
```./mvnw compile quarkus:dev```

Have fun coding!


