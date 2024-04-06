package com.SpringRealtime.CollectionInjection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DefaultListableBeanFactory dfb=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader bdr=new XmlBeanDefinitionReader(dfb);
        int i=bdr.loadBeanDefinitions("com/SpringRealtime/CollectionInjection/facultyContext.xml");
        
        System.out.println(i);
        
        FacultyDetails msgn= dfb.getBean("facultyDetails",FacultyDetails.class);
	      System.out.println(msgn);
	      
	      System.out.println("----------------------------------------");
	      
	      StudentDetails msgn2= dfb.getBean("studentDetails",StudentDetails.class);
	      System.out.println(msgn2);
	      
	      System.out.println("----------------------------------------");
	      
	      EmployeeDetails msgn3= dfb.getBean("empDetails",EmployeeDetails.class);
	      
	      System.out.println(msgn3);
	      
	      
    }
}
