package kiss;

public class PushIntegrationHandler implements IntegrationHandler {
   // private final PushIntegrationHandler pushHandler;
    private static final String PUSH = "glk";
    private final PushIntegrationHandler pushHandler;
    public PushIntegrationHandler(PushIntegrationHandler pushHandler) {
       this.pushHandler = pushHandler;
    }
    @Override
    public String getHandlerFor(String integration)  {
        if(PUSH.equals(integration)){
            return integration;
           // System.out.println(integration);
        }
        throw new IllegalArgumentException("No handler found for integration: " + integration);
        //System.out.println(integration);
    }
}
