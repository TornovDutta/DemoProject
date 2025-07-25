FROM openjdk:22-jdk
COPY target/DemoProject.jar /students-app.jar
ENTRYPOINT ["java", "-jar", "/students-app.jar"]
