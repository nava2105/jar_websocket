# jar_websocket

## Table of Contents
1. [General Info](#general-info)
2. [Technologies](#technologies)
3. [Installation](#installation)
4. [Usage](#usage)

## General Info
***  
This project is a basic **Spring Boot WebSocket** application that sends a JSON message to a client when a WebSocket connection is established. Additionally, it includes an HTTP controller that serves a static HTML page where the WebSocket message can be received in real-time.

- **WebSocket Endpoint**:
  - Path: `/ws/hello`
  - Message: `{"message": "Hello World from WebSocket in Java"}`

- **HTTP Endpoint**:
  - Path: `/`
  - Response: Serves a basic HTML page that connects to the WebSocket server.

## Technologies
***  
Technologies used in this project:
- [Java](https://www.oracle.com/java/): Version 17 or higher
- [Spring Boot](https://spring.io/projects/spring-boot): Version 2.x
- [WebSocket API](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html): Spring WebSocket
- [Maven](https://maven.apache.org): Build tool

## Installation
***  
Follow these steps to install and run the project: 
### Via GitHub
Ensure you have the following tools installed:
- Java 17 or higher
- Maven  
```
java -version
mvn --version
```
Copy the repository
```
git clone https://github.com/nava2105/jar_websocket.git
```
Enter the directory
```
cd ../jar_websocket
```
Compile the project directly form mvn
```
mvn spring-boot:run
```
Open a browser and enter to
[http://localhost:8080](http://localhost:8080)
### Via Docker-hub
Pull the image from Docker-hub
```
docker pull na4va4/jar_websocket
```
Start a container from the image
```
docker run -p 8080:8080 na4va4/jar_websocket
```
Open a browser and enter to
[http://localhost:8080](http://localhost:8080)