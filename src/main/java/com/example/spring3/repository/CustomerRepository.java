
package com.example.spring3.repository;

import com.example.spring3.controller.dto.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
