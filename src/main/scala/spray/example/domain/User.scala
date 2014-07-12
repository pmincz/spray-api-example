package spray.example.domain

import scala.collection.mutable.MutableList

/**
 * Created by pmincz on 03/07/14.
 *
 * case class for the container of the User
 */
case class User(id: Option[Long], username: String, email: String)

/**
 * Object that contains the list of users like a DB
 */
object generateUsers {
  val users: MutableList[User] = MutableList(User(Some(1L), "test", "test@test.com"),
                   User(Some(2L), "spray", "spray@spray.com"),
                   User(Some(3L), "example", "example@example.com"))
}