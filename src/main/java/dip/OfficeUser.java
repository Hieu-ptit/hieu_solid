package dip;

import openclosed.ex0.IPost;
import openclosed.ex0.Post;
import single.responsibility.cohension.ex3.Database;

public class OfficeUser {
    private IPost ipost;
    public void setIpost(IPost ipost) {
        this.ipost = ipost;
    }
    public void publishNewPost() {
        Database db = new Database();
        String postMessage = "example message";
        ipost.CreatePost(db, postMessage);
    }
}
