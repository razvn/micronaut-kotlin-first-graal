# Micronaut - Creating your first Micronaut Kotlin Graal application

Based on [the Java version of the guide](https://guides.micronaut.io/micronaut-creating-first-graal-app/guide/index.html)


## Changes 

 - Application generation:
 
```
 mn create-app example.micronaut.complete --features=graal-native-image,kotlin
```

 - Update to Kotlin 1.3.31
 
 
## Problem

 - Json response is empty ([tag v0.1](https://github.com/razvn/micronaut-kotlin-first-graal/tree/v0.1))
 
 ```
 time curl localhost:8080/conferences/random
 {}
 0.01s user 
 0.01s system 
 0.023 total
 ```
 
 **Fixed by adding in `application.yml`** ([tag v0.2](https://github.com/razvn/micronaut-kotlin-first-graal/tree/v0.2)):
 
 ```yaml
 jackson:
   bean-introspection-module: true
 ```

Result:
 ```
 time curl localhost:8080/conferences/random                                
 {"name":"Greach"}
 0.01s user 
 0.02s system 
 0.046 total
 ```
 