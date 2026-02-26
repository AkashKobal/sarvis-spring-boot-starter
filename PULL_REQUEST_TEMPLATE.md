# Pull Request Template

Thank you for contributing to Sarvis Spring Boot Starter. Please complete the checklist and provide the required information.

---

## Description

Provide a clear and concise description of your changes.

Example:

```
Added configurable timeout support to SarvisClient.
```

---

## Type of Change

Select one or more:

- [ ] Bug fix
- [ ] New feature
- [ ] Performance improvement
- [ ] Code refactoring
- [ ] Documentation update
- [ ] Test improvement
- [ ] Build / CI update
- [ ] Dependency update
- [ ] Other (please describe)

---

## Related Issue

Link the related issue if applicable.

Example:

```
Closes #12
Fixes #34
Resolves #56
```

---

## Changes Made

Describe the changes in detail.

### Added

-
-
-

### Modified

-
-
-

### Removed

-
-
-

---

## How Has This Been Tested?

Describe how you tested your changes.

Example:

```
Tested locally using a Spring Boot test application.
Verified SarvisClient successfully connects to Sarvam AI API.
Verified auto-configuration loads correctly.
Tested configuration via application.yml and environment variables.
```

---

## Checklist

Please confirm the following before submitting:

- [ ] Code compiles successfully (`mvn clean install`)
- [ ] No breaking changes introduced
- [ ] Code follows project package structure (`io.github.sarvislabs`)
- [ ] No secrets, API keys, or credentials included
- [ ] AutoConfiguration works correctly
- [ ] Documentation updated (README.md, JavaDoc, etc.)
- [ ] Tested locally with a Spring Boot application
- [ ] No unnecessary dependencies added

---

## Code Example (if applicable)

Provide example usage:

```java
import io.github.sarvis.client.SarvisClient;

SarvisClient client = ...;
String response = client.chat("Hello");
System.out.println(response);
```

---

## Configuration Example (if applicable)

```yaml
sarvis:
  api-key: ${SARVIS_API_KEY}
  model: sarvam-m
```

---

## Screenshots / Logs (if applicable)

Add screenshots, logs, or console output if relevant.

Example:

```
SarvisClient initialized successfully.
Response received from Sarvam API.
```

---

## Additional Notes

Add any additional information here.

Include:

- Compatibility notes
- Migration instructions
- Known limitations

---

## Contributor Agreement

By submitting this pull request, you agree that your contributions will be licensed under the MIT License.

---

## Maintainer Notes (for internal use)

- [ ] Code reviewed
- [ ] Tested successfully
- [ ] Ready for merge
- [ ] Version bump required
- [ ] Release notes updated
