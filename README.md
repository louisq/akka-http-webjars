# akka-http-webjars
Serve static assets from WebJars in akka-http. You can get webjars from: http://www.webjars.org/

This is a fork of the https://github.com/ThoughtWorksInc/akka-http-webjars project that adds compilation for scala 2.12
 and akka-http. It supports the following: 

* akka-http 10.0.9
* scala 2.11.11, 2.12.3

If you need a version of the library that supports akka-http-experimental or scala 2.10.*, have a look at the original 
library: https://github.com/ThoughtWorksInc/akka-http-webjars

# Instructions

1. import `com.querel.akka.http.WebJarsSupport`
2. Extend from your class the `WebJarsSupport` trait
3. Add `WebJarsSupport.webJars` to your akka http routes
4. Webjars will then be accessible at the endpoint which follows the webjar structure of the files

# Disclaimer

This project is neither affiliated with akka-http or webjars
