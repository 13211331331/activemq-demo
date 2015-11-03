package com.icfwx.mqtest.test;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.jms.core.JmsTemplate;
/**
 * Created by cfwx on 2015/11/2.
 */
public class Receiver {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext-*.xml");

      /*  JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        while(true) {
            Map<String, Object> map =  (Map<String, Object>) jmsTemplate.receiveAndConvert();

            System.out.println("收到消息：" + map.get("message"));
        }*/
    }
}
