package com.icfwx.mqtest.test;
import java.util.Date;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.core.MessageCreator;
/**
 * Created by cfwx on 2015/11/2.
 */
public class Sender {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext-*.xml");
       // JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");

       /* jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                message.setString("message", "current system time: " + new Date().getTime());

                return message;
            }
        });*/
    }

}
