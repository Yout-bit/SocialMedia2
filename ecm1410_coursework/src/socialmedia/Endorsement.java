package socialmedia;
import java.util.ArrayList;
import java.util.List;


public class Endorsement extends FeedDenizen{
    int postID;

    public Endorsement(int id, int accID, int targetID){
        init(id, accID);
        this.postID = targetID;

    }

    public void endorse(){
    }
    
    public int getParent() {
        return this.postID;
    }

    public int getTotalComments(){
        return 0;
    }


    @Override
    void delete() {
        this.accountID = 0;
    }

    @Override
    List<Integer> getChildren(){
        return new ArrayList<>();
    }
}