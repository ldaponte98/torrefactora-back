# Getting Started
## Steps for run in localhost
### 1. Execute mvn package
### 2. Run MySQL
### 2. Run project


## Steps for run with docker
### 1. Execute mvn package
### 2. Execute mvn install for generate the jar
### 3. Run MySQL
### 4. Execute docker build -t "torrefactora-docker" .
### 5. Execute docker run --name torrefactora-docker -p 8080:8080 torrefactora-docker:latest

## Api documentation project
http://localhost:8080/swagger-ui.html

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/#build-image)

