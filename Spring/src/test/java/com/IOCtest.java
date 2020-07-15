package com;

import com.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author OriKey
 * @create 2020- 07- 15 10:27
 * -- 平凡才是唯一的答案 --
 **/
public class IOCtest {
    @Test
    public void test01(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] definitionName =
                annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String s : definitionName) {
            System.out.println(s);
        }
    }
}
