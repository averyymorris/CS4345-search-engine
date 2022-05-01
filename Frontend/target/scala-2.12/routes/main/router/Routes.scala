// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/School/Desktop/CS4345-search-engine/Frontend/conf/routes
// @DATE:Sun May 01 13:05:20 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:15
  PaperController_1: controllers.PaperController,
  // @LINE:32
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:15
    PaperController_1: controllers.PaperController,
    // @LINE:32
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_2, PaperController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, PaperController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.signupHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query/create""", """controllers.PaperController.createQuery()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query/create""", """controllers.PaperController.saveQuery()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.PaperController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.PaperController.searchHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchPage""", """controllers.PaperController.searchHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/show""", """controllers.PaperController.displayResultsPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """papers/""" + "$" + """id<[^/]+>""", """controllers.PaperController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """papers/show""", """controllers.PaperController.displayResultsPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_loginHandler1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginHandler1_invoker = createInvoker(
    HomeController_2.loginHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginHandler",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup2_invoker = createInvoker(
    HomeController_2.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_signupHandler3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_signupHandler3_invoker = createInvoker(
    HomeController_2.signupHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signupHandler",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PaperController_createQuery4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query/create")))
  )
  private[this] lazy val controllers_PaperController_createQuery4_invoker = createInvoker(
    PaperController_1.createQuery(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "createQuery",
      Nil,
      "GET",
      this.prefix + """query/create""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PaperController_saveQuery5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query/create")))
  )
  private[this] lazy val controllers_PaperController_saveQuery5_invoker = createInvoker(
    PaperController_1.saveQuery(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "saveQuery",
      Nil,
      "POST",
      this.prefix + """query/create""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PaperController_searchPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_PaperController_searchPage6_invoker = createInvoker(
    PaperController_1.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PaperController_searchHandler7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_PaperController_searchHandler7_invoker = createInvoker(
    PaperController_1.searchHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "searchHandler",
      Nil,
      "POST",
      this.prefix + """search""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PaperController_searchHandler8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchPage")))
  )
  private[this] lazy val controllers_PaperController_searchHandler8_invoker = createInvoker(
    PaperController_1.searchHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "searchHandler",
      Nil,
      "GET",
      this.prefix + """searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_PaperController_displayResultsPage9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/show")))
  )
  private[this] lazy val controllers_PaperController_displayResultsPage9_invoker = createInvoker(
    PaperController_1.displayResultsPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "displayResultsPage",
      Nil,
      "GET",
      this.prefix + """search/show""",
      """POST    /search                     controllers.PaperController.searchHandler()""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PaperController_show10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("papers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaperController_show10_invoker = createInvoker(
    PaperController_1.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """papers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PaperController_displayResultsPage11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("papers/show")))
  )
  private[this] lazy val controllers_PaperController_displayResultsPage11_invoker = createInvoker(
    PaperController_1.displayResultsPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "displayResultsPage",
      Nil,
      "GET",
      this.prefix + """papers/show""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index())
      }
  
    // @LINE:8
    case controllers_HomeController_loginHandler1_route(params@_) =>
      call { 
        controllers_HomeController_loginHandler1_invoker.call(HomeController_2.loginHandler())
      }
  
    // @LINE:10
    case controllers_HomeController_signup2_route(params@_) =>
      call { 
        controllers_HomeController_signup2_invoker.call(HomeController_2.signup())
      }
  
    // @LINE:12
    case controllers_HomeController_signupHandler3_route(params@_) =>
      call { 
        controllers_HomeController_signupHandler3_invoker.call(HomeController_2.signupHandler())
      }
  
    // @LINE:15
    case controllers_PaperController_createQuery4_route(params@_) =>
      call { 
        controllers_PaperController_createQuery4_invoker.call(PaperController_1.createQuery())
      }
  
    // @LINE:17
    case controllers_PaperController_saveQuery5_route(params@_) =>
      call { 
        controllers_PaperController_saveQuery5_invoker.call(PaperController_1.saveQuery())
      }
  
    // @LINE:19
    case controllers_PaperController_searchPage6_route(params@_) =>
      call { 
        controllers_PaperController_searchPage6_invoker.call(PaperController_1.searchPage())
      }
  
    // @LINE:21
    case controllers_PaperController_searchHandler7_route(params@_) =>
      call { 
        controllers_PaperController_searchHandler7_invoker.call(PaperController_1.searchHandler())
      }
  
    // @LINE:22
    case controllers_PaperController_searchHandler8_route(params@_) =>
      call { 
        controllers_PaperController_searchHandler8_invoker.call(PaperController_1.searchHandler())
      }
  
    // @LINE:24
    case controllers_PaperController_displayResultsPage9_route(params@_) =>
      call { 
        controllers_PaperController_displayResultsPage9_invoker.call(PaperController_1.displayResultsPage())
      }
  
    // @LINE:26
    case controllers_PaperController_show10_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PaperController_show10_invoker.call(PaperController_1.show(id))
      }
  
    // @LINE:27
    case controllers_PaperController_displayResultsPage11_route(params@_) =>
      call { 
        controllers_PaperController_displayResultsPage11_invoker.call(PaperController_1.displayResultsPage())
      }
  
    // @LINE:32
    case controllers_Assets_at12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_0.at(path, file))
      }
  }
}
