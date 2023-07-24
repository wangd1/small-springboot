package com.wang.springboot.autoconfig;

import com.wang.springboot.AutoConfiguration;
import com.wang.springboot.ConditionOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangd1
 */
@Configuration
public class AopAutoConfiguration implements AutoConfiguration {
    @Configuration
    @EnableAspectJAutoProxy
    @ConditionOnClass("org.aspectj.weaver.Advice")
    class AopConfig {

    }
}
