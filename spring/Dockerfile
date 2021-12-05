### STAGE 1: Build ###
FROM maven:3.8.4-jdk-11-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -X -f pom.xml clean package

### STAGE 2: Run ###
FROM openjdk:11-oracle
COPY --from=build /workspace/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]