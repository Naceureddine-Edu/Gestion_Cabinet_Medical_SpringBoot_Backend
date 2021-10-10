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


## Compile

To compile the full project, please execute the following command :

```bash
    $> mvn clean install
```

## Execute the program

- **On any platform (Linux, MacOS, Windows)**

to execute the compiled jar, please execute the command bellow :

```bash
    $> mvn exec:java
```

or :

```bash
    $> java -jar ${project.name}-${project.version}-jar-with-dependencies.jar
```

## Publish as a Maven Repo

To publish to the right maven repo, just execute the following lines:

```bash
    $> mvn clean site deploy
```


