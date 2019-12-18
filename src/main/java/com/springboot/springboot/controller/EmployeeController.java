package com.springboot.springboot.controller;

import com.springboot.springboot.model.Employee;
import com.springboot.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService es;

    @GetMapping("/employee")
    public List<Employee> getAllEmp() {
        return es.getEmpList();
    }

    @GetMapping("/{id}")
    public Employee getEmp(@PathVariable(name = "id") Long id) {
        return es.getEmp(id);
    }
}
