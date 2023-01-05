package org.vigilantex.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing
{
    public static void main(String[] args)
    {
        //Old method using bean factory
       // BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
       //Triangle t= (Triangle) beanFactory.getBean("triangle");
       //t.draw();

        //New method Application context=ApplContext is big bro of beanfactory

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:spring.xml");
        Triangle t= (Triangle) applicationContext.getBean("t-alias");
        t.draw();



    }

}
