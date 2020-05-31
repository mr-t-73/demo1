package org.webservice.demo;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws ServletException, LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8222);
        Context context = tomcat.addContext("/", new File(".").getAbsolutePath());
        Wrapper wrapper = tomcat.addServlet(context,"reply", "org.glassfish.jersey.servlet.ServletContainer");
        // This wrapper will work too
        //  Wrapper wrapper = tomcat.addServlet(context,"reply", new ServletContainer(new ResourceConfig(new JerseyApplication().getClasses())));
        wrapper.addInitParameter("jersey.config.server.provider.packages", "org.webservice.demo");
        context.addServletMapping("/json/*", "reply");
        tomcat.start();
        tomcat.getServer().await();

    }
}
