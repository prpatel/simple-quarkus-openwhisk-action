#!/bin/bash

#java -jar /app/lib/quarkus-openwhisk-action-1.0.0-SNAPSHOT-runner.jar
java  -classpath "/app/lib/*" io.quarkus.runner.GeneratedMain

