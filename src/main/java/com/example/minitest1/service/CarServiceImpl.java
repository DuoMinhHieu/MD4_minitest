package com.example.minitest1.service;

import com.example.minitest1.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car getCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void updateCar(Car updatedCar) {
        for (Car car : cars) {
            if (car.getId() == updatedCar.getId()) {
                car.setCode(updatedCar.getCode());
                car.setName(updatedCar.getName());
                car.setProducer(updatedCar.getProducer());
                car.setPrice(updatedCar.getPrice());
                car.setTypeId(updatedCar.getTypeId());
                break;
            }
        }
    }

    @Override
    public void deleteCar(int id) {
        cars.removeIf(car -> car.getId() == id);
    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public Car findById(Long id) {
        return null;
    }

    @Override
    public Car save(Car car) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
