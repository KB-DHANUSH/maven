# Helidon OCI Archetype Client using MP

This module demonstrates how to generate a Helidon Microprofile restful microservice-based client, using OpenApi tool, that communicates with a Helidon MP service endpoint.

1. Client-side source code will be generated using OpenApi tool based on an OpenApi specification document in the form
of [api.yaml](../spec/api.yaml) as an input. The generated source code will be located in 
target.generated-sources.client.src.main.java.group.client and will have the following components:
   * A microprofile rest client interface (that can be registered with CDI). Please check out
     [Microprofile Rest Client](https://helidon.io/docs/v2/#/mp/restclient/09_rest-client) for more
     information about this concept.
   * A Json-based request/response model.
2. The generated Microprofile rest client interface called target.generated-sources.client.src.main.java.group.client.api.GreetApi
then can be injected using `@RestClient` or initialized using `RestClientBuilder` by end user application along with generated model classes for the request/response.

## Generator Configuration
The generator configuration can be customized in [pom.xml](pom.xml). See [documentation](https://openapi-generator.tech/docs/generators/java) for detailed information on each option.

## System Requirements
1. JDK 11+ 
2. mvn 3.8.3+
3. Helidon 2.5.4+

## Build 
Just run

```bash
mvn clean install
```