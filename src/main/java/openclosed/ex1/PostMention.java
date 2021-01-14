package openclosed.ex1;

import single.responsibility.cohension.ex3.Database;

public class PostMention extends Post{
    @Override
    void CreatePost(Database db, String postMessage) {
        db.addAsMentionPost(postMessage);
    }
}
