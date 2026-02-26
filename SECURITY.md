# Security Policy

## Supported Versions

The following versions of Sarvis Spring Boot Starter are currently supported with security updates:

| Version | Supported |
|---------|-----------|
| 0.0.2   | Yes       |

---

## Reporting a Vulnerability

If you discover a security vulnerability, please report it responsibly.

Do NOT create a public GitHub issue for security vulnerabilities.

Instead, report it privately via GitHub Security Advisories or contact the maintainer:

Repository:
https://github.com/AkashKobal/sarvis-spring-boot-starter/security/advisories

Maintainer:
https://github.com/AkashKobal

Include the following details:

- Description of the vulnerability
- Steps to reproduce
- Impact assessment
- Possible mitigation or fix (if available)
- Logs, stack traces, or screenshots (if applicable)

You will receive a response as soon as possible.

---

## Security Best Practices

When using Sarvis Spring Boot Starter:

### Do NOT hardcode API keys

❌ Incorrect:

```java
String apiKey = "your-secret-api-key";
```

✅ Correct:

```yaml
sarvis:
  api-key: ${SARVIS_API_KEY}
```

---

### Use environment variables

Linux / macOS:

```bash
export SARVIS_API_KEY=your-api-key
```

Windows:

```cmd
set SARVIS_API_KEY=your-api-key
```

---

### Do NOT commit secrets

Never commit:

- API keys
- Tokens
- Passwords
- Credentials
- `.env` files

Add to `.gitignore`:

```
.env
application-local.yml
application-secret.yml
```

---

## Secure Configuration Example

application.yml

```yaml
sarvis:
  api-key: ${SARVIS_API_KEY}
  model: sarvam-m
```

---

## Dependency Security

Keep dependencies up to date.

Check for vulnerabilities:

```bash
mvn dependency-check:check
```

or

```bash
mvn versions:display-dependency-updates
```

---

## Secure Usage Recommendations

- Use environment variables or secure vaults (AWS Secrets Manager, HashiCorp Vault, etc.)
- Never expose API keys in logs
- Never expose API keys in client-side applications
- Rotate API keys periodically

---

## Responsible Disclosure

Please allow reasonable time to investigate and resolve vulnerabilities before public disclosure.

Security fixes will be released as soon as possible.

---

## Contact

Maintainer: Akash Kobal  
GitHub: https://github.com/AkashKobal

Project Repository:  
https://github.com/AkashKobal/sarvis-spring-boot-starter

Security Advisories:  
https://github.com/AkashKobal/sarvis-spring-boot-starter/security/advisories

---

Thank you for helping keep Sarvis Spring Boot Starter secure.
