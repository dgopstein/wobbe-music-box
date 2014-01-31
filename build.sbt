name := "music-box"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "javazoom" % "jlayer" % "1.0.1"
)

play.Project.playScalaSettings
