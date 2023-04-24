ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "kata-diamond-scala",
    idePackagePrefix := Some("dev.mcabsan.diamond"),
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
)
