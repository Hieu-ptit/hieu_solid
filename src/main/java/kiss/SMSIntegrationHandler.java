package com.company.kiss;

public class SMSIntegrationHandler implements IntegrationHandler {
    private static final String SMS = "dce";

    @Override
    public IntegrationHandler getHandlerFor(String integration) {
        if(SMS.equals(integration))
            System.out.println(integration);
        return null;
    }
}
