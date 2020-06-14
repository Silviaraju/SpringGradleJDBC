package com.springjdbc.springbootjdbc.repository;

import com.springjdbc.springbootjdbc.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {
    String insertData(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    String updateEmployee(Integer id, String name);

    List<Map<String, Object>> getCombinedData();


}

