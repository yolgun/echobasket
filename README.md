A starting template, examples and so on

- Spring Boot 2
- Lombok
  * Enable Annotation Processing. At IntelliJ -> "Settings > Build > Compiler > Annotation Processors"
  * Download Lombok plugin for auto-completion at IntelliJ
  * Provides @Value, @Data, @Slf4j
- Swagger 2
  * Creates API UI at /swagger endpoint
- Versions-maven plugin to report old dependencies
- Aspectj 
  * Used for controller logging. Saves from adding too many log lines at the beginning
```
./mvnw versions:display-dependency-updates
```   

# Build
```
./mvnw spring-boot:run -pl echo
```
