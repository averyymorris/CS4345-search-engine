package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Article;
import models.Paper;
import models.PaperIndex;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;
import java.lang.String;
import play.libs.Json;

public class PaperController extends Controller {
    public Result makeSearch() {
        System.out.println("In search");
        JsonNode req = request().body().asJson();
        System.out.println(req);
        String query = req.get("userQuery").asText();
        System.out.println(query);
        //Article art = Article.findByUserQuery(query);
        PaperIndex myIndex = new PaperIndex();
        ArrayList<Paper> papers = Paper.allDocuments();
        for(int i = 0; i < papers.size(); i++) {
            Article potentialNewArticle = Article.findById(papers.get(i).getDocId());
            //create articles and save to DB if it doesn't already exist
            if (potentialNewArticle == null) {
                Article article = new Article();
                article.articleId=papers.get(i).getDocId();
                article.articleTitle=papers.get(i).getTitle();
                article.articleAbstract=papers.get(i).getPaperAbstract();
                article.save();
            }
        }
        //LinkedHashMap<String, ArrayList<Integer>> anotherIndex = new LinkedHashMap<>();
        for (int i = 0; i < papers.size(); i++) {
            myIndex.indeces = myIndex.indexDoc(papers.get(i));
        }
        //anotherIndex = myIndex.indeces;
        ArrayList<Integer> resID = new ArrayList<>();
        resID = PaperIndex.search(query, papers);
        for (int i = 0; i < resID.size(); i++) {
            Article a = Article.findById(resID.get(i));
            if (a != null) {
                System.out.println(a);
                System.out.println("a id = " + a.articleId);
                System.out.println("a title = " + a.articleTitle);
                System.out.println("a abstract = " + a.articleAbstract);
            }
            Paper paper = Paper.findById(resID.get(i));
            System.out.println(paper);
            ObjectNode result = Json.newObject();
            if (paper == null) {
                return ok("false");
            }
            result.put("paperTitle", paper.getTitle());
            result.put("paperUrl", paper.getUrl());
            result.put("paperAbstract", paper.getPaperAbstract());
            System.out.println("Found paper");
            return ok(result);
        }
        return TODO;
    }

    public static Result show(Integer docID) {
        Paper paper = Paper.findById(docID);
        if(paper==null) {
            return notFound("Paper not found");
        }
        return ok(views.html.show.render(paper));
    }

}
