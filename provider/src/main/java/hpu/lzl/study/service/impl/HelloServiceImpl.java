package hpu.lzl.study.service.impl;

import hpu.lzl.study.service.HelloService;

/**
 * @Author: li_zhilei
 * @Date: create in 16:20 17/8/13.
 * @description:
 */
public class HelloServiceImpl implements HelloService{

    public void sayHello(String str) {
        System.out.println(str + "say hello !" );
    }
}
