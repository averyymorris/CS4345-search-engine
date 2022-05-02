
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object articleIndex_Scope0 {
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

class articleIndex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[Article],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: ArrayList[Article]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Show Results</title>
    </head>
    <body>
        <h1>All articles:</h1>
        """),_display_(/*10.10*/for(article <- articles) yield /*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""
            """),format.raw/*11.13*/("""<p>Article Id: """),_display_(/*11.29*/article/*11.36*/.articleId),format.raw/*11.46*/("""</p>
            <p>Article Title: """),_display_(/*12.32*/article/*12.39*/.articleTitle),format.raw/*12.52*/("""</p>
            <p>Article Summary: """),_display_(/*13.34*/article/*13.41*/.articleAbstract),format.raw/*13.57*/("""</p>
        """)))}),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(articles:ArrayList[Article]): play.twirl.api.HtmlFormat.Appendable = apply(articles)

  def f:((ArrayList[Article]) => play.twirl.api.HtmlFormat.Appendable) = (articles) => apply(articles)

  def ref: this.type = this

}


}

/**/
object articleIndex extends articleIndex_Scope0.articleIndex
              /*
                  -- GENERATED --
                  DATE: Mon May 02 14:56:39 CDT 2022
                  SOURCE: /Users/School/Desktop/CS4345-search-engine/ebean-backend/app/views/articleIndex.scala.html
                  HASH: 9493456d8a498051f0c8acafac1dffc0a4f363eb
                  MATRIX: 771->1|896->31|924->33|1084->166|1124->190|1164->192|1205->205|1248->221|1264->228|1295->238|1358->274|1374->281|1408->294|1473->332|1489->339|1526->355|1571->369|1603->374
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15
                  -- GENERATED --
              */
          