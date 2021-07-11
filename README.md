# Spring Boot (CRUD) AWS Deployment (Example)

Studies on how to create a web application and deployment on AWS (Simple example)


# Project Initializr:

Spring Initializr: https://start.spring.io

## Dependencies
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- MySql Driver 

## Client App
- Postman

## Project Info DB
- Create a database named: db_aws
- Confirgure your application.properties for connection.

```
spring.datasource.url=jdbc:mysql://localhost:3306/db_aws?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=root
spring.datasource.password=root

#Hibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect

#Hibernate auto dll
spring.jpa.hibernate.ddl-auto=update

#logging.level.org.hibernate.SQL=debug

```


->>under development
