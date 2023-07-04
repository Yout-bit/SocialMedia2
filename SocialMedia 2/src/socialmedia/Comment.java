package socialmedia;
import java.util.ArrayList;
import java.util.List;

public class Comment extends FeedDenizen{
    int parentID;
    int endorcements;
    String text;
    List<Integer> children;

    public Comment(int id, int accID, int postID, String message){
        init(id, accID);
        this.parentID = postID;
        this.text = message;
        this.children = new ArrayList<>();
        this.endorcements = 0;
    }

    public int getParent(){
        return this.parentID;
    }

    public int getTotalComments(){
        return this.children.size();
    }

    public void endorse(){
        this.endorcements += 1;
    }

    public String getText(){
        return this.text;
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
