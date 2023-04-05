package com.example.demorest.service.impl;

import com.example.demorest.model.Customer;
import com.example.demorest.repository.ICustomerRepository;
import com.example.demorest.service.ICoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICoreService<Customer> {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public void delete(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }
}
