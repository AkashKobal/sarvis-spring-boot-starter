# Changelog

All notable changes to this project will be documented in this file.

The format is based on Keep a Changelog:
https://keepachangelog.com/en/1.1.0/

This project follows Semantic Versioning:
https://semver.org/

---

## [0.0.1] - 2026-02-24

### Added

- Initial release of Sarvis Spring Boot Starter
- Spring Boot auto-configuration via `SarvisAutoConfiguration`
- Automatic registration of `SarvisClient` bean
- Integration with Sarvam AI Chat Completions API
- External configuration support via:
  - `sarvis.api-key`
  - `sarvis.model`
  - `sarvis.base-url`
- Default base URL configuration (`https://api.sarvam.ai/v1`)
- DTO classes:
  - `ChatRequest`
  - `ChatResponse`
- Spring Boot 3 auto-configuration registration using:
  - `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports`
- REST client integration using Spring `RestTemplate`
- Maven Central publishing configuration
- Configuration properties binding using `@ConfigurationProperties`
- Clean starter structure aligned with Spring Boot standards

### Features

- Zero boilerplate integration with Sarvam AI
- Automatic dependency injection of `SarvisClient`
- Fully configurable using `application.yml` or `application.properties`
- Lightweight and minimal dependencies
- Production-ready starter architecture
- Clean separation between starter and consuming applications

### Security

- No API keys stored in source code
- Secure external configuration using Spring Boot configuration properties
- Environment variable support for secure API key usage

Example:

```yaml
sarvis:
  api-key: ${SARVIS_API_KEY}
```

---

## Planned

### [0.0.1]

### Added (Planned)

- Configurable timeout support
- Retry mechanism support
- Improved error handling
- Improved validation and response handling
- Logging integration

### Improved (Planned)

- Enhanced exception handling
- Improved configuration validation

---

### [0.1.0]

### Added (Planned)

- Streaming support
- Async client support
- Reactive support using Spring WebClient

---

### [1.0.0]

### Added (Planned)

- Stable production release
- Full Maven Central support
- Complete documentation
- Enterprise-grade stability and performance
- Extended configuration options

---

## Notes

This is the initial open-source release of Sarvis Spring Boot Starter.

Sarvis provides a clean abstraction layer over Sarvam AI, enabling seamless integration with Spring Boot applications.

Future releases will improve performance, stability, and feature coverage.
