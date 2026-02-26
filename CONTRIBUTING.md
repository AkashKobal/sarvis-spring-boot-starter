# Contributing to Sarvis Spring Boot Starter

Thank you for your interest in contributing to Sarvis Spring Boot Starter. Contributions help improve the project and are highly appreciated.

---

## Table of Contents

- How to Contribute
- Development Setup
- Building Locally
- Using the Starter Locally
- Creating a Branch
- Making Changes
- Pull Request Process
- Pull Request Requirements
- Coding Guidelines
- Commit Message Format
- Reporting Issues
- Feature Requests
- Security Guidelines
- Code Review Process
- Questions

---

## How to Contribute

You can contribute in several ways:

- Fix bugs
- Improve documentation
- Add new features
- Improve performance
- Suggest enhancements
- Report issues
- Improve test coverage

---

## Development Setup

### Prerequisites

Make sure you have the following installed:

- Java 17 or higher
- Maven 3.8 or higher
- Git
- IDE (recommended: IntelliJ IDEA)

---

### Clone the Repository

```bash
git clone https://github.com/AkashKobal/sarvis-spring-boot-starter.git
cd sarvis-spring-boot-starter
```

---

## Building Locally

Build and install the starter into your local Maven repository:

```bash
mvn clean install
```

This will:

- Compile the project
- Run tests
- Install the starter locally

Installed location:

```
~/.m2/repository/io/github/AkashKobal/sarvis-spring-boot-starter/
```

---

## Using the Starter Locally

After installing locally, you can use the starter in another Spring Boot project.

Example dependency:

```xml
<dependency>
  <groupId>io.github.AkashKobal</groupId>
  <artifactId>sarvis-spring-boot-starter</artifactId>
  <version>0.0.1</version>
</dependency>
```

Example configuration:

```yaml
sarvis:
  api-key: YOUR_API_KEY
  model: sarvam-m
```

---

## Creating a Branch

Always create a new branch before making changes:

```bash
git checkout -b feature/your-feature-name
```

Examples:

```
feature/add-timeout-support
feature/add-streaming-support
fix/null-response-handling
docs/update-readme
refactor/improve-client-structure
```

---

## Making Changes

Please follow these guidelines:

- Write clean and readable code
- Follow existing project structure
- Keep changes focused and minimal
- Avoid unrelated changes
- Add comments when necessary
- Do not commit compiled files
- Do not include secrets or API keys

---

## Pull Request Process

1. Fork the repository

2. Clone your fork

```bash
git clone https://github.com/AkashKobal/sarvis-spring-boot-starter.git
```

3. Create a branch

```bash
git checkout -b feature/your-feature-name
```

4. Make your changes

5. Commit your changes

```bash
git commit -m "Add: description of your change"
```

6. Push your branch

```bash
git push origin feature/your-feature-name
```

7. Open a Pull Request

---

## Pull Request Requirements

Your pull request must:

- Compile successfully (`mvn clean install`)
- Not break existing functionality
- Follow coding guidelines
- Include clear description
- Be focused on one change
- Not include secrets

---

## Coding Guidelines

### Java Guidelines

- Use Java 17+
- Follow standard naming conventions
- Use constructor injection
- Avoid hardcoded values
- Follow SOLID principles
- Write clean and maintainable code

Example:

```java
public class SarvisClient {

    private final SarvisProperties properties;

    public SarvisClient(SarvisProperties properties) {
        this.properties = properties;
    }

}
```

---

### Spring Boot Starter Guidelines

- Use proper auto-configuration
- Use `@ConfigurationProperties`
- Register auto-configuration in:

```
META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
```

- Keep starter lightweight
- Avoid unnecessary dependencies
- Do NOT include `@SpringBootApplication`

---

## Commit Message Format

Format:

```
Type: Description
```

Examples:

```
Add: configurable timeout support
Fix: null response handling
Update: improve error handling
Docs: update README
Refactor: improve client structure
```

Types:

- Add
- Fix
- Update
- Docs
- Refactor
- Test
- Build

---

## Reporting Issues

Before creating an issue, check existing issues.

Include:

- Clear description
- Steps to reproduce
- Expected behavior
- Actual behavior
- Environment details

Example:

```
Java: 17
Spring Boot: 3.5.11
Starter: 0.0.2
Maven: 3.9.6
```

---

## Feature Requests

Feature requests are welcome.

Include:

- Problem description
- Proposed solution
- Use case
- Benefits

---

## Security Guidelines

DO NOT include:

- API keys
- Tokens
- Passwords
- Secrets

Use environment variables:

```yaml
sarvis:
  api-key: ${SARVIS_API_KEY}
```

If you find a security issue, report privately:

https://github.com/AkashKobal/sarvis-spring-boot-starter/security/advisories

---

## Code Review Process

Maintainers will review pull requests and may:

- Approve
- Request changes
- Suggest improvements

Once approved, the pull request will be merged.

---

## Questions

If you have questions, open an issue:

https://github.com/AkashKobal/sarvis-spring-boot-starter/issues

---

## Thank You

Thank you for contributing to Sarvis Spring Boot Starter.
Your contributions help improve the ecosystem for everyone.
