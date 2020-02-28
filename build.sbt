name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies ++= {
  Seq(
    "io.kamon" %% "kamon-play-2.5" % "1.1.3",
    "io.kamon" %% "kamon-datadog" % "1.0.0",
    "io.kamon" %% "kamon-akka-2.5" % "1.1.2"
  )
}
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

