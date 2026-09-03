lazy val root = (project in file("."))
  .aggregate(collections)

lazy val collections = project.withTesting
