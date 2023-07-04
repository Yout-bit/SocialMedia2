package socialmedia;

import java.util.ArrayList;
import java.util.List;

public class Post extends FeedDenizen {
    int endorcements;
    String text;
    List<Integer> children;

    public Post(int id, int accID, String message){
        init(id, accID);
        this.endorcements = 0;
        this.text = message;
        this.children = new ArrayList<>();
    }

    public String getText(){
        return this.text;
    }

    public void endorse(){
        this.endorcements += 1;
    }

    public int getTotalEndorsments(){
        return this.endorcements;
    }

    public int getTotalComments(){
        return this.children.size();
    }

    @Override
    public List<Integer> getChildren(){
        return this.children;
    }

    @Override
    public void delete(){
        this.accountID = 0;
        this.text = "[POST DELETED]";
    }
}
