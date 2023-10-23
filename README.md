A simple docker compose that runs two containers that communicates one with another.

When accessing localhost:8080, it should be responded by *Consumer*, that should make another request to *Provider* on localhost:8081, that should answer "Hello!". Then, *Consumer* should return *Provider*'s response (Hello!).

Provider - a Spring Boot application with a get endpoint mapped on "/" using the 8080 port that just returns "Hello!"

* Dockerfile - based on Amazon's OpenJDK distribution, creates a /home/app directory inside the container, copies the jar file from host to the newly created /home/app folder inside the container and run the Java command that executes the jar file
* HelloController.java - the only file that was modified after downloading the starter Spring project from https://start.spring.io/ with Spring WEB dependency.

Consumer - a Spring Boot application with a get endpoint mapped on "/" using the 8080 pot that calls the provider endpoint and returns the result

* Dockerfile - Similar to Provider's Dockerfile
* ConsumerApplication - added RestTemplate bean
* ConsumerController - very similar to HelloController.java, but uses RestTemplate bean to call Provider's endpoint and returns it

compose.yml - a YAML file for use in docker-compose that runs both images, letting them communicate with one another
