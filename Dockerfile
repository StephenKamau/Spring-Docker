FROM openjdk:11
RUN adduser --system --group spring
USER spring:spring
COPY target/*.jar /app/spring-db.jar
ENTRYPOINT ["java","-jar","/app/spring-db.jar"]
# CMD ["java", "-Dspring.profiles.active=docker", "-jar", "spring-db.jar"]