FROM openjdk:17
WORKDIR /app
COPY ./target/convidado-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -jar convidado-0.0.1-SNAPSHOT.jar