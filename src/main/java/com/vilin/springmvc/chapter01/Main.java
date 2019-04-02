package com.vilin.springmvc.chapter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[]{"com/vilin/springmvc/chapter01/spring-config.xml"});
        Product product1 = context.getBean("product", Product.class);
        product1.setName("Excellent snake oil");
        System.out.println("product1: " + product1.getName());

        Product product2 = context.getBean("product", Product.class);
        System.out.println("product2: " + product2.getName());

        Product featuredProduct = context.getBean("featuredProduct", Product.class);
        System.out.println(
                featuredProduct.getName()
                        + ", "
                        + featuredProduct.getDescription()
                        + ", "
                        + featuredProduct.getPrice());

        Product featuredProduct2 =  context.getBean("featuredProduct2", Product.class );
        System.out.println(
                featuredProduct2.getName()
                        + ", "
                        + featuredProduct2.getDescription()
                        + ", "
                        + featuredProduct2.getPrice());

        LocalDate localDate = context.getBean("localDate", LocalDate.class);
        System.out.println("today:" + localDate);

        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println(employee1.getHomeAddress());

        Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println(employee2.getHomeAddress());
    }
}
