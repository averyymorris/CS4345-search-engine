package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import views.html.*;


import java.util.concurrent.CompletionStage;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class PaperController extends Controller{
    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    public int docId;
    public String title;
    public String paperAbstract;
    public String url;
    public String field;
    public String userQuery;

    @Inject
    public PaperController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    //search engine page
    public Result searchPage() {
        return ok(views.html.searchPage.render());
    }

    public CompletionStage<Result> searchHandler() {
        System.out.println("In search handler");
        Form<Query> searchForm = formFactory.form(Query.class).bindFromRequest();
        if (searchForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }
        return searchForm.get().analyzeSearchQuery()
                .thenApplyAsync((WSResponse r) -> {
                    //Paper myPaper = new Paper();
                    System.out.println("r as Json = " + r.asJson());
                    JsonNode myjson = r.asJson(); //creates JsonNode, myjson
                    String jsonStr = Json.stringify(myjson);
                    //System.out.println("parsed Json = " + Json.parse(jsonStr));
                    JsonNode json = Json.parse(jsonStr);
                    Paper myPaper = Json.fromJson(json, Paper.class);
                    System.out.println("myPaper object = " + myPaper);
                    //System.out.println(myPaper.paperTitle);


                    if (r.getStatus() == 200 && r.asJson() != null) {
                        //session("userQuery",searchForm.get().getUserQuery());   // store user query in session for your project
                        System.out.println("success");
                        System.out.println(r.asJson());
                        //return ok("true");
                        //return ok(views.html.showResult.render(r.getBody()));
                        return ok(views.html.showResult.render(myPaper));
                        //return ok(view.html...) to display the json in the results page
                    } else {
                        System.out.println("response null");
                        return badRequest();
                    }
                }, ec.current());

    }

    public Result displayResultsPage() {
        Form<PaperController> paperForm = formFactory.form(PaperController.class);
        return ok();
    }

    public Result show(Integer docID) {
        return ok();
    }

    public Result createQuery() {
        Form<Query> queryForm = formFactory.form(Query.class).bindFromRequest();
        return ok(views.html.createQuery.render(queryForm));
    }

    public Result saveQuery() {
        return ok();
    }
}
