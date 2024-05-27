package com.example.minitest1.service;

import com.example.minitest1.model.Car;
import com.example.minitest1.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICarService extends IGenerateService<Car> {
    Iterable<Car> findAllByType(Type type);
    Page<Car> findAll(Pageable pageable);
    Page<Car> findAllByCodeContaining(Pageable pageable, String code); // Updated line
}
