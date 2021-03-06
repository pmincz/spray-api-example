package spray.example

import akka.actor.{Props, ActorSystem}
import akka.io.IO
import spray.can.Http
import spray.example.config.Configuration
import spray.example.rest.util.RestServiceActor

/**
 * Created by pmincz on 03/07/14.
 */
object Boot extends App with Configuration {

  // we need an ActorSystem to host our application in
  implicit val system = ActorSystem("spray-api-example")

  // create and start our service actor
  val service = system.actorOf(Props[RestServiceActor], "spray-api-example-service")

  // start a new HTTP server on port 8080 with our service actor as the handler
  IO(Http) ! Http.Bind(service, interface = serviceHost, port = servicePort)

}
