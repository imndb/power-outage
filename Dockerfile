# Use Java 17 LTS (Temurin)
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/*.jar power-outage.jar
ENTRYPOINT ["java", "-jar", "power-outage.jar"]