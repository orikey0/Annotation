package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author OriKey
 * @create 2020- 07- 14 18:34
 * -- 平凡才是唯一的答案 --
 **/
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
