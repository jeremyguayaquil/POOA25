# FuturoTech - Registro de Marcaciones

Aplicación de escritorio en JavaFX con MySQL 5.7 para registrar entrada/salida de empleados.

## Tecnologías
- Java 17
- JavaFX 21
- Maven
- MySQL 5.7 (Docker)
- JDBC

## Instalación
1. Construir y levantar MySQL con Docker:
```bash
docker build -t mysql-futurotech .
docker run --name mysql-futurotech -p 3306:3306 -d mysql-futurotech
```
2. Ejecutar la aplicación:
```bash
mvn javafx:run
```

## Funcionalidades
- Registro de entrada/salida con confirmación.
- Guardado en MySQL.
- Visualización en tabla (TableView).
