
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

object searchEngine extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Search Bar Page</title>
    </head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
  .search """),format.raw/*11.11*/("""{"""),format.raw/*11.12*/("""
      """),format.raw/*12.7*/("""margin: 0 auto;
      text-align: center;
  """),format.raw/*14.3*/("""}"""),format.raw/*14.4*/("""

  """),format.raw/*16.3*/(""".search h4"""),format.raw/*16.13*/("""{"""),format.raw/*16.14*/("""
      """),format.raw/*17.7*/("""margin: 50px 0px 20px 0px;
      font-size: 30px;
  """),format.raw/*19.3*/("""}"""),format.raw/*19.4*/("""

  """),format.raw/*21.3*/(""".search input[type=text] """),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""
      """),format.raw/*22.7*/("""width: 60%;
      border-radius: 30px;
      outline: none;
      padding-left: 20px;
      padding-top: 5px;
      padding-bottom: 5px;
      border: solid 1px black;
  """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
"""),format.raw/*30.1*/("""</style>
    <body>
            <!-- Search Bar-->
        <div class="search">
            <h4>Scientist Social Network</h4>
            <input type="text" placeholder="Search for papers...">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button><br>
            <a href="#">Advanced Search</a>
        </div>

    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-24T14:40:48.383
                  SOURCE: /Users/School/Downloads/Lab-2-Ebean/Frontend/app/views/searchPage.scala.html
                  HASH: d757c14e66712f3cbf279675b9cefdcb6a7153a2
                  MATRIX: 1037->0|1569->505|1598->506|1632->513|1703->557|1731->558|1762->562|1800->572|1829->573|1863->580|1942->632|1970->633|2001->637|2054->662|2083->663|2117->670|2314->840|2342->841|2370->842
                  LINES: 33->1|43->11|43->11|44->12|46->14|46->14|48->16|48->16|48->16|49->17|51->19|51->19|53->21|53->21|53->21|54->22|61->29|61->29|62->30
                  -- GENERATED --
              */
          