package socialmedia;

import java.util.ArrayList;
import java.util.List;

public class Post extends FeedDenizen {
    int endorsements;
    String text;
    List<Integer> children;

    public Post(int id, int accID, String message){
        init(id, accID);
        this.endorsements = 0;
        this.text = message;
        this.children = new ArrayList<>();
    }

    public String getText(){
        return this.text;
    }

    public void endorse(){
        this.endorsements += 1;
    }

    public void addComment(int commentID){
        this.children.add(commentID);
    }

    public void removeComment(int commentID){
        boolean found = false;
        for (int i = 0; (i < children.size()) & !found; i++){
            if (children.get(i) == commentID){
                children.remove(i);
                found = true;
            }
        }
    }

    public int getTotalEndorsements(){
        return this.endorsements;
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
