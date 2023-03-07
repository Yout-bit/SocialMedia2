package Prototype1;

public class Post extends FeedDenizen {
    String text;
    int[] children;

    public Post(int a, int b, String c){
        init(a, b);
        text = c;
    }
    
    public String GetText(){
        return text;
    }
    public int[] GetChildren(){
        return children;
    }

    @Override
    public void delete(){
        accountID = 0;
        text = "[POST DELETED]";
    }
}
