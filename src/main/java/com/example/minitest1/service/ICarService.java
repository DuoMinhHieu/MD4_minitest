package com.example.minitest1.service;

import com.example.minitest1.model.Car;

import javax.validation.Valid;
import java.util.List;

public interface ICarService {
    List<Car> getAllCars();
    void addCar(@Valid Car car);
}