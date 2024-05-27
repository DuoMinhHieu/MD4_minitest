package com.example.minitest1.repository;



import com.example.minitest1.model.Car;
import com.example.minitest1.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
public interface ICarRepository extends CrudRepository<Car, Long> {
    Iterable<Car> findAllByType(Type type);
    Page<Car> findAll(Pageable pageable);
    Page<Car> findAllByCodeContaining(Pageable pageable, String code); // Updated line
}
