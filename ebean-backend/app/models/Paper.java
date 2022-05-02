package models;
import java.io.*;
import java.util.*;
import java.lang.String;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;


public class Paper {
    public int docId;
    public String title;
    public String paperAbstract;
    public String url;
    public String field;

    public Paper(Integer docId, String title, String paperAbstract, String url, String field) {
        this.docId = docId;
        this.title = title;
        this.paperAbstract = paperAbstract;
        this.url = url;
        this.field = field;
    }

    private static ArrayList<Paper> Papers;
    static {
        Papers = new ArrayList<>();
        try {
            Papers = loadDocuments();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<Paper> loadDocuments() throws ParserConfigurationException, IOException, SAXException {
        String title;
        String url;
        String field;
        String abstrct;
        Integer id;
        id = 0;
        ArrayList<Paper> myPapers = new ArrayList<>();
        //open xml file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File( "app/papers.xml"));
        document.getDocumentElement().normalize();
        NodeList nList = document.getElementsByTagName("doc");
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                title = eElement.getElementsByTagName("title").item(0).getTextContent();
                url = eElement.getElementsByTagName("url").item(0).getTextContent();
                field = eElement.getElementsByTagName("field").item(0).getTextContent();
                abstrct = eElement.getElementsByTagName("abstract").item(0).getTextContent();
                id += 1;
                Paper doc = new Paper(id, title, abstrct, url, field);
                myPapers.add(doc);
            }
        }
        return myPapers;
    }

    public static ArrayList<Paper> allDocuments() {
        return Papers;
    }

    public static Paper findById(Integer docId) {
        for (Paper doc : Papers) {
            if(docId.equals(doc.docId)) {
                return doc;
            }
        }
        return null;
    }

    public static void add(Paper doc) {
        Papers.add(doc);
    }

    public int getDocId(){
        return docId;
    }
    public void setDocId(int docId) {
        this.docId = docId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPaperAbstract() {
        return paperAbstract;
    }
    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

}