
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* parameters */
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Login Message</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*16.34*/message),format.raw/*16.41*/("""</p>

"""),format.raw/*18.64*/("""
"""),format.raw/*19.94*/("""
            """),format.raw/*20.13*/("""<a href=""""),_display_(/*20.23*/routes/*20.29*/.PaperController.searchPage()),format.raw/*20.58*/("""">Click here for Search Page</a><br>
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.PaperController.createQuery()),format.raw/*21.59*/("""">Click here to create query</a>

        </header>

    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-25T22:31:33.301
                  SOURCE: /Users/School/Downloads/Lab-2-Ebean/Frontend/app/views/index.scala.html
                  HASH: ff34243d84dab97925446187cef81e36e53481fe
                  MATRIX: 960->18|1050->38|1116->36|1143->76|1170->77|1506->386|1534->393|1568->462|1597->556|1638->569|1675->579|1690->585|1740->614|1826->673|1841->679|1892->709
                  LINES: 28->2|31->4|34->3|35->5|36->6|46->16|46->16|48->18|49->19|50->20|50->20|50->20|50->20|51->21|51->21|51->21
                  -- GENERATED --
              */
          