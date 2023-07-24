package com.wang.springboot.autoconfig;

import com.wang.springboot.AutoConfiguration;
import com.wang.springboot.ConditionOnClass;
import com.wang.springboot.server.JettyWebServer;
import com.wang.springboot.server.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangd1
 */
@Configuration
public class WebServerAutoConfiguration implements AutoConfiguration {

    @Bean
    @ConditionOnClass("org.apache.catalina.startup.Tomcat")
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }

    @Bean
    @ConditionOnClass("org.eclipse.jetty.server.Server")
    public JettyWebServer jettyWebServer(){
        return new JettyWebServer();
    }

}
