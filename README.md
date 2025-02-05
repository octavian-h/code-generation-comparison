# code-generation-comparison

## Description

This will be a comparison between the following code generation libraries:

- [AutoValue](https://github.com/google/auto)
- [Immutables](https://immutables.github.io/)
- [Lombok](https://projectlombok.org/)

|                                | AutoValue                                         | Immutable                                              | Lombok                                          |
|--------------------------------|---------------------------------------------------|--------------------------------------------------------|-------------------------------------------------|
| Functioning                    | generates new classes from abstract classes       | generates new classes from abstract classes/interfaces | updates original class bytecode                 |
| Make immutable                 | @AutoValue                                        | @Value.Immutable                                       | @Value                                          |
| Add static constructor         | N/A                                               | @Value.Parameter                                       | @AllArgsConstructor(staticName=...)             |
| Add builder                    | @AutoValue.Builder on static abstract inner class | @Value.Immutable                                       | @Builder                                        |
| Default builder value          | N/A                                               | @Value.Default on a getter                             | @Builder.Default                                |
| Hide field value from toString | N/A                                               | @Value.Redacted                                        | @ToString.Exclude                               |
| Make private constructor       | N/A                                               | N/A                                                    | @NoArgsConstructor(access=AccessLevel. PRIVATE) |
| Add logging                    | N/A                                               | N/A                                                    | @Slf4j                                          |
| Add final Spring @Value        | N/A                                               | N/A                                                    | from lombok.config                              |
| Separate getters, setter etc.  | N/A                                               | N/A                                                    | @RequiredArgsConstructor @Getter @Setter etc.   |

## Requirements

To build and run this application you need to install the followings:

- JDK 21 or later
- Maven

On MacOS you can use these commands (assuming that [Homebrew](https://brew.sh/) is already installed:

```bash
brew install openjdk@21
brew install --ignore-dependencies maven
```

## Usage

Start the service using the following commands:

```bash
mvn clean package
java -jar ./target/service.jar
```

The available endpoints can be seen on [Swagger UI](http://127.0.0.1:8080/swagger-ui.html).