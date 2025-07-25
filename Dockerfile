FROM openjdk:22-jdk
ADD target/DemoProject.jar DemoProject.jar

ENTRYPOINT ["java", "-jar","/students-app.jar"]