name := "spray-api-example"

version := "1.0"

organization  := "spray.example"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "spray repo"         at "http://repo.spray.io/",
  "sonatype releases"  at "http://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo"      at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"         % "1.3.1",
  "io.spray"            %   "spray-routing"     % "1.3.1",
  "org.json4s"          %% "json4s-native"      % "3.2.9",
  "org.json4s"          %% "json4s-jackson"      % "3.2.9",
  "com.typesafe.akka"   %%  "akka-actor"        % "2.3.2",
  "org.slf4j"           %   "slf4j-simple"      % "1.7.2"
)

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions += "-deprecation"

// fork a new JVM for 'run' and 'test:run'
fork := true