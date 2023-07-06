package socialmedia;

import java.util.List;

abstract class FeedDenizen {
    int ID;
    int accountID;

    public void init(int id, int accID){
        this.ID = id;
        this.accountID = accID;
    }

    public int getID(){
        return this.accountID * 10000 + this.ID;
    }

    public int getPostID(){
        return this.ID;
    }

    public int getAccount(){
        return this.accountID;
    }

    abstract List<Integer> getChildren(); 

    abstract void delete();

    abstract void endorse();

    abstract int getTotalComments();

    public int getParent(){
        return 0;
    }


    public int getTotalEndorsements(){
        return 0;
    }

    public String getText(){
        return null;
    }
}
