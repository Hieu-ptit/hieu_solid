package com.company.kiss;

public class PushIntegrationHandler implements IntegrationHandler {
    private static final String PUSH = "glk";

    @Override
    public IntegrationHandler getHandlerFor(String integration) {
        if(PUSH.equals(integration))
            System.out.println(integration);
        return null;
    }
}
