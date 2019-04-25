# Micronaut - Creating your first Micronaut Kotlin Graal application

Based on the first Kotlin Graal application made on the the [branch master](https://github.com/razvn/micronaut-kotlin-first-graal/tree/master)

Add the [Micronaut Mircometer Guide](https://micronaut-projects.github.io/micronaut-micrometer/latest/guide/)


## Update the config
 
Added to `application.yaml` 
```yaml
  metrics:
    enabled: true
```

## Add the dependencies

Added to `build.gradle`

```
    compile "io.micronaut.configuration:micronaut-micrometer-core"
    compile "io.micronaut:micronaut-management"
```
 
 
 
## Problem

When run native:

 - No serializer found ([tag v0.3](https://github.com/razvn/micronaut-kotlin-first-graal/tree/v0.3))

 ```
curl -v localhost:8080/metrics
                              
< HTTP/1.1 500 Internal Server Error

{"message":"Internal Server Error: Error encoding object [io.micronaut.configuration.metrics.management.endpoint.MetricsEndpoint$MetricNames@10c414e20] to JSON: No serializer found for class io.micronaut.configuration.metrics.management.endpoint.MetricsEndpoint$MetricNames and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)"}
 ```
