name := "preowned-kittens"

organization := "com.preowned-kittens"

version := "1.0"

libraryDependencies += "org.specs2" % "specs2_2.10" % "1.14" % "test"

val gitHeadCommitSha = taskKey[String](
	"Determines the current git commit SHA")

gitHeadCommitSha := Process("git rev-parse HEAD").lines.head