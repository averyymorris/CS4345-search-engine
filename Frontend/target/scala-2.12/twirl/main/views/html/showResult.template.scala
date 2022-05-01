
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

object showResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Paper,play.twirl.api.HtmlFormat.Appendable] {

  /* @(paper: Paper) @(resJson: json)  @(paperResultJson: ObjectNode) @(paperResult: String)*/
  def apply/*5.2*/(paper: Paper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Show Results</title>
    </head>
    <body>
        <h1>Here are the results of your query:</h1>
        <p>Paper Title: """),_display_(/*14.26*/paper/*14.31*/.paperTitle),format.raw/*14.42*/("""</p>
        <p>Paper URL: """),_display_(/*15.24*/paper/*15.29*/.paperUrl),format.raw/*15.38*/("""</p>
        <p>Paper Summary: """),_display_(/*16.28*/paper/*16.33*/.paperAbstract),format.raw/*16.47*/("""</p>

    </body>
</html>"""))
      }
    }
  }

  def render(paper:Paper): play.twirl.api.HtmlFormat.Appendable = apply(paper)

  def f:((Paper) => play.twirl.api.HtmlFormat.Appendable) = (paper) => apply(paper)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-05-01T12:03:34.331
                  SOURCE: /Users/School/Downloads/Lab-2-Ebean/Frontend/app/views/showResult.scala.html
                  HASH: f46e1f3d7bded7224bb2a745ec3548be2c50d185
                  MATRIX: 1040->97|1148->112|1175->113|1373->284|1387->289|1419->300|1474->328|1488->333|1518->342|1577->374|1591->379|1626->393
                  LINES: 28->5|33->6|34->7|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16
                  -- GENERATED --
              */
          