package com;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

@jakarta.servlet.annotation.WebListener
public class WebListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Web Application Started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("Web Application Stopped");
    }
}
