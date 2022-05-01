
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Paper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paper: Paper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*6.17*/paper/*6.22*/.title),format.raw/*6.28*/("""</title>
    </head>
    <body>
        <h2>"""),_display_(/*9.14*/paper/*9.19*/.title),format.raw/*9.25*/("""</h2>
        <p>Paper URL: """),_display_(/*10.24*/paper/*10.29*/.url),format.raw/*10.33*/("""</p>
        <p>Paper Summary: """),_display_(/*11.28*/paper/*11.33*/.paperAbstract),format.raw/*11.47*/("""</p>
    </body>
</html>"""))
      }
    }
  }

  def render(paper:Paper): play.twirl.api.HtmlFormat.Appendable = apply(paper)

  def f:((Paper) => play.twirl.api.HtmlFormat.Appendable) = (paper) => apply(paper)

  def ref: this.type = this

}


}

/**/
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 19:00:18 CDT 2022
                  SOURCE: /Users/School/Downloads/Lab-2-Ebean/ebean-backend/app/views/show.scala.html
                  HASH: 22c9398b11ca362fa4336868f5dce77df935e9d8
                  MATRIX: 742->1|851->15|879->17|955->67|968->72|994->78|1065->123|1078->128|1104->134|1160->163|1174->168|1199->172|1258->204|1272->209|1307->223
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11
                  -- GENERATED --
              */
          