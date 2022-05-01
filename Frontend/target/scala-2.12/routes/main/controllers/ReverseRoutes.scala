// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/School/Downloads/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Mon Apr 25 22:49:47 CDT 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:15
  class ReversePaperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "papers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:24
    def displayResultsPage(): Call = {
    
      () match {
      
        // @LINE:24
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "search/show")
      
      }
    
    }
  
    // @LINE:19
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:15
    def createQuery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query/create")
    }
  
    // @LINE:21
    def searchHandler(): Call = {
    
      () match {
      
        // @LINE:21
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "search")
      
      }
    
    }
  
    // @LINE:17
    def saveQuery(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "query/create")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:32
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
