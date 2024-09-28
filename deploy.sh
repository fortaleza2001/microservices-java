#!/bin/bash

# Ejecutar Maven para limpiar y empaquetar el proyecto
mvn clean package

# Asegúrate de que no haya contenedores en ejecución antes de levantar los nuevos
docker-compose down

# Levantar los servicios con Docker Compose
docker-compose up --build
