package com.example.minitest1.service;

import com.example.minitest1.model.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    private static List<Type> types = new ArrayList<>();

    @Override
    public List<Type> getAllTypes() {
        return types;
    }

    @Override
    public Type getTypeById(int id) {
        for (Type type : types) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }

    @Override
    public void addType(Type type) {
        types.add(type);
    }

    @Override
    public void updateType(Type updatedType) {
        for (Type type : types) {
            if (type.getId() == updatedType.getId()) {
                type.setName(updatedType.getName());
                break;
            }
        }
    }

    @Override
    public void deleteType(int id) {
        types.removeIf(type -> type.getId() == id);
    }

    @Override
    public List<Type> findAll() {
        return null;
    }

    @Override
    public Type findById(Long id) {
        return null;
    }

    @Override
    public Type save(Type type) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
