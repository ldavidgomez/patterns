name := "patterns"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation")

// grading libraries
libraryDependencies += "junit" % "junit" % "4.10" % "test"

// for funsets
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4"