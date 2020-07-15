package com;

import com.config.MyConfig;
import com.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OriKey
 * @create 2020- 07- 14 18:39
 * -- 平凡才是唯一的答案 --
 **/
public class MyTest {
    @Test
    public void test_tradition(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beas.xml");
        Person bean = applicationContext.getBean("person",Person.class);
        System.out.println(bean);

    }
    @Test
    public void test_annotation(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

    }

    public static void main(String[] args) {

    }
}
