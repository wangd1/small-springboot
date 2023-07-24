package com.wang.springboot;

import com.wang.springboot.WebServerOnClassCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangd1
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Conditional(WebServerOnClassCondition.class)
public @interface ConditionOnClass {
    String value();
}
