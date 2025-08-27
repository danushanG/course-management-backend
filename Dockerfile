# Stage 1: Build the JAR with Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR with JDK
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expose port 8081 (Spring Boot app default in your case)
EXPOSE 8081

# Run Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
