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

** FIX **
 - added the `reflect.json` file in `src/main/graal`
 
 But it's not enough still same error>
 
 - added the option `-H:ReflectionConfigurationFiles=src/main/graal/reflect.json \` to `native-image.properties`
 
 ```
curl -v localhost:8080/metrics
                              
< HTTP/1.1 200 OK

{"names":["executor","executor.active","executor.completed","executor.pool.size","executor.queued","jvm.classes.loaded","jvm.classes.unloaded","jvm.gc.live.data.size","jvm.gc.max.data.size","jvm.gc.memory.allocated","jvm.gc.memory.promoted","jvm.threads.daemon","jvm.threads.live","jvm.threads.peak","jvm.threads.states","logback.events","process.start.time","process.uptime","system.cpu.count"]
 ```