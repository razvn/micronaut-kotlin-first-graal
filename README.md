# Micronaut - Creating your first Micronaut Kotlin Graal application

Based on [the Java version of the guide](https://guides.micronaut.io/micronaut-creating-first-graal-app/guide/index.html)


## Changes 

 - Application generation:
 
```
 mn create-app example.micronaut.complete --features=graal-native-image,kotlin
```

 - Update to Kotlin 1.3.31
 
 
## Problem

 - Json response is empty
 
 ```
 time curl localhost:8080/conferences/random
 {}
 0.01s user 
 0.01s system 
 0.023 total
 ```
 
 