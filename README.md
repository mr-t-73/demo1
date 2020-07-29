## Introduction

This is a simple example to show how to construct Embedded Tomcat containerizing a Jersey framework and in turn the JAX-RS webservice:



## Getting started

```
$ git clone https://github.com/mr-t-73/demo.git

$ gradle clean

$ gradle build

$ gradle shadowJar
```

## Run the Embedded Tomcat fat jar:

```
$ java -jar build/libs/webservice-1.0-SNAPSHOT-all.jar
May 13, 2020 4:41:55 PM org.apache.catalina.core.StandardContext setPath<br/>
WARNING: A context path must either be an empty string or start with a '/' and do not end with a '/'. The path [/] does not meet these criteria and has been changed to []
May 13, 2020 4:41:56 PM org.apache.coyote.AbstractProtocol init
INFO: Initializing ProtocolHandler ["http-nio-8222"]
May 13, 2020 4:41:56 PM org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
INFO: Using a shared selector for servlet write/read
May 13, 2020 4:41:56 PM org.apache.catalina.core.StandardService startInternal
INFO: Starting service Tomcat
May 13, 2020 4:41:56 PM org.apache.catalina.core.StandardEngine startInternal
INFO: Starting Servlet Engine: Apache Tomcat/8.0.28
May 13, 2020 4:41:56 PM org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-nio-8222"]
```

## In a separate window:

```
$ curl localhost:8222/json/test/blablablaaa -H "Accept: application/json"
Returning blablablaaa. It worked!
```
