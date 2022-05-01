name := "client"
 
version := "1.0" 
      
lazy val `client` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies += jdbc
libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )
//libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.11”
libraryDependencies += "javax.json" % "javax.json-api" % "1.1.4"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.11"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.8.2" //json library

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )


      