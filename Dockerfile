# Use Java 21 LTS (Temurin)
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/*.jar power-outage.jar
ENTRYPOINT ["java", "-jar", "power-outage.jar"]