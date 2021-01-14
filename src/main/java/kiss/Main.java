package kiss;

public class Main {
    private static PushIntegrationHandler pushHandler;

    public static void main(String[] args) {
        String str = "abc";
       // SMSIntegrationHandler SMS  = new SMSIntegrationHandler()
        PushIntegrationHandler push = new PushIntegrationHandler(pushHandler);
        push.getHandlerFor(str);
    }
}
