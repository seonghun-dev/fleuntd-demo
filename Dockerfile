FROM openjdk:21-jdk-slim

WORKDIR /app

COPY build.gradle settings.gradle /app/
COPY src /app/src

COPY gradle /app/gradle
COPY gradlew /app/
COPY gradlew.bat /app/

RUN ./gradlew build --no-daemon

CMD ["java", "-jar", "/app/build/libs/demo1-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
