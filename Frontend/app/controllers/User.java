package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;

import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class User {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9001);
        //add username password
        WSRequest request = ws.url("http://localhost:9001/login");
        System.out.println("request = " + request);
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        System.out.println(res);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9001);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);

        System.out.println(username);
        System.out.println(password);

        WSRequest request = ws.url("http://localhost:9001/signup");
        System.out.println(request);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });

    }




}
