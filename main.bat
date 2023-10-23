cd consumer
mvnw package
docker build -t consumer:0.0.1 .

cd ../provider
mvnw package
docker build -t provider:0.0.1 .

cd ..
docker-compose -f compose.yml up