package hpu.lzl.study;

import hpu.lzl.study.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class Consumer {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:consumer.xml");
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.sayHello("lzl");
    }
}
