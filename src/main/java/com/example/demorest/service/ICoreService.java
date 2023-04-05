package com.example.demorest.service;

import java.util.List;

public interface ICoreService <E>{
    void delete(Long id);
    List<E> findAll();
    E findById(Long id);
    void save(E e);
}
