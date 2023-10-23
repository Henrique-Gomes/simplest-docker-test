FROM amazoncorretto:17

RUN mkdir /home/app

COPY target/consumer-0.0.1-SNAPSHOT.jar /home/app

CMD ["java", "-jar", "/home/app/consumer-0.0.1-SNAPSHOT.jar"]