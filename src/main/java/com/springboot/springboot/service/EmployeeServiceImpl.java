package com.springboot.springboot.service;

import com.springboot.springboot.dao.EmployeeDao;
import com.springboot.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    EmployeeDao em;

    @Override
    public List<Employee> getEmpList() {
        List elist = jdbcTemplate.query("select * from employee",
                new BeanPropertyRowMapper(Employee.class));
        return  elist;
    }

    @Override
    public void createEmp(Employee employee) {

    }

    @Override
    public Employee getEmp(Long id) {
        return em.findOne(id);
    }

    @Override
    public void updateEmp(Long id, Employee employee) {

    }

    @Override
    public void deleteEmp(Long id) {

    }
}
