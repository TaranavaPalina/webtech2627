# Mitarbeiterverwaltung – Backend

Webanwendung zur Verwaltung von Mitarbeitenden eines Unternehmens.
Nutzer können Mitarbeitende anlegen, anzeigen, bearbeiten und löschen.

Projekt im Modul Webtechnologien, HTW Berlin, WiSe 2026/27.

**Tech-Stack:** Java 25, Spring Boot, Gradle, Vue.js, PostgreSQL, Render

Frontend: https://github.com/TaranavaPalina/webtech2627-frontend

## Live auf Render

- Backend-API: https://webtech2627-backend.onrender.com/api/v1/employees
- Frontend: https://webtech2627-frontend.onrender.com

Hinweis: Die kostenlose Render-Instanz schläft bei Inaktivität ein. Die erste Anfrage kann daher bis zu einer Minute dauern.

## Lokal starten

1. Projekt in IntelliJ öffnen
2. `DemoApplication` starten
3. Im Browser aufrufen: http://localhost:8080/api/v1/employees

## API

| Methode | Route               | Beschreibung                    |
|---------|---------------------|---------------------------------|
| GET     | `/api/v1/employees` | Liste aller Mitarbeitenden      |

## Deployment

Render baut das Backend mit dem `Dockerfile` im Projektordner.
