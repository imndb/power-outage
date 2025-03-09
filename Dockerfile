# Use Java 23 LTS (Temurin)
FROM eclipse-temurin:23-jdk
WORKDIR /app
COPY target/*.jar power-outage.jar
ENTRYPOINT ["java", "-jar", "power-outage.jar"]