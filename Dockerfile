FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app
COPY src /app/src

WORKDIR /app
copy pom.xml .
RUN mvn clean install -DskipTests

FROM eclipse-temurin:21-jre-alpine

COPY --from=build /app/target/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]