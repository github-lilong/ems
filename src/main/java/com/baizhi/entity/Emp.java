package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {
    private Integer id;

    private String username;

    private String realname;

    private String password;

    private Integer sex;

    private Integer age;

    private Double salary;

    public void test() {
        System.out.println(123);
    }
}