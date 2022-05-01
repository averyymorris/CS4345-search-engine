
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/School/Downloads/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Tue Apr 26 11:17:33 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:11
  UserController_1: controllers.UserController,
  // @LINE:17
  PaperController_2: controllers.PaperController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:11
    UserController_1: controllers.UserController,
    // @LINE:17
    PaperController_2: controllers.PaperController
  ) = this(errorHandler, HomeController_0, UserController_1, PaperController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, PaperController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """makeSearch""", """controllers.PaperController.makeSearch()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchPage""", """controllers.PaperController.makeSearch()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PaperController_makeSearch3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("makeSearch")))
  )
  private[this] lazy val controllers_PaperController_makeSearch3_invoker = createInvoker(
    PaperController_2.makeSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "makeSearch",
      Nil,
      "POST",
      """""",
      this.prefix + """makeSearch"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PaperController_makeSearch4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchPage")))
  )
  private[this] lazy val controllers_PaperController_makeSearch4_invoker = createInvoker(
    PaperController_2.makeSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "makeSearch",
      Nil,
      "POST",
      """ make a search
POST    /searchPage                  controllers.UserController.makeSearch()""",
      this.prefix + """searchPage"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:11
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:15
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:17
    case controllers_PaperController_makeSearch3_route(params) =>
      call { 
        controllers_PaperController_makeSearch3_invoker.call(PaperController_2.makeSearch())
      }
  
    // @LINE:22
    case controllers_PaperController_makeSearch4_route(params) =>
      call { 
        controllers_PaperController_makeSearch4_invoker.call(PaperController_2.makeSearch())
      }
  }
}
