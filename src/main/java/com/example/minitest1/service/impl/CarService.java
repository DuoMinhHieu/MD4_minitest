package com.example.minitest1.service.impl;

import com.example.minitest1.model.Car;
import com.example.minitest1.model.Type;
import com.example.minitest1.repository.ICarRepository;
import com.example.minitest1.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService implements ICarService {
    @Autowired
    private ICarRepository iCarRepository;

    @Override
    public Iterable<Car> findAll() {
        return iCarRepository.findAll();
    }

    @Override
    public void save(Car car) {
        iCarRepository.save(car);
    }

    @Override
    public Optional<Car> findById(Long id) {
        return iCarRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCarRepository.deleteById(id);
    }

    @Override
    public Iterable<Car> findAllByType(Type type) {
        return iCarRepository.findAllByType(type);
    }

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return iCarRepository.findAll(pageable);
    }

    @Override
    public Page<Car> findAllByCodeContaining(Pageable pageable, String name) {
        return iCarRepository.findAllByCodeContaining(pageable, name);
    }
}
