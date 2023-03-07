package Prototype1;

public class Account {
    int ID;
    String handle;
    String description;
    int[] timeline;

    public Account(int x, String y, String z){
        ID  = x; 
        handle = y;
        description = z;

    }
    
    
    public int getID() {
        return ID;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String str) {
        handle = str;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String str) {
        description = str;
    }

}