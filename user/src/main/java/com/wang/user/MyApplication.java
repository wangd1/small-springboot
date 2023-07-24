package com.wang.user;

import com.wang.springboot.WangApplication;
import com.wang.springboot.WangStringBootApplication;

/**
 * @author wangd1
 */
@WangStringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        WangApplication.run(MyApplication.class);
    }
}
