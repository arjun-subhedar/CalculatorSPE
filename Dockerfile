FROM openjdk:21

COPY ./target/cal-1.0.0-jar-with-dependencies.jar ./

WORKDIR ./

CMD ["java", "-jar", "cal-1.0.0-jar-with-dependencies.jar"]