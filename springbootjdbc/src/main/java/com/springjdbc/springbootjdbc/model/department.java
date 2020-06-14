package com.springjdbc.springbootjdbc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class department {
    public Integer getId() {
        return id;
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

    private Integer id;
    private String name;
}
