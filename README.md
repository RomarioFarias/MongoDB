mongo
Spring Boot CRUD demo is demonstrating how to implement simple CRUD operations with a Cliente entity.

What have inside

This project is based on the Spring Boot project and uses these bundled technologies:

Maven
Spring boot
Spring Core
Spring Data (Hibernate & MongoDb)
Spring MVC (Tomcat)
JDK 11
Junit

Installation
# Run the project through the IDE and head out to http://localhost:8080

# The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

# Clone the repository and access the directory..
HTTPS: git clone https://github.com/RomarioFarias/MongoDB.git
# Download dependencies (the -DskipTests parameter skips the tests)
mvn install -DskipTests

# Run the application
mvn spring-boot:run

# Para rodar os testes
$ mvn test

Database configuration
Create a MongoDB database with the name springbootdb and add the credentials to /resources/application.properties.
The default ones are :

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=users-db
spring.data.mongodb.username=root
spring.data.mongodb.password=root

Contributing
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

Fork the Project
Create your Feature Branch (git checkout -b feature/teste)
Commit your Changes (git commit -m 'Add some teste')
Push to the Branch (git push origin feature/teste)
Open a Pull Request
