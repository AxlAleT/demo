# Spring Boot Project - "Hello Spring"

This project is a basic application developed with Spring Boot that exposes a REST endpoint to return a welcome message.

## Prerequisites

Before running this project, ensure that you have installed and configured the following tools:

- **Java Development Kit (JDK)**: OpenJDK 21.0.6
- **Apache Maven**: 3.8.8
- **Git**: For version control and repository management.



## Installation and Configuration

1. **Verify JDK and Maven installation:**

   ```sh
   java -version
   mvn -version
   ```

   Ensure both tools are correctly installed and configured in the environment variables.

2. **Clone the project repository:**

   ```sh
   git clone <REPOSITORY_URL>
   cd demo
   ```

3. **Build the project using Maven:**

   ```sh
   mvn clean install
   ```

4. **Run the Spring Boot application:**

   ```sh
   mvn spring-boot:run
   ```

## Available Endpoint

Once running, the application exposes the following endpoint:

- **GET** `http://localhost:8080/`
  - Expected response:
    ```json
    <html><head></head><body><h1>¡Hola Spring!</h1></body></html>
    ```

You can test the endpoint by accessing it through a browser or using cURL:

```
curl -X GET http://localhost:8080/
```

Alternatively, you can test it using Postman by sending a GET request to `http://localhost:8080/hello`.

## Project Structure

The project follows the standard structure of a Spring Boot project generated with Spring Initializr:

```
<project_name>/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java
│   │   │   ├── controllers/
│   │   │   │   ├── HolaController.java
│   │   ├── resources/
│   │   │   ├── application.properties
├── pom.xml
├── README.md
```
