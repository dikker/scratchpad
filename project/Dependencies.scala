import sbt._

object Dependencies {
  val ScalaTest       = "org.scalatest"           %% "scalatest"                            % Versions.ScalaTestV
  val Scalatic        = "org.scalactic"           %% "scalactic"                            % Versions.ScalaTestV
  val ScalaCheck      = "org.scalacheck"          %% "scalacheck"                           % Versions.ScalaCheckV
  val TypeSafeConfig  = "com.typesafe"            %  "config"                               % Versions.TypeSafeConfigV
  val AkkaActor       = "com.typesafe.akka"       %% "akka-actor"                           % Versions.AkkaV
  val AkkaStream      = "com.typesafe.akka"       %% "akka-stream"                          % Versions.AkkaV
  val AkkaHttpCore    = "com.typesafe.akka"       %% "akka-http-core"                       % Versions.AkkaV
  val AkkaHttp        = "com.typesafe.akka"       %% "akka-http-experimental"               % Versions.AkkaV
  val SprayJson       = "com.typesafe.akka"       %% "akka-http-spray-json-experimental"    % Versions.AkkaV
  val AkkaTestKit     = "com.typesafe.akka"       %% "akka-http-testkit"                    % Versions.AkkaV
  val QuillCore       = "io.getquill"             %% "quill"                                % Versions.QuillV
  val QuillAsync      = "io.getquill"             %% "quill-async"                          % Versions.QuillV
  val QuillCasandra   = "io.getquill"             %% "quill-cassandra"                      % Versions.QuillV
  val QuillJDBC       = "io.getquill"             %% "quill-jdbc"                           % Versions.QuillV
  val QuillSQL        = "io.getquill"             %% "quill-sql"                            % Versions.QuillV
  val QuillFinnagle   = "io.getquill"             %% "quill-finagle-mysql"                  % Versions.QuillV
  val Hikari          = "com.zaxxer"              %  "HikariCP"                             % "2.4.5"
  val MySqlAsync      = "com.github.mauricio"     %% "mysql-async"                          % "0.2.19"
  val Cats            = "org.typelevel"           %% "cats-core"                            % Versions.CatsV
  val Shapeless       = "com.chuusai"             %% "shapeless"                            % Versions.ShapelessV

  val Sttp = Seq(
    "com.softwaremill.sttp" %% "core",
    "com.softwaremill.sttp" %% "async-http-client-backend-monix",
    "com.softwaremill.sttp" %% "circe"
  ).map(_ % Versions.SttpV)

  val Monix = Seq("io.monix" %% "monix",
    "io.monix" %% "monix-types",
    "io.monix" %% "monix-execution",
    "io.monix" %% "monix-eval",
    "io.monix" %% "monix-reactive",
    "io.monix" %% "monix-cats"
  ).map(_ % Versions.MonixV)

  val Circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser",
    "io.circe" %% "circe-optics",
    "io.circe" %% "circe-java8"
  ).map(_ % Versions.CirceV)
}
object Slf4j {
  val Sl4jApi = "org.slf4j" % "slf4j-api" % "1.7.5"
  val Sl4jSimple = "org.slf4j" % "slf4j-simple" % "1.7.5"
  val All = List(Sl4jApi,Sl4jSimple)
}
object Cassandra {
  val DSCore = "com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0"
  val DSMapping = "com.datastax.cassandra" % "cassandra-driver-mapping" % "3.0.0"
  val DSExtra = "com.datastax.cassandra" % "cassandra-driver-extras" % "3.0.0"
  val All = List(DSCore, DSMapping, DSExtra)
}

