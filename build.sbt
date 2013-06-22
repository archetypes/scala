name := "hello"

version := "0.0.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "com.novocode" % "junit-interface" % "0.8" % "test->default",
    "info.cukes" % "cucumber-junit" % "1.1.2" % "test",
    "info.cukes" % "cucumber-picocontainer" % "1.1.2" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

seq(cucumberSettingsWithTestPhaseIntegration : _*)
