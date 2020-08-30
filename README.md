# membership
This repository was cloned from https://github.com/metflix/membership with following extensions:
- Divided components for easily understand each responsibility
- Added unit tests by using Mocks

<br>


## How to run this service

### 1) CUI
1. Run `./mvnw clean package` and `target/membership-0.0.1-SNAPSHOT.jar` will be created
2. Run `java -jar target/membership-0.0.1-SNAPSHOT.jar`

<br>

### 2) IDE (e.g. IntelliJ IDEA)
Run [src/main/java/com/metflix/MembershipApplication.java](https://github.com/hageyahhoo/membership/blob/master/src/main/java/com/metflix/MembershipApplication.java)

<br>


## How to run tests
Run `./mvnw clean build`

<br>


## How to run this service as a Docker container
1. Run `docker build -t membership:0.0.1 .`
2. Run `docker run -d -p 4444:4444 membership:0.0.1`
3. Access to `http://localhost:4444/api/members/making`
4. Run `docker stop <container_id>`
