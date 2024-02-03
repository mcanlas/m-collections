lazy val commonSettings =
  Seq(
    scalaVersion       := "2.13.12",
    crossScalaVersions := Seq("2.12.18", "2.13.12")
  )

lazy val root = (project in file("."))
  .settings(commonSettings*)
  .aggregate(collections)

lazy val collections = project
  .settings(commonSettings*)
  .settings(testFrameworks += new TestFramework("weaver.framework.CatsEffect"))
  .settings(libraryDependencies += "com.disneystreaming" %% "weaver-cats" % "0.8.4" % Test)
