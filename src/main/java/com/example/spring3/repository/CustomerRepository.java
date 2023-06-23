
package com.example.spring3.repository;

import com.example.spring3.controller.dto.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findByName(String name);
}
