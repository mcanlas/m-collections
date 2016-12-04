lazy val commonSettings = Seq(
  scalaVersion := "2.12.0",
  crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0"))

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(collections)

lazy val collections = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.6" % "test")
