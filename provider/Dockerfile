FROM amazoncorretto:17

RUN mkdir /home/app

COPY target/provider-0.0.1-SNAPSHOT.jar /home/app

CMD ["java", "-jar", "/home/app/provider-0.0.1-SNAPSHOT.jar"]