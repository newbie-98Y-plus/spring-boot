package com.springboot.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(generator = "pid")
    private Integer id;
    @Column(name = "name",nullable = true,length = 20)
    private String name;
    @Column(name = "age",nullable = true,length = 3)
    private Integer age;
}
