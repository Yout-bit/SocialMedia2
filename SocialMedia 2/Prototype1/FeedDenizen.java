package Prototype1;

abstract class FeedDenizen {
    int ID;
    int accountID;

    public void init(int a, int b){
        ID = a;
        accountID = b;
    }

    public int getID(){
        return ID;
    }

    public int getAccount(){
        return accountID;
    }

    abstract void delete();

}
