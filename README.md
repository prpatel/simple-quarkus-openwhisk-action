# Simple Openwhisk Quarkus Action

This project build a docker container and bundles a Quarkus app inside of it. See the commands below to see how to test/deploy this sample.

### Run in dev mode
mvn quarkus:dev

### Build the docker container

mvn package
docker build -t prpatel/quarkus-ow-demo .
docker run -i --rm -p 8080:8080 prpatel/quarkus-ow-demo

### Test the endpoint locally
curl -v -H "Content-type: application/json" -d "{\"name\":\"Hiya\"}" -X POST http://localhost:8080/init
curl -v -H "Content-type: application/json" -d "{\"name\":\"Hiya\"}" -X POST http://localhost:8080/run

### Push and test to IBM Cloud Functions

ibmcloud fn action create quarkowdirect --docker prpatel/quarkus-ow-demo:latest --web true

If you want to invoke it from the browser:
ibmcloud fn action get quarkowdirect --url

Invoke from command line:
ibmcloud fn action invoke quarkowdirect  --result
