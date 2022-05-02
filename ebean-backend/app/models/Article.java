package models;
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article extends Model {
    @Id
    public Integer articleId;
    public String articleTitle;
    public String articleAbstract;

    public static Find<Integer, Article> findId = new Find<Integer, Article>(){};

    public static Article findById(Integer id) {
        return Article.findId
                .where()
                .eq("articleId", id)
                .findUnique();
    }

//    public static Find<String, Article> findQuery = new Find<String, Article>(){};
//
//    public static Article findByUserQuery(String query) {
//        return Article.findQuery
//                .where()
//                .ilike("articleAbstract", query); //'% query %'
//    }

}
