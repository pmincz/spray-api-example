package spray.example.rest

import spray.example.domain.{generateUsers, User}
import spray.example.rest.util.BaseRestService

/**
 * Created by pmincz on 03/07/14.
 *
 * Trait that has the routes
 * and what to do following the path
 */
trait UsersRestService extends BaseRestService {

  def usersRoute = usersById ~ allUsers ~ postUser

  val usersById = get {
      path("users" / LongNumber) { id: Long =>
        complete(generateUsers.users.find(_.id.get == id))
      }
    }

  val allUsers = get {
      path("users") {
        complete(generateUsers.users)
      }
    }

  val postUser = post {
      path("users") {
        entity(as[User]) { newUser =>
          generateUsers.users += newUser
          complete(generateUsers.users)
        }
      }
    }

}
