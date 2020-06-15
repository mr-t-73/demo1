## Introduction

This is a simple example to show how to use the JAX-RS webservice within a Jersey implementation framework and run that within an Embedded Tomcat Webservice.



## Getting started

git clone https://github.com/mr-t-73/demo.git

gradle clean

gradle build

gradle shadowJar


## Run the Embedded Tomcat fat jar:

java -jar build/libs/webservice-1.0-SNAPSHOT-all.jar<br/>
May 13, 2020 4:41:55 PM org.apache.catalina.core.StandardContext setPath<br/>
WARNING: A context path must either be an empty string or start with a '/' and do not end with a '/'. The path [/] does not meet these criteria and has been changed to []<br/>
May 13, 2020 4:41:56 PM org.apache.coyote.AbstractProtocol init<br/>
INFO: Initializing ProtocolHandler ["http-nio-8222"]<br/>
May 13, 2020 4:41:56 PM org.apache.tomcat.util.net.NioSelectorPool getSharedSelector<br/>
INFO: Using a shared selector for servlet write/read<br/>
May 13, 2020 4:41:56 PM org.apache.catalina.core.StandardService startInternal<br/>
INFO: Starting service Tomcat<br/>
May 13, 2020 4:41:56 PM org.apache.catalina.core.StandardEngine startInternal<br/>
INFO: Starting Servlet Engine: Apache Tomcat/8.0.28<br/>
May 13, 2020 4:41:56 PM org.apache.coyote.AbstractProtocol start<br/>
INFO: Starting ProtocolHandler ["http-nio-8222"]<br/>


## In a separate window:

$ curl localhost:8222/json/test/blablablaaa -H "Accept: application/json"
Returning blablablaaa. It worked!
