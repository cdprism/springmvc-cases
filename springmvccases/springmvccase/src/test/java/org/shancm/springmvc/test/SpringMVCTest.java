package org.shancm.springmvc.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author shancm
 * @package org.shancm.springmvc.test
 * @description:
 * @date 2018/6/25
 */
public class SpringMVCTest {
    @Value("${what}")
    private String what;

    @Value("${the}")
    private String the;

    @Test
    public void runTest(){
        System.out.println(what);
        System.out.println(the);
    }
}
