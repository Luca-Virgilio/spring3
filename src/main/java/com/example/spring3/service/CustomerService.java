package com.example.spring3.service;

import com.example.spring3.controller.dto.Customer;
import com.example.spring3.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(Integer id){
        return customerRepository.findById(id).orElseThrow();
    }

    public Customer findCustomerByName(String name){
        Assert.state(Character.isUpperCase(name.charAt(0)), "Name must start with uppercase letter.");
        return customerRepository.findByName(name);
    }

}
