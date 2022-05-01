package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Query {
    private String userQuery;
    private Integer resPaperId;
    private String resPaperTitle;
    private String resPaperUrl;
    private String resPaperAbstract;

    public String getUserQuery() {
        return userQuery;
    }
    public void setUserQuery(String userQuery) {
        this.userQuery = userQuery;
    }

    public CompletionStage<WSResponse> analyzeSearchQuery() {
        WSClient ws = play.test.WSTestClient.newClient(9001);
        ObjectNode res = Json.newObject();
        res.put("userQuery", this.userQuery);
        //set the other parts of the json, which should be null for now
//        res.put("resPaperTitle", this.resPaperTitle);
//        res.put("resPaperId", this.resPaperId);
//        res.put("resPaperUrl", this.resPaperUrl);
//        res.put("resPaperAbstract", this.resPaperAbstract);

        System.out.println(res);
        System.out.println(" user query = " + userQuery);
        WSRequest request = ws.url("http://localhost:9001/makeSearch"); //send to backend
        System.out.println("request = " + request);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });

    }


}
