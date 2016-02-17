package com.sdu.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloBean");
		obj.printHello();
    }
}
