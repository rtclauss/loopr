ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

enablePlugins(GatlingPlugin)

val ScalaCheckVersion = "1.14.1"
libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % ScalaCheckVersion,
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.7.6" % "it, test",
  "io.gatling"            % "gatling-test-framework"    % "3.7.6" % "it, test"

)

lazy val root = (project in file("."))
  .settings(
    name := "loopr",
    idePackagePrefix := Some("com.kyndryl.cjot")
  )
