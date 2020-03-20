# Aveti Tutorials
Enjoy tutorials to increase you skill
## Deploy Spring Boot App in docker
Steps
- Build jar with maven
`mvn package -DskipTests`
- Build docker image with docker-compose
`docker-compose build`
- Start the container
`docker-compose up -d --build`
- Stop the container
 `docker-compose down`

For more information
* Docker:  <https://www.docker.com/>
* Spring Boot: <https://spring.io/projects/spring-boot>
