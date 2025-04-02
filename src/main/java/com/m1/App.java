package com.m1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this line creates the
                                                                                       // container
                                                                                       // in maven
        // or spring project
        // the container is created with bean factory in earlier versions we use bean
        // factory but now we use AoolicationContext
        // to avoid this error we can give ClassPathXmlApplicationContext(spring.xml)
        // but we should create this file
        // for that create a directory called resources in main
        // so for spring to create object we it creates in spring.xml
        // even after this it gives error so we can go to spring 6 bean configuration in
        // google
        // take the beans tag and replace it with it
        Dev obj = context.getBean(Dev.class);

        // Dev obj = (Dev) context.getBean("dev");
        // this is how we can take using id if we gave id attribute in bean and we
        // should typecast it with Dev

        obj.build();

        // as soon as the poject is run if the bean is created if spring.xml the object
        // is created.

        System.out.println(obj.getAge()); // output will be zero initial since we didn't set any value but if we keep
                                          // property tag
        // in spring.xml and give inital value it give that value

    }
}
