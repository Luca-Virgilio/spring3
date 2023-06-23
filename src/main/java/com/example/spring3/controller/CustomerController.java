package com.example.spring3.controller;

import com.example.spring3.controller.dto.Customer;
import com.example.spring3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/all")
    List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    Customer getCustomerById(Integer id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("/find")
    Customer findCustomerByName(@RequestParam(value = "name", required = true) String name){
        return customerService.findCustomerByName(name);
    }


}
