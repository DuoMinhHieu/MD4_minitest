package com.example.minitest1.repository;

import com.example.minitest1.model.Type;
import org.springframework.data.repository.CrudRepository;
public interface ITypeRepository extends CrudRepository<Type, Long> {

}