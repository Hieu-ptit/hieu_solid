package kiss;

public class EmailIntegrationHandler implements IntegrationHandler {
    private static final String EMAIL = "abc";
    private final EmailIntegrationHandler emailHandler;
    public EmailIntegrationHandler(EmailIntegrationHandler emailHandler) {
        this.emailHandler = emailHandler;
    }
    @Override
    public String getHandlerFor(String integration){
        if(EMAIL.equals(integration)) {
            return integration;
        }
        throw new IllegalArgumentException("No handler found for integration: " + integration);
    }
}
