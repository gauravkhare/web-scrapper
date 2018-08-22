name := "web-scrapper"

version := "1.0"

scalaVersion := "2.12.6"

//Macwire 2.11
lazy val macwireFor211 = "com.softwaremill.macwire" %% "macros" % "2.3.0"

//Logging
lazy val slf4j = "org.slf4j" % "slf4j-api" % "1.7.22"
lazy val log4j12Slf4jImpl = "org.slf4j" % "slf4j-log4j12" % "1.7.22"
lazy val log4j12 = "log4j" % "log4j" % "1.2.17"
lazy val log4j12ApacheExtras = "log4j" % "apache-log4j-extras" % "1.2.17" // needed for org.apache.log4j.rolling.RollingFileAppender

// https://mvnrepository.com/artifact/org.jsoup/jsoup
libraryDependencies += "org.jsoup" % "jsoup" % "1.8.3"
libraryDependencies += "com.typesafe" % "config" % "1.3.1"
libraryDependencies += macwireFor211
libraryDependencies += slf4j
libraryDependencies += log4j12Slf4jImpl
libraryDependencies += log4j12
libraryDependencies += log4j12ApacheExtras

