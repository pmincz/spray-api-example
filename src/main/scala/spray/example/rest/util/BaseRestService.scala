package spray.example.rest.util

import akka.actor.ActorRefFactory
import org.json4s.DefaultFormats
import spray.httpx.Json4sSupport
import spray.routing.HttpService

/**
 * Created by pmincz on 03/07/14.
 *
 * All the traits that have the routes extends from this trait
 * It has the executionContext & the DefaultFormats for the json marshalling
 */
trait BaseRestService extends HttpService with Json4sSupport {

  implicit def executionContext = actorRefFactory.dispatcher

  val json4sFormats = DefaultFormats

}
