package com.company.kiss;

public class EmailIntegrationHandler implements IntegrationHandler{
    private static final String EMAIL = "abc";
    @Override
    public IntegrationHandler getHandlerFor(String integration) {
        if(EMAIL.equals(integration))
            System.out.println(integration);
        return null;
    }
}
