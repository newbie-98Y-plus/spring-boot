package com.springboot.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    Integer id;
    String name;
    Integer sex;
    Date jiontime;
}
