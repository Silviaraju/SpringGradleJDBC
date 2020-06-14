package com.springjdbc.springbootjdbc.model;

public class Employee {
    private Integer id;
    private String name;
    private String city;

    private department department;

    public Integer getId() {
        return id; }

    public com.springjdbc.springbootjdbc.model.department getDepartment() {
        return department;
    }

    public void setDepartment(com.springjdbc.springbootjdbc.model.department department) {
        this.department = department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

