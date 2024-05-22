package com.example.minitest1.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Type {
    @NotNull(message = "ID khong duoc de trong")
    private Integer id;

    @NotNull(message = "Ten khong dươc de trong")
    @Size(min = 2, max = 30, message = "ten phai có tu 2-30 ki tu")
    private String name;

    public Type(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
}