package com.springjdbc.springbootjdbc.dao;

import com.springjdbc.springbootjdbc.model.Employee;
import com.springjdbc.springbootjdbc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbctemplate;

    @Override
    public String insertData(Employee employee) {
        String sql = "insert into employee values(?,?,?,?)";
        jdbctemplate.update(sql, new Object[]
                {employee.getId(),employee.getName(),employee.getCity(),employee.getDepartment().getId()});
        return "Data inserted successfully";
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "select * from employee";
        List<Employee> list = jdbctemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        return list;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        String sql = "select * from employee where id=?";
        Employee emp = jdbctemplate.queryForObject(sql, new Object[] {id},
                new BeanPropertyRowMapper<>(Employee.class));
        return emp;
    }

    @Override
    public String updateEmployee(Integer id, String name) {
        String sql = "update employee set name=? where id=?";
        jdbctemplate.update(sql, new Object[] {name,id});
        return "Employee data updated successfully";
    }

    @Override
    public List<Map<String, Object>> getCombinedData() {
        String sql = "select a.id,a.name,a.city,b.name as Dept_name from employee a, department b where a.dept_id=b.id";
        List<Map<String, Object>> list = jdbctemplate.queryForList(sql);
        return list;
    }


}
