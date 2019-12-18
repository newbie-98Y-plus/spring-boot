package com.springboot.springboot.service;

import com.springboot.springboot.model.Employee;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
public interface EmployeeService {

    //获取全部用户数据
    public List<Employee> getEmpList();
    //新增用户数据
    public void createEmp(Employee employee);
    //获取指定id用户信息
    public Employee getEmp(Long id);
    //更新指定id用户信息
    public void updateEmp(Long id,Employee employee);
    //删除指定id用户
    public void deleteEmp(Long id);
}
