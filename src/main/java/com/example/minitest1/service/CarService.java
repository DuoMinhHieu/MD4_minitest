package com.example.minitest1.service;

import com.example.minitest1.model.Car;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ICarService{
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public void addCar(@Valid Car car) {
        cars.add(car);
    }
}
