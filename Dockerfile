FROM amazoncorretto:17-al2-jdk

WORKDIR /docker-app

COPY ./build/libs/practice-0.0.1-SNAPSHOT.jar /docker-app/docker-practice.jar

CMD ["java", "-Duser.timezone=Asia/Seoul", "-jar", "docker-practice.jar"]