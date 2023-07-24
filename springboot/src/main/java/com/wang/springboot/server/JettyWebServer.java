package com.wang.springboot.server;

/**
 * @author wangd1
 */
public class JettyWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("jetty start...");
    }
}
