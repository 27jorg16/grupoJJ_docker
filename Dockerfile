# Utilizar imagen de jdk 21
FROM eclipse-temurin:21-jdk-alpine

# Crear directorio para la aplicación
VOLUME /tmp

# Argumento para especificar el archivo JAR
ARG JAR_FILE=target/grupoJJ-docker-0.0.1-SNAPSHOT.jar

# Copiar el JAR al contenedor
ADD ${JAR_FILE} app.jar

# Exponer el puerto que utilizará la aplicación
EXPOSE 8022

# Ejecutar el archivo JAR cuando inicie el contenedor
ENTRYPOINT ["java", "-jar", "/app.jar"]
