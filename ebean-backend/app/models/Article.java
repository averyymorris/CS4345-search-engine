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

    public static Find<Integer, Article> find = new Find<Integer, Article>(){};

    public static Article findById(Integer id) {
        return Article.find
                .where()
                .eq("articleId", id)
                .findUnique();
    }

}
