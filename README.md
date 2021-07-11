# Spring Boot (CRUD) AWS Deployment (Example)

Studies on how to create a web application and deployment on AWS (Simple example)


# Project Initializr:

Spring Initializr: https://start.spring.io

## Dependencies
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- MySql Driver 


- AWS RDS
- AWS Elastic Beanstalk

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


## APIS


GET: All Users
/api/users

GET: get User by Id
/api/users/{id}

POST: Create User
/api/users
```
{
    "firstName" : "Carlos",
    "lastName" : "Junior",
    "email" : "carlosjunior@carlosjunior.com.br"
}
```

PUT: Update User
/api/users/{id}
```
{
    "id":1,
    "firstName" : "Charles",
    "lastName" : "Jr",
    "email" : "contato@carlosjunior.com.br"
}
```

DELETE: Delete User by Id
/api/users/{id}



## CONF: AWS (RDS) 

- Link Br: https://aws.amazon.com/pt/rds/

PT-Br:

Acesse sua conta AWS Console.

Dentro do AWS Console, selecione na sessão Databases, a opção RDS. 

Depois clique em Criar database.

Depois clique em Create Standard.

Depois na sessão banco de dados, escolha MySql.

Depois na sessão modelo, escolha a opção Nivel Gratuito/Free.

Depois na sessão Configuração, preencha os campos correspondentes para criação de sua conexão.(Usuario e senha).

Depois nas sessões Instância, armazenamento e durabilidade deixar como padrão.

Depois na sessão Conectividade, na opção Acesso Público escolher SIM.

Os demais deixar como padrão e clique em criar banco de dados.

Depois aguardar até criar o banco de dados no AWS.

Depois coletar os dados de acesso e atualizar o application.properties para trocar a conexão de Local para AWS.

Depois configurar Inbound Roles para configurar seu IP. 

Depois configurar seu MySQLWorkbench e criar do banco de dados db_aws.

Depois reconfigurar o application.properties (Springboot) para conectar no AWS RDS.



EN: 

Sign in to your AWS Console account.

Within the AWS Console, select in the Databases session, the RDS option.

Then click on Create database.

Then click on Create Standard.

Then in the database session, choose MySql.

Afterwards in the model session, choose the option Level Free/Free.

Then in the Configuration section, fill in the corresponding fields to create your connection. (Username and password).

Then in the Instance, Storage and Durability sessions leave as default.

Then in the Connectivity section, in the Public Access option choose YES.

The others leave as default and click on create database.

Then wait until creating the database in AWS.

Then collect the access data and update the application.properties to switch the Local to AWS connection.

Then configure Inbound Roles to configure your IP.

Then configure your MySQLWorkbench and create db_aws database.

Then reconfigure application.properties (Springboot) to connect to AWS RDS




## Build Deploy

Execute o comando abaixo na pasta do seu projeto para criar o .JAR

```
mvn clean install
```

Será criado um .JAR na pasta target. Este arquivo você irá colocar no AWS Elastic Beanstalk.


## CONF: AWS Elastic Benastalk

PT-BR:
Acesse sua conta AWS, em serviços escolha a opção Elastic Benastalk.
Crie um novo app.
Escolha plataforma JAVA
Escolha a opção: Fazer upload do Código.  Selecione o seu arquivo .JAR que acabou de criar.
Clique no botão: Configurar mais opções. Será aberto mais sessões de configuração.
Na sessão Banco de dados, clique em editar. Adicione as configurações do banco de dados AWS RDS criado anteriormente e salve as informações.
Depois clique em Criar App. (Aguarde a criação do app.)

Ao término, será apresentado um Host com seu App na AWS. 

Agora é só utilizar/testar.



En:
Access your AWS account, under services choose the Elastic Benastalk option.
Create a new app.
Choose JAVA platform
Choose the option: Upload Code. Select your .JAR file you just created.
Click the button: Configure more options. More setup sessions will open.
In the Database session, click edit. Add the settings from the AWS RDS database created earlier and save the information.
Then click Create App. (Wait for the app to be created.)

Upon completion, you will be presented with a Host with your App on AWS.

Now just use/test.






Credits: Javaguide!