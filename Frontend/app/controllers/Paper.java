package controllers;
import java.lang.String;

public class Paper {
    //public int docId;
    public String paperTitle;
    public String paperUrl;
    public String paperAbstract;

    //public String field;

//    public Paper(Integer docId, String title, String paperAbstract, String url, String field) {
//        this.docId = docId;
//        this.title = title;
//        this.paperAbstract = paperAbstract;
//        this.url = url;
//        this.field = field;
//    }

    public Paper() {

    }

//    public int getDocId(){
//        return docId;
//    }
//    public void setDocId(int docId) {
//        this.docId = docId;
//    }

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

//    public String getField() {
//        return field;
//    }
//    public void setField(String field) {
//        this.field = field;
//    }

}