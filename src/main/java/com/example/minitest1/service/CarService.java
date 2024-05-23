package com.example.minitest1.service;

import com.example.minitest1.model.Car;
import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    Car getCarById(int id);

    void addCar(Car car);

    void updateCar(Car updatedCar);

    void deleteCar(int id);

    List<Car> findAll();

    Car findById(Long id);

    Car save(Car car);

    void deleteById(Long id);
}
