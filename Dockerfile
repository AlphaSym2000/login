#
# Build stage
#
FROM maven:3.8.4-jdk-17-slim AS build-env
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-alpine
COPY --from=build-env /app/target/login-0.0.1-SNAPSHOT.jar .
# ENV PORT=8080
EXPOSE 8080
CMD ["java", "-jar", "login-0.0.1-SNAPSHOT.jar"]
