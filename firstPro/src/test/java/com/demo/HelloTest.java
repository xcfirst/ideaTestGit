package com.demo;

import org.junit.Test;

/**
 * @Author: CaiXiaoChun
 * @Description:
 * @Data: Created in 14:34 2021/3/15
 * @Modified By:
 * @Vesion 1.0
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
