package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def user(id: Int) = Action {
    Ok(views.html.index("User logged in: " + id))
  }

  def upload = Action {
    Ok(views.html.upload())
  }

  def receive = Action(parse.multipartFormData) { request =>
    request.body.file("picture").map { picture =>
        import java.io.File
            val filename = picture.filename 
            val contentType = picture.contentType
            picture.ref.moveTo(new File("/tmp/picture"))
            Ok("File uploaded")
    }.getOrElse {
        Redirect(routes.Application.index).flashing(
                "error" -> "Missing file"
                )
    }
  }

}
