FROM adoptopenjdk/openjdk11-openj9

ADD target/lib /app/lib
ADD target/quarkus-openwhisk-action-1.0.0-SNAPSHOT-runner.jar /app/lib/
#ADD quarkus-libs.jar /app/
ADD start-quarkus.sh /app/
EXPOSE 8080

WORKDIR /app
CMD ./start-quarkus.sh
