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
//    public static Result index(String query) {
//        PaperIndex myIndex = new PaperIndex();
//        ArrayList<Paper> papers = Paper.allDocuments();
//        //System.out.println(papers);
//        LinkedHashMap<String, ArrayList<Integer>> anotherIndex = new LinkedHashMap<>();
//        for(int i = 0; i < papers.size(); i++) {
//            myIndex.indeces = myIndex.indexDoc(papers.get(i));
//        }
//        anotherIndex = myIndex.indeces;
//        ArrayList<Integer> resID = new ArrayList<>();
//        resID = PaperIndex.search(query, papers);
//        //System.out.println("resID = " + resID);
//        //ObjectNode result = null;
//        //ObjectNode result = Json.newObject();
//
//        //loop through resID and call show method, passing in ID
//        for(int i = 0; i < resID.size(); i++) {
//            //System.out.println(resID.get(i));
//            Paper paper = Paper.findById(resID.get(i));
//            System.out.println(paper);
//            if(paper==null) {
//                return notFound("Paper not found");
//            }
//            ObjectNode result = Json.newObject();
//            String paperInfo = paper.getTitle() + "   " + paper.getUrl() + "   " + paper.getPaperAbstract();
//            System.out.println("paper info = " + paperInfo);
//            result.put("body", paperInfo);
////            result.put("body", paper.getTitle());
//            System.out.println("paper title = " + paper.getTitle());
//            System.out.println("Found paper");
//            //return ok(views.html.show.render(paper));
//            return ok(result);
////            } else {
////                ObjectNode result = Json.newObject();
////                result.put("body", paper.getTitle());
////                System.out.println("paper title = " + paper.getTitle());
////                System.out.println("Found paper");
////                //return ok(views.html.show.render(paper));
////                return ok(result);
////            }
//        }
//
//        return TODO;
//    }

    public Result makeSearch() {
        System.out.println("In search");
        JsonNode req = request().body().asJson();
        System.out.println(req);
        String query = req.get("userQuery").asText();
        System.out.println(query);
        //index(query);

        PaperIndex myIndex = new PaperIndex();
        ArrayList<Paper> papers = Paper.allDocuments();
        //System.out.println(papers);
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
            //return ok(views.html.show.render(paper));
            return ok(result);

        }

        return TODO;

    }

//        if(query == null) {
//            return badRequest("Expecting user to enter query");
//        } else {
//            return ok();
//        }


    public static Result show(Integer docID) {
        Paper paper = Paper.findById(docID);
        if(paper==null) {
            return notFound("Paper not found");
        }
        return ok(views.html.show.render(paper));
    }


}
