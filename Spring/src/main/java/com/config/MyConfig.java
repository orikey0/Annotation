package com.config;

import com.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author OriKey
 * @create 2020- 07- 14 19:11
 * -- 平凡才是唯一的答案 --
 **/
@Configuration
@ComponentScan(value = "com",excludeFilters = {
        @Filter(type = FilterType.ASSIGNABLE_TYPE,classes ={Controller.class, Service.class} )
},useDefaultFilters = true)

/*note:
* @Repeatable
* excludeFilters 除外过滤规则
* includeFilters 只包含规则，需要在最后开启useDefalutFilters = false;
*
*
* 自定义注解
* FilterType.ANNOTATION 根据注解进行过滤
* FilterType.ASSIGNABLE_TYPE 根据注解类型进行过滤
* FilterType.REGEX 根据正则表达式进行过滤
* */
public class MyConfig {
    @Bean("person")
    public Person person01(){
        return new Person("李四",13);
    }
}
