package com.example.minitest1.service;

import com.example.minitest1.exception.DuplicateCodeException;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

    void save(T t) throws DuplicateCodeException;

    Optional<T> findById(Long id);

    void remove(Long id);
}
