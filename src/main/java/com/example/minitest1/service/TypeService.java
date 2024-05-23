package com.example.minitest1.service;

import com.example.minitest1.model.Type;
import java.util.List;

public interface TypeService {

    List<Type> getAllTypes();

    Type getTypeById(int id);

    void addType(Type type);

    void updateType(Type updatedType);

    void deleteType(int id);

    List<Type> findAll();

    Type findById(Long id);

    Type save(Type type);

    void deleteById(Long id);
}

