name := "hello"

version := "0.0.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "com.novocode" % "junit-interface" % "0.8" % "test->default"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
