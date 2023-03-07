package Prototype1;

import Prototype1.FeedDenizen;
import Prototype1.Post;

import java.util.ArrayList;
import java.util.List;

import Prototype1.Comment;
import Prototype1.Endorsement;

public class Account {
    int ID;
    String handle;
    String description;
    List<FeedDenizen> timeline = new ArrayList<>(); 

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

    public int getNumberOf(String arg){
        int count = 0;
        for (FeedDenizen i : timeline){
            String type = i.getClass().getSimpleName();
            if (type.equals(arg)){
                count += 1;
            }
        }
        return count;
    }

}