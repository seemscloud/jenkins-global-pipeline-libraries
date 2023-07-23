# Jenkins - Global Pipeline Libraries

## Prepare Jenkins

### Helm Install

```bash
helm upgrade \
  --install jenkins jenkins/jenkins \
  --version 4.4.1 \
  --values values.yaml
```