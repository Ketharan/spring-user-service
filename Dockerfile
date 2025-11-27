# ============================
# 1) Build Stage
# ============================
FROM maven:3.9.5-eclipse-temurin-17 AS build

WORKDIR /app

# Copy only the pom first to cache dependencies
COPY pom.xml .
RUN mvn -B dependency:resolve dependency:resolve-plugins

# Copy source code
COPY src ./src

# Build the application
RUN mvn -B clean package -DskipTests

# ============================
# 2) Runtime Stage
# ============================
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy built JAR
COPY --from=build /app/target/*.jar app.jar

# Expose port (match your application.properties)
EXPOSE 9090

# Run the app
ENTRYPOINT ["java","-jar","/app/app.jar"]
