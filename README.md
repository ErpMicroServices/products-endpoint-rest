# products-endpoint-rest

 A restful HATEOAS based API for handling data about products and services. The products and services may be offered by a company, or used by a company.


#Build & Push to docker
 
    ./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=erpmicroservices/products_api_rest
    
    docker push erpmicroservices/products_api_rest:latest
