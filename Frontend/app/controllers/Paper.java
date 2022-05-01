package controllers;
import java.lang.String;

public class Paper {
    public String paperTitle;
    public String paperUrl;
    public String paperAbstract;

    public Paper() {

    }

    public String getTitle(){
        return paperTitle;
    }
    public void setTitle(String title) {
        this.paperTitle = title;
    }
    public String getPaperAbstract() {
        return paperAbstract;
    }
    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }
    public String getUrl() {
        return paperUrl;
    }
    public void setUrl(String url) {
        this.paperUrl = url;
    }



}