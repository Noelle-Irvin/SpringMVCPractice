FROM openjdk:8-jre-alpine3.7
COPY /target/students-0.0.1-SNAPSHOT.jar /home/live-demo-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/home/live-demo-0.0.1-SNAPSHOT.jar"] 