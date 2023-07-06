package socialmedia;

import java.util.ArrayList;
import java.util.List;

public class Account {
    int ID; 
    String handle;
    String description;
    List<FeedDenizen> timeline;

    public Account(int x, String y, String z){
        this.ID = x; 
        this.handle = y;
        this.description = z;
        this.timeline = new ArrayList<>();

    }
    
    public int getID() {
        return this.ID;
    }

    public String getHandle() {
        return this.handle;
    }

    public void setHandle(String str) {
        this.handle = str;
    }

    public String getDescription() {
        return this.description;
    }

    public List<FeedDenizen> getTimeline(){
        return this.timeline;
    }

    public int[] mostEndorsements(){
        int previous = 0;
        int previousID = 0; 
        for (FeedDenizen i : this.timeline){
            if (i.getTotalEndorsements() > previous){
                previous = i.getTotalEndorsements();
                previousID = i.getID();
            }
        }
        return new int[] {previous, previousID};
    }

    public FeedDenizen getPost(int id) throws PostIDNotRecognisedException{
        for (FeedDenizen i : this.timeline){
            if (id == i.getPostID()){
                return i;
            }
        } 
        throw new PostIDNotRecognisedException();
    }

    public FeedDenizen getKnownPost(int id){
        for (FeedDenizen i : this.timeline){
            if (id == i.getPostID()){
                return i;
            }
        }
        return new Post(0, 0, "");
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public int getNumberOf(String arg){
        int count = 0;
        for (FeedDenizen i : this.timeline){
            String type = i.getClass().getSimpleName();
            if (type.equals(arg)){
                count += 1;
            }
        }
        return count;
    }

    public List<Integer> delete(){
        List<Integer> orphans = new ArrayList<>(); 
        for (FeedDenizen i : this.timeline){
            orphans.addAll(1, i.getChildren());
            i.delete();
        }
        this.handle = "[DELETED USER]";
        this.description = "";
        this.timeline = new ArrayList<>();
        return orphans;
    }

    public Post post(String message){
        Post post = new Post(this.timeline.size(), this.ID, message); 
        this.timeline.add(post);
        return post;
    }

    public Endorsement endorse(int id){
        Endorsement endorsement = new Endorsement(this.timeline.size(), this.ID, id);
        this.timeline.add(endorsement);
        return endorsement;
    }

    public Comment comment(String message, int postID){
        Comment comment = new Comment(this.timeline.size(), this.ID, postID, message);
        this.timeline.add(comment);
        return comment;
    }

    public List<Integer> deletePost(int id) throws PostIDNotRecognisedException{
        FeedDenizen post = getPost(id);
        List<Integer> orphans = post.getChildren();
        post.delete();
        return orphans;
    }
}