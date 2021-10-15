FROM openjdk:8-jdk-alpine
#RUN mkdir /doclick-app
#ARG JAR_FILE=target/*.jar
#COPY . /doclick-app
#COPY ${JAR_FILE} /doclick-app/app.jar
#WORKDIR /doclick-app
COPY target/doclick.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080



#FROM maven:3.6.3-jdk-11 AS builder#
#WORKDIR /workdir/server
#COPY pom.xml /workdir/server/pom.xml
#RUN mvn dependency:go-offline

#COPY src /workdir/server/src
#RUN mvn install
#RUN mkdir  -p target/dependency
#WORKDIR /workdir/server/target/dependency
#RUN jar -xf ../*.jar

#ARG DEPENDENCY=/workdir/server/target/dependency
#COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
#ADD target/spring-boot-docker-maven.jar spring-boot-docker-maven.jar
#ENTRYPOINT ["java","-cp","app:app/lib/*","com.doclick.DoclickApplication"]
