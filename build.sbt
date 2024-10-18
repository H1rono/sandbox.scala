Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.5.1"

lazy val root = (project in file("."))
  .settings(
    name := "sandbox",

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
