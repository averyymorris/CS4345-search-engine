package controllers;
import models.Article;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;

import javax.inject.Inject;

public class ArticlesController extends Controller {
    @Inject
    FormFactory formFactory;

    public Result index() {
        List<Article> articles = Article.find.all();
        //return ok(articleIndex.render(articles));
        return ok();
    }

}
