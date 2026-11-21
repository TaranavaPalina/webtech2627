# Schritt 1: Projekt mit Gradle bauen (erzeugt die JAR-Datei)
FROM eclipse-temurin:25-jdk AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew && ./gradlew bootJar --no-daemon

# Schritt 2: nur die fertige JAR-Datei starten
FROM eclipse-temurin:25-jre
WORKDIR /app
COPY --from=build /app/build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
