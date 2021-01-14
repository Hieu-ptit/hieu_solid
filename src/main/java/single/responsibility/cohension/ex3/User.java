package single.responsibility.cohension.ex3;

class User {
    public void CreatePost(Database db, String postMessage,log Log) {
        try {
            db.Add(postMessage);
        } catch (Exception ex) {
            Log.logError("An error occured: ", ex.toString());
            FileUtil.writeAllText("LocalErrors.txt", ex.toString());
        }
    }
}