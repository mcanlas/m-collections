lazy val commonSettings = Seq(scalafmtOnCompile := true,
                              scalaVersion := "2.12.7",
                              crossScalaVersions := Seq("2.11.12", "2.12.7"))

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(collections)

lazy val collections = project
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies += "org.specs2" %% "specs2-core" % "4.3.4" % "test")
