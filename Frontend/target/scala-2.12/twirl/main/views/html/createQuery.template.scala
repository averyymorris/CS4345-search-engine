
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

object createQuery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Query],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(queryForm : Form[Query]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Create Query</title>
    </head>
    <body>
        <h1>Create Query</h1>
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.PaperController.saveQuery())/*12.66*/ {_display_(Seq[Any](format.raw/*12.68*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(queryForm("Query"))),format.raw/*13.50*/("""

            """),format.raw/*15.13*/("""<input type="submit" value="Create Query">
        """)))}),format.raw/*16.10*/("""
"""),format.raw/*17.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(queryForm:Form[Query]): play.twirl.api.HtmlFormat.Appendable = apply(queryForm)

  def f:((Form[Query]) => play.twirl.api.HtmlFormat.Appendable) = (queryForm) => apply(queryForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-25T22:15:49.965
                  SOURCE: /Users/School/Downloads/Lab-2-Ebean/Frontend/app/views/createQuery.scala.html
                  HASH: d1a1a254093df8f15e59d762e78ff6160329c341
                  MATRIX: 959->1|1057->28|1101->44|1128->45|1328->218|1343->224|1402->274|1442->276|1483->290|1498->296|1549->326|1591->340|1674->392|1702->393
                  LINES: 28->1|31->2|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|46->15|47->16|48->17
                  -- GENERATED --
              */
          