resolvers ++= Seq(
  "sonatype releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.11")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.3.2")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
