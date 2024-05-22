package com.example.minitest1.model;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class Car {
    @NotNull(message = "ID khong duoc bo trong")
    private Integer id;

    @NotNull(message = "Code khong duoc bo trong")
    @Size(min = 2, max = 10, message = "Code phai co tu 2-10 ky tu")
    private String code;

    @NotNull(message = "Name khon +g duoc bỏ trong")
    @Size(min = 2, max = 50, message = "Name phai co tu 2-50 ky tu")
    private String name;

    @NotNull(message = "Producer khong duoc bo trong")
    @Size(min = 2, max = 50, message = "Producer phai có tu 2-50 ky tu")
    private String producer;

    @NotNull(message = "Price khong duoc bo trong")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price phai lon hon 0")
    private BigDecimal price;

    @NotNull(message = "Type khong duoc bo trong")
    private Type type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}