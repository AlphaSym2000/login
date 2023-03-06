# # Build stage
# FROM maven:3.8.4-jdk-17-slim AS build
# WORKDIR /app
# COPY pom.xml .
# RUN mvn dependency:go-offline
# COPY src ./src
# RUN mvn package -DskipTests

# # Package stage
# FROM openjdk:17-jdk-alpine
# WORKDIR /app
# COPY --from=build /app/target/login-0.0.1-SNAPSHOT.jar .
# EXPOSE 8080
# CMD ["java", "-jar", "login-0.0.1-SNAPSHOT.jar"]

#
# Build stage
#
FROM maven:3.8.2-jdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/login-0.0.1-SNAPSHOT.jar login.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","login.jar"]
