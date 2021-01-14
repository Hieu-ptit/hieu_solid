package com.company;

import com.company.kiss.*;

public class Main {
    public static void main(String[] args) {
    //     System.out.println("hello");
        IntegrationHandler integrationhandler = new EmailIntegrationHandler();
        integrationhandler.getHandlerFor("abc");
    }
}
