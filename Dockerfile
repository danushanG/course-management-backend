# Stage 1: Build JAR
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run JAR
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy built JAR from build stage
COPY --from=build /app/target/course-management-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Railway will assign dynamically)
EXPOSE 8080

# Run Spring Boot JAR
CMD ["java", "-jar", "app.jar"]
