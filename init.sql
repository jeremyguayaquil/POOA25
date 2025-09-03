CREATE DATABASE IF NOT EXISTS futurtech;
USE futurtech;

CREATE TABLE IF NOT EXISTS marcaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tipo_marcacion ENUM('Entrada', 'Salida') NOT NULL,
    fecha_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
