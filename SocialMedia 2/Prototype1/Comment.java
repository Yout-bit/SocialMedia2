package Prototype1;

public class Comment extends FeedDenizen{
    int parentID;
    String text;
    int[] children;

    public int getParent(){
        return parentID;
    }

    public String getText(){
        return text;
    }
    
    public int[] getChildren(){
        return children;
    }

    @Override
    public void delete(){
        accountID = 0;
        text = "[POST DELETED]";
    }
}
