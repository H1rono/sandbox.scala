Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.5.1"
ThisBuild / semanticdbEnabled := true
ThisBuild / scalacOptions ++= Seq(
  "-Werror",
  "-Wunused:all",
)
ThisBuild / scalafixOnCompile := true

lazy val root = (project in file("."))
  .settings(
    name := "sandbox",
  )
