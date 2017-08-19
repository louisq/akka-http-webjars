lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization        := "com.querel",
      scalaVersion        := "2.12.3",
      crossScalaVersions  := Seq("2.11.11", "2.12.3"),
      version             := "1.0.0-SNAPSHOT"
    )),

    name := "akka-http-webjars",

    libraryDependencies ++= Seq(
      "org.webjars" % "webjars-locator" % "0.32-1",
      "com.typesafe.akka" %% "akka-http" % "10.0.9"
    )
  )
