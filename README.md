# FizzBuzz API Java

POC for dropwizard framework.

## System Requirement
- Install [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (JDK 8)
- Install [Gradle](https://www.gradle.org/)
- Clone this repository to your local directory.

## Build Artifact

```
$ cd <your local dir>
$ gradle build
```

__NOTE:__ At first time build it will download all dependencies to your machine, please wait until finished.

## Start Server

```
$ gradle run
```

## API Usage
- Open web browser
- Browse to http://localhost:8080/api/fizzbuzz/{number}
- It will show result as Json

### Example:

Browse to: http://localhost:8080/api/fizzbuzz/15

Return:
```json
{
    "number": 15,
    "result": "FizzBuzz"
}
```
