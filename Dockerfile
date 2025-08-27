# Stage 1: Build the JAR with Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expose port (will be overridden by Railway’s $PORT)
EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
