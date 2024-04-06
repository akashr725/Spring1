package com.JavaSpring.AutoWiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Autowired.Impl.Flifkart;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
       
       Flifkart fkart=context.getBean("fkart",Flifkart.class);
       
      String status= fkart.delivery(new String[]{"pencil","Book"}, new float[] {100.0f,500.0f});
      System.out.println(status);
    }
}
