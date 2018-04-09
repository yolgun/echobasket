A starting template, examples and so on

- Spring Boot 2
- Lombok
  * Enable Annotation Processing. At IntelliJ -> "Settings > Build > Compiler > Annotation Processors"
  * Download Lombok plugin for auto-completion at IntelliJ
  * Provides @Value, @Data, @Slf4j
- Swagger 2
  * Creates API UI at /swagger endpoint
- Versions-maven plugin to report old dependencies
```
./mvnw versions:display-dependency-updates
```   
- Aspectj 
  * Also a logging aspect that logs every method with parameters and result at the controller package
- Spring Boot Actuator
  * at */actuator* endpoint. Everything exposed for dev.  
# Build
```
./mvnw spring-boot:run -pl echo
```
or
```
./mvnw clean verify
java -jar echo/target/echo-0.0.1-SNAPSHOT.jar
```

