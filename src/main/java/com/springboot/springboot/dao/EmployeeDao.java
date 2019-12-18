package com.springboot.springboot.dao;

import com.springboot.springboot.model.Employee;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */

public interface EmployeeDao {
    public void save(Employee employee);

    public void update(Employee employee);

    public void delete(Long id);

    public List<Employee> getAll();

    public Employee findOne(Long id);
}
