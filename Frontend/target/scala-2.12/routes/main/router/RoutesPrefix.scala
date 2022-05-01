// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/School/Downloads/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Mon Apr 25 22:49:47 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
