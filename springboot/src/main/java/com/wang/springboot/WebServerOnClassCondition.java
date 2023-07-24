package com.wang.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;
import java.util.Objects;

/**
 * @author wangd1
 */
public class WebServerOnClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        assert annotationAttributes != null;
        String className = (String) annotationAttributes.get("value");
        try {
            Objects.requireNonNull(context.getClassLoader()).loadClass(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
