# Jenkins - Global Pipeline Libraries

## Prepare Jenkins

### Helm Install

```bash
helm upgrade \
  --install jenkins jenkins/jenkins \
  --version 4.4.1 \
  --values values.yaml
```

## Global Pipeline Library

### Testing Single Functon from `vars` Directory

In file `vars/getPublicIPAddress.groovy` uncomment execution of function

```bash
(...)

//println(call())
```

Execute from command line

```bash
groovy -cp src/ vars/getPublicIPAddress.groovy
```

## Groovy Basics

```bash
static 
```