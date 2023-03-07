package Prototype1;

public class Endorsement extends FeedDenizen{
    int postID;

    public int getPostID() {
        return postID;
    }

    @Override
    void delete() {
        accountID = 0;
    }


}