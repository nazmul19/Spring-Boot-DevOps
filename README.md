# Spring-Boot-DevOps
SpringBoot DevOps out of the box.

Actuator Endpoints

HTTP Endpoints are enabled for accessing the various information about your application. The list of 15 endpoints that are currently supported by spring boot actuator module is:

    1) actuator: It is the default endpoint to list the available endpoints exposed to the user. It is enabled only when HATEOAS available in your classpath.
    2) autoconfig : Report on auto-configuration details.
    3) beans : This endpoint lists all the beans loaded by the application.
    4) configprops : This endpoint shows configuration properties used by your application.
    5) dump : Performs a thread dump.
    6) env : Exposes spring’s properties from the configurations.
    7) health : Health of the application.
    8) info : Displays application information like version, description, etc.
    9) metrics : Metrics about memory, heap, etc. for the currently running application
    10) mappings : Displays a list of all @RequestMapping paths.
    11) shutdown : This endpoint allows to shutdown the application. This is not enabled by default.
    12) trace : Displays trace information for the current application.
    13) logfile : Provides access to the configured log files (This feature supported since Spring Boot 1.3.0).
    14) flyway : This endpoint provides the details of any flyway database migrations have been applied (This feature supported since Spring Boot 1.3.0).
    15) liquibase : This endpoint provides the details of any liquibase database migrations have been applied (This feature supported since Spring Boot 1.3.0).
    
    In the above list, only few are enabled by default. Others are disabled by default for the security reasons. Developers can override the properties to enable them. We will explain the manual configurations in the subsequent sections.

#How to Run
    mvn spring-boot:run
