# OpenJDK distribution backed by Amazon
FROM amazoncorretto:17

# Creates a new folder inside the container
RUN mkdir /home/app

# Copies the compiled application from the host machine to the new folder inside the container
COPY target/provider-0.0.1-SNAPSHOT.jar /home/app

# Executes the Java command to run the application
CMD ["java", "-jar", "/home/app/provider-0.0.1-SNAPSHOT.jar"]