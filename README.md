# Flight Service

This repository contains a very simple application 
(without any unit tests) 
that provides a REST interface to get / update flight information 
and stores all flight information in a (in-memory) database.

We use this project as a starting point 
to create and refactor to a Clean-/Onion-style Architecture.

## How to build and run the flight service 

### Required technologies
To run the application, the following should be installed:
* [git](https://git-scm.com/downloads)
* JDK (e.g., [AdoptOpenJDK](https://adoptopenjdk.net/))
* Optionally, [Apache Maven](https://maven.apache.org/install.html)

### Run from source
In the command line, run the following:

```shell
git clone https://github.com/fortiss-cce/flight-service.git
cd flight-service
./mvnw spring-boot:run
```

## API documentation
To see and try out the API, go to 
http://localhost:8080/swagger-ui/

## Database documentation
To have a look into the database, go to 
http://localhost:8080/h2-console/

Login using the following config:
  
| Field       | Value                  |
|-------------|------------------------|
| `JDBC URL`  | `jdbc:h2:mem:flightdb` |
| `User name` | `sa`                   |
| `Password`  | can be left empty      |

The config and initial data can be edited in 
`application.yml` and `data.sql` 
inside `src/main/resources/`.