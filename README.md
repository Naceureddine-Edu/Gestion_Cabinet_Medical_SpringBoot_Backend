# Gestion_Cabinet_Medical_SpringBoot_Backend

## Project structure

The maven project is mostly standard:

    [PROJECT_NAME]/
     |_ src
     |  |_ main 
     |  |  |_ java 
     |  |  |_ resources 
     |  |_ test 
     |  |  |_ java 
     |  |  |_ resources 
     |_ .gitignore
     |_ pom.xml
     |_ README.md


## Sonarqube Docker Compose Installation

At the root of your project, please run

```sh
docker-compose -f SonarQube.yml up -d
```

Change sonarqube admin password

```sh
curl -u admin:admin -X POST "http://localhost:9000/api/users/change_password?login=admin&previousPassword=admin&password=Admin"
```

Create project in sonarqube with this project key 

```sh
Doclick
```

## Using Sonar

Edit these properties in json files sonar-project.properties.

```sh
sonar.host.url=http://localhost:9000
sonar.login=admin
sonar.password=Admin
```


At the root of your project, please run

```sh
 sonar-scanner.bat -D"sonar.projectKey=Doclick" -D"sonar.sources=." -D"sonar.host.url=http://localhost:9000"
```

Once the analysis completes, it will be available on the Sonar dashboard, which by default is available on http://localhost:9000.

<img src="https://github.com/susimsek/spring-boot-sonarqube-measurement-example/blob/main/images/sonarqube-dashboard.png" alt="Spring Boot Sonarqube Dashboard Example" width="100%" height="100%"/>


For Swagger-UI, it will be available on the Swagger Dashboard, which by default is available on http://localhost:8080/swagger-ui.html.
And api-docs on http://localhost:8080/v2/api-docs


## Prerequisites

* Java 8
* Maven 3.8+
* Docker 20.10.8+
* Docker Compose 1.29+
* Sonarqube 8.9.2-community
* Swagger 2.9.2
 
