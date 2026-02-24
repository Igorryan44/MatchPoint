FROM maven:3.9.12-eclipse-temurin-21 AS build

WORKDIR /app
COPY src /app/src

WORKDIR /app
copy pom.xml .
RUN mvn clean install

FROM eclipse-temurin:21-jre-alpine

COPY --from=build /app/target/matchpoint-1.0.0.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]