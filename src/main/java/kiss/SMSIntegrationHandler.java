package kiss;

public class SMSIntegrationHandler implements IntegrationHandler {
    private static final String SMS = "dce";
    private final SMSIntegrationHandler smsHandler;
    public SMSIntegrationHandler(SMSIntegrationHandler smsHandler) {
        this.smsHandler = smsHandler;
    }
    @Override
    public String getHandlerFor(String integration) {
        if (SMS.equals(integration)) {
            return integration;
        }
        throw new IllegalArgumentException("No handler found for integration: " + integration);
    }
}
