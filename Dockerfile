FROM openjdk:17-slim
COPY ./build/libs/*T.jar app.jar
ENV profiles=docker
ENV dbUsername=root
ENV dbPassword=1234
ENV serverPort=3308
CMD ["java", "-jar", "-Dspring.profiles.active=${profiles}", "app.jar"]
EXPOSE 8080