# deserialize-xml

is a simple example of how to deserialize XML. The project is written using Java and Quarkus framework. You can find 2 ways of deserializing:
- using [JAXB](#jaxb) library
- using [Jackson](#jackson) library
### Jaxb
```
  <!--JAXB-->
    <dependency>
      <groupId>org.jboss.resteasy</groupId>
      <artifactId>resteasy-jaxb-provider</artifactId>
    </dependency>
    <dependency>
      <groupId>org.jboss.resteasy</groupId>
      <artifactId>resteasy-jackson2-provider</artifactId>
    </dependency>
```
### Jackson
```
  <!--XML-->
    <dependency>
      <groupId>com.fasterxml.jackson.dataformat</groupId>
      <artifactId>jackson-dataformat-xml</artifactId>
    </dependency>
```

