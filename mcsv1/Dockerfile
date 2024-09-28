# Usa una imagen base de Java
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo
WORKDIR /app

# Copia el JAR del microservicio al contenedor
COPY target/mcsv1-1.0.0.jar /app/microservicio.jar

# Expone el puerto 8080 en el contenedor
EXPOSE 8080

# Ejecuta el JAR cuando se levanta el contenedor
ENTRYPOINT ["java", "-jar", "/app/microservicio.jar"]
