lazy val commonSettings =
  Seq(scalaVersion := "2.12.17", crossScalaVersions := Seq("2.11.12", "2.12.17"))

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(collections)

lazy val collections = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.specs2" %% "specs2-core" % "4.9.4" % "test")
