
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

object displayResultsPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[PaperController],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paperForm : Form[PaperController]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Show Results</title>
    </head>
    <body>
        <h1>Show Results</h1>
        """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.PaperController.displayResultsPage())/*11.75*/ {_display_(Seq[Any](format.raw/*11.77*/("""

        """)))}),format.raw/*13.10*/("""

        """),format.raw/*15.9*/("""<form action="/papers/show" method="GET">

        </form>


    </body>
</html>

"""),format.raw/*23.20*/("""
"""),format.raw/*24.11*/("""
"""),format.raw/*25.15*/("""
"""),format.raw/*26.35*/("""
"""),format.raw/*27.66*/("""
"""),format.raw/*28.83*/("""
"""),format.raw/*29.43*/("""
"""),format.raw/*30.16*/("""
"""),format.raw/*31.219*/("""
"""),format.raw/*32.16*/("""
"""),format.raw/*33.19*/("""
"""),format.raw/*34.28*/("""
"""),format.raw/*35.32*/("""
"""),format.raw/*36.10*/("""

"""),format.raw/*38.13*/("""
"""),format.raw/*39.15*/("""
"""),format.raw/*40.37*/("""
"""),format.raw/*41.34*/("""
"""),format.raw/*42.50*/("""
"""),format.raw/*43.19*/("""
"""),format.raw/*44.47*/("""

"""),format.raw/*46.16*/("""

"""))
      }
    }
  }

  def render(paperForm:Form[PaperController]): play.twirl.api.HtmlFormat.Appendable = apply(paperForm)

  def f:((Form[PaperController]) => play.twirl.api.HtmlFormat.Appendable) = (paperForm) => apply(paperForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-25T19:07:23.920
                  SOURCE: /Users/School/Downloads/Lab-2-Ebean/Frontend/app/views/displayResultsPage.scala.html
                  HASH: ccc109a54dea1473c6f21dc3a6e895006706a9f0
                  MATRIX: 976->1|1084->38|1128->54|1155->55|1314->187|1329->193|1397->252|1437->254|1479->265|1516->275|1626->376|1655->387|1684->402|1713->437|1742->503|1771->586|1800->629|1829->645|1859->864|1888->880|1917->899|1946->927|1975->959|2004->969|2034->983|2063->998|2092->1035|2121->1069|2150->1119|2179->1138|2208->1185|2238->1202
                  LINES: 28->1|31->2|34->3|35->4|42->11|42->11|42->11|42->11|44->13|46->15|54->23|55->24|56->25|57->26|58->27|59->28|60->29|61->30|62->31|63->32|64->33|65->34|66->35|67->36|69->38|70->39|71->40|72->41|73->42|74->43|75->44|77->46
                  -- GENERATED --
              */
          