#!/bin/bash

# Ejecutar Maven para limpiar y empaquetar el proyecto
mvn clean package

# Asegúrate de que no haya contenedores en ejecución antes de levantar los nuevos
sudo docker compose down

# Levantar los servicios con Docker Compose
sudo docker compose build

sudo docker compose up -d
