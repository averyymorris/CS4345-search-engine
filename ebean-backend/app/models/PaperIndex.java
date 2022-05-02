package models;
import java.util.*;

public class PaperIndex {
    public static HashMap<Paper, Integer> docs = new HashMap<>();
    public static LinkedHashMap<String, ArrayList<Integer>> indeces = new LinkedHashMap<>();

    public PaperIndex(){

    }
    public void setIndeces(LinkedHashMap<String, ArrayList<Integer>> map) {
        this.indeces = map;
    }
    public LinkedHashMap<String, ArrayList<Integer>> getIndeces() {
        return this.indeces;
    }
    public void setDocs(HashMap<Paper, Integer> map) {
        this.docs = map;
    }
    public HashMap<Paper, Integer> getDocs(){
        return this.docs;
    }

    public static LinkedHashMap<String, ArrayList<Integer>> indexDoc(Paper document) {
        if(!docs.containsValue(document.getDocId())){
            docs.put(document, document.getDocId());
        }

        ArrayList<String> myToks = new ArrayList<String>();
        myToks = utils.Analyzer.analyzeText(document.getPaperAbstract());
        String tokn;
        Integer doc;
        for(int i = 0; i < myToks.size(); i++) {
            doc = document.getDocId();
            tokn = myToks.get(i);
            ArrayList<Integer> l = null;
            if(indeces.get(tokn) == null) {
                l = new ArrayList<Integer>();
            } else {
                l = indeces.get(tokn);
            }
            if(!l.contains(doc)) {
                l.add(doc);
            }

            indeces.put(tokn, l);
        }
        //System.out.println(this.indeces);
        return indeces;
    }

    public static ArrayList<Integer> results(ArrayList<String> analyzedQuery, ArrayList<Integer> resultDocs) {
        //return the tokens in the index for each token in analyzedQuery
        String token;
        for(int i = 0; i < analyzedQuery.size(); i++) {
            token = analyzedQuery.get(i);
            if(indeces.containsKey(token)) {
                resultDocs = indeces.get(token);
            }
        }
        return resultDocs;
    }

    //add search method. this method will return the documents that contain words from the query
    public static ArrayList<Integer> search(String query, ArrayList<Paper> documents) {
        ArrayList<String> analyzedQuery = utils.Analyzer.analyzeText(query);
        ArrayList<Integer> resultDocs = new ArrayList<>();
        resultDocs = results(analyzedQuery, resultDocs);
        System.out.println("Here are the results of your query " + "\"" + query + "\"");
        for(int j = 0; j < resultDocs.size(); j ++) {
            for(int i = 0; i < documents.size(); i++) {
                if(resultDocs.get(j) == documents.get(i).getDocId()) {
                    System.out.println("    " + documents.get(i).getTitle());
                    System.out.println("    " + documents.get(i).getUrl());
                    System.out.println("    " + documents.get(i).getPaperAbstract());
                    System.out.println("\n");
                }
            }
        }
        return resultDocs;
    }

}
