Time Converter Microservices
This project consists of two microservices designed to handle time-related operations.

Microservice 1: Time Converter
Overview
The Time Converter microservice is responsible for converting time in the 24-hour clock format into words.

Technologies Used
Java 8
Spring Boot
Maven
Swagger
RestTemplate

Project Structure
plaintext
Copy code
|-- src
|   |-- main
|       |-- java
|           |-- com.time.converter.converter
|               |-- controller
|               |   |-- TimeController.java
|               |-- service
|               |   |-- TimeService.java
|               |-- config
|                   |-- AppConfig.java
|                   |-- OpenApiConfig.java
|-- pom.xml
|-- README.md
Build and Run Instructions
Clone the repository.
Navigate to the time-converter directory.
Run the command: mvn clean install
Start the application using: mvn spring-boot:run
Access Swagger UI at http://localhost:8081/swagger-ui.html
API Endpoint
Convert Time to Words:
URL: http://localhost:8081/time/convert?time=11:25
Method: GET
Example Response: "It's eleven twenty five"

Microservice 2: Midday/Midnight Checker
Overview
The Midday/Midnight Checker microservice checks if the given time corresponds to midday or midnight.

Technologies Used
Java 8
Spring Boot
Maven
Project Structure
plaintext
Copy code
|-- src
|   |-- main
|       |-- java
|           |-- com.time.midaymidnight.midaymidnight
|               |-- controller
|               |   |-- TimeController.java
|               |-- service
|                   |-- TimeService.java
|-- pom.xml
|-- README.md
Build and Run Instructions
Clone the repository.
Navigate to the midaymidnight-checker directory.
Run the command: mvn clean install
Access Swagger UI at http://localhost:8082/swagger-ui.html
Start the application using: mvn spring-boot:run
API Endpoint
Get Time Information:
URL: http://localhost:8082/time/15:30
Method: GET
Example Response: "It's neither Midday nor Midnight"
