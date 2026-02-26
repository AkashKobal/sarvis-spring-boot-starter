# Sarvis Spring Boot Starter

[![GitHub tag](https://img.shields.io/github/v/tag/AkashKobal/sarvis-spring-boot-starter)](https://github.com/AkashKobal/sarvis-spring-boot-starter/tags)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.AkashKobal/sarvis-spring-boot-starter)](https://central.sonatype.com/artifact/io.github.AkashKobal/sarvis-spring-boot-starter)
[![Java](https://img.shields.io/badge/Java-17+-blue)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3+-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/license-MIT-green)](LICENSE)

---

Sarvis Spring Boot Starter provides seamless integration with Sarvam AI in Spring Boot applications.

It automatically configures a ready-to-use `SarvisClient` bean, allowing developers to interact with Sarvam AI Chat Completions API with zero boilerplate configuration.

Sarvis acts as an abstraction layer over Sarvam AI, making integration clean, scalable, and production-ready.

---

## Features

- Auto-configured `SarvisClient` bean
- Zero boilerplate integration
- Spring Boot 3+ compatible
- Externalized configuration support
- Lightweight and production-ready
- Automatic RestTemplate configuration
- Clean and extensible architecture
- Maven Central distribution

---

## Installation

### Maven

Add dependency:

```xml
<dependency>
    <groupId>io.github.AkashKobal</groupId>
    <artifactId>sarvis-spring-boot-starter</artifactId>
    <version>0.0.1</version>
</dependency>
```

No additional repository configuration required.

---

## Configuration

application.yml

```yaml
sarvis:
  api-key: YOUR_SARVAM_API_KEY
  model: sarvam-m
```

application.properties

```
sarvis.api-key=YOUR_SARVAM_API_KEY
sarvis.model=sarvam-m
```

---

## Usage

Inject and use `SarvisClient`:

```java
import io.github.sarvislabs.client.SarvisClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    private final SarvisClient sarvisClient;

    public ChatController(SarvisClient sarvisClient) {
        this.sarvisClient = sarvisClient;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return sarvisClient.chat(message);
    }
}
```

---

## Example Request

```
GET http://localhost:8080/chat?message=Hello
```

Example Response:

```
Hello! How can I help you today?
```

---

## How It Works

Sarvis Spring Boot Starter automatically configures:

- SarvisClient
- SarvisProperties
- RestTemplate
- Spring Boot AutoConfiguration

No manual bean configuration required.

---

## Project Structure

```
sarvis-spring-boot-starter
│
├── client/
│   └── SarvisClient.java
│
├── config/
│   └── SarvisAutoConfiguration.java
│
├── properties/
│   └── SarvisProperties.java
│
├── dto/
│   ├── ChatRequest.java
│   └── ChatResponse.java
│
└── META-INF/spring/
    └── org.springframework.boot.autoconfigure.AutoConfiguration.imports
```

---

## Requirements

- Java 17+
- Spring Boot 3+

---

## Example Spring Boot Application

```java
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

---

## Maven Central

Artifact:

https://central.sonatype.com/artifact/io.github.AkashKobal/sarvis-spring-boot-starter

---

## Contributing

Contributions are welcome.

Please read:

- CONTRIBUTING.md
- CODE_OF_CONDUCT.md

Repository:

https://github.com/AkashKobal/sarvis-spring-boot-starter

---

## Security

Do not commit API keys.

Report vulnerabilities via:

https://github.com/AkashKobal/sarvis-spring-boot-starter/security

---

## License

MIT License

See LICENSE file.

---

## Author

Akash Kobal  
https://github.com/AkashKobal

---

## Version

Current version:

```
0.0.1
```

---

## Roadmap

Planned features:

- Streaming support
- Async support
- Retry support
- Timeout configuration
- WebClient support
- Observability support

---

## Support

Report issues:

https://github.com/AkashKobal/sarvis-spring-boot-starter/issues

---
