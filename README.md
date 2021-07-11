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



## AWS (RDS)

- Link Br: https://aws.amazon.com/pt/rds/

Acesse sua conta AWS Console.
Dentro do AWS Console, selecione na sessão Databases, a opção RDS. 
Depois clique em Criar database.
Depois clique em Create Standard.
Depois na sessão banco de dados, escolha MySql
Depois na sessão modelo, escolha a opção Nivel Gratuito/Free
Depois na sessão Configuração, preencha os campos correspondentes para criação de sua conexão.(Usuario e senha).
Depois nas sessões Instância, armazenamento e durabilidade deixar como padrão.
Depois na sessão Conectividade, na opção Acesso Público escolher SIM.
Os demais deixar como padrão e clique em criar banco de dados.

Depois aguardar até criar o banco de dados no AWS.
Depois coletar os dados de acesso e atualizar o application.properties para trocar a conexão de Local para AWS
Depois configurar Inbound Roles para configurar seu IP. 



Depois configurar seu MsSQLWorkbench e criar do banco de dados db_aws.
Depois reconfigurar o application.properties (Springboot) para 



->>under development
