
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/School/Downloads/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Tue Apr 26 11:17:33 CDT 2022


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
