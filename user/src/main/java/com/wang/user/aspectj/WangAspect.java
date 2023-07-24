package com.wang.user.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author wangd1
 * @author wangd1
 */
@Component
@Aspect
public class WangAspect {

    @Before("execution(public * com.wang.user.service.UserService.getUser())")
    public void wangBefore() {
        System.out.println("wangBefore");
    }

}
