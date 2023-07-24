package com.wang.springboot;

import com.wang.springboot.server.WebServer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

/**
 * @author wangd1
 */
public class WangApplication {
    public static void run(Class clazz) {

        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();

        WebServer webServer = getWebServer(applicationContext);
        webServer.start();

    }

    private static WebServer getWebServer(AnnotationConfigWebApplicationContext applicationContext) {
        Map<String, WebServer> webServerMap = applicationContext.getBeansOfType(WebServer.class);
        if(webServerMap.isEmpty()){
            throw new NullPointerException("没有server配置");
        }
        if(webServerMap.size()>1){
            throw new IllegalStateException("server配置过多");
        }
        return webServerMap.values().stream().findFirst().get();
    }

}
