lazy val commonSettings =
  Seq(
    scalaVersion       := "2.13.12",
    crossScalaVersions := Seq("2.12.18", "2.13.12")
  )

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(collections)

lazy val collections = project
  .settings(commonSettings: _*)
  .settings(testFrameworks += new TestFramework("weaver.framework.CatsEffect"))
  .settings(libraryDependencies += "com.disneystreaming" %% "weaver-cats" % "0.8.3" % Test)
