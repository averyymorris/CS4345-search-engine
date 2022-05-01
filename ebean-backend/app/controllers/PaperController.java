package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
        PaperIndex myIndex = new PaperIndex();
        ArrayList<Paper> papers = Paper.allDocuments();
        LinkedHashMap<String, ArrayList<Integer>> anotherIndex = new LinkedHashMap<>();
        for (int i = 0; i < papers.size(); i++) {
            myIndex.indeces = myIndex.indexDoc(papers.get(i));
        }
        anotherIndex = myIndex.indeces;
        ArrayList<Integer> resID = new ArrayList<>();
        resID = PaperIndex.search(query, papers);
        for (int i = 0; i < resID.size(); i++) {
            Paper paper = Paper.findById(resID.get(i));
            System.out.println(paper);
            if (paper == null) {
                return notFound("Paper not found");
            }
            ObjectNode result = Json.newObject();
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
