FROM gradle:jdk14

ENV PROJECT_DIR=/opt/project
WORKDIR $PROJECT_DIR

ADD ./build.gradle.kts $PROJECT_DIR
ADD ./src/ $PROJECT_DIR/src
RUN ./gradlew build


FROM openjdk:14

ENV PROJECT_DIR=/opt/project
WORKDIR $PROJECT_DIR

ADD ./app.jar /app.jar

EXPOSE 8000

CMD ["java", "-jar", "/app.jar"]
