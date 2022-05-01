// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/School/Desktop/CS4345-search-engine/Frontend/conf/routes
// @DATE:Sun May 01 13:35:02 CDT 2022


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
