
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/elastic-boot.jar elastic-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "elastic-boot.jar"]

