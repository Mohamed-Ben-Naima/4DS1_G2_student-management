# Image de l'application student-management (Spring Boot, Java 17)
FROM eclipse-temurin:17-jre-alpine
LABEL maintainer="equipe-devops@esprit.tn"

WORKDIR /app

# Le nom du jar change avec la version (1.1-SNAPSHOT, 1.1.27, ...) :
# on copie "le" jar produit par Maven, quel que soit son nom
COPY target/*.jar app.jar

# Port défini dans application.properties (server.port=8089)
EXPOSE 8089

ENTRYPOINT ["java", "-jar", "app.jar"]
