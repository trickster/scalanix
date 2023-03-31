val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zero-to-nix-scala",
    version := "0.1.0",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.5",
    ),
    scalaVersion := scala3Version
  )

// avoid generating docs
Compile / doc / sources                := Nil
Compile / packageDoc / publishArtifact := false

enablePlugins(JavaAppPackaging)
