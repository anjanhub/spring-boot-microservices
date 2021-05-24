# spring-boot-microservices

This is a small application to depict the microservices architecture.

There are 6 microservices
1. User-service: which is responsible for creation and fetching information regarding the User. The user service also fetches the information of department by calling department service.
2. Department-service: which is responsible for creation and fetching information regarding the Department.
3. Service-registry: This service registry will maintain all the services and using this we get all the information regarding all the services that are connected to it.
4. Cloud-gateway: An API Gateway to process all the request and call other services based on url pattern
5. Hystrix-dashboard: for visualizing the how many requests are failing or successfully called. Also check if any services are not working
6. Cloud-config-server: creates a git repository and all the server config would be done there. (Create a repo for this purpose)
7. For distributed login and tracing the apis we are using Zepkin jar.
