lazy val root = (project in file("."))
  .aggregate(collections)

lazy val collections = project
  .settings(libraryDependencies += "com.disneystreaming" %% "weaver-cats" % "0.13.0" % Test)
