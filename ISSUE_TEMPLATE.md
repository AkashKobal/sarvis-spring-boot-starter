# Issue Template

Thank you for reporting an issue. Please complete the sections below to help us investigate and resolve it efficiently.

---

## Issue Type

Select one:

- [ ] Bug Report
- [ ] Feature Request
- [ ] Documentation Issue
- [ ] Performance Issue
- [ ] Security Issue (report privately if sensitive)
- [ ] Dependency Issue
- [ ] Other

---

## Description

Provide a clear and concise description of the issue.

Example:

```
SarvisClient throws IllegalStateException when API response is empty.
```

---

## Steps to Reproduce

Provide step-by-step instructions to reproduce the issue.

Example:

```
1. Add sarvis-spring-boot-starter dependency
2. Configure sarvis.api-key
3. Call sarvisClient.chat("Hello")
4. Observe error
```

---

## Expected Behavior

Describe what you expected to happen.

Example:

```
Expected valid AI response from Sarvam API.
```

---

## Actual Behavior

Describe what actually happened.

Example:

```
Application throws IllegalStateException: Invalid response from Sarvam API
```

---

## Screenshots / Logs

If applicable, add logs, stack traces, or screenshots.

Example:

```
Paste stack trace or logs here
```

---

## Environment

Please complete the following information:

- OS: (Windows / Linux / macOS)
- Java Version:
- Spring Boot Version:
- Sarvis Starter Version:
- Maven / Gradle Version:

Example:

```
OS: Windows 11
Java: 17
Spring Boot: 3.5.11
Sarvis Starter: 0.0.2
Maven: 3.9.6
```

---

## Configuration

Provide relevant configuration (remove secrets):

application.yml

```yaml
sarvis:
  api-key: ***
  model: sarvam-m
```

---

## Dependency Configuration

Example:

```xml
<dependency>
    <groupId>io.github.AkashKobal</groupId>
    <artifactId>sarvis-spring-boot-starter</artifactId>
    <version>0.0.2</version>
</dependency>
```

---

## Possible Solution (Optional)

If you have suggestions for fixing the issue, describe them here.

---

## Additional Context

Add any other relevant information, including:

- Related issues
- Workarounds
- Root cause analysis (if known)

---

## Checklist

Before submitting, confirm:

- [ ] I have checked existing issues
- [ ] I have removed sensitive information
- [ ] I have provided complete reproduction steps
- [ ] I have included environment details
- [ ] This issue is reproducible

---

## Security Notice

If this issue involves a security vulnerability, please report it privately instead:

https://github.com/AkashKobal/sarvis-spring-boot-starter/security/advisories

---

Thank you for helping improve Sarvis Spring Boot Starter.
