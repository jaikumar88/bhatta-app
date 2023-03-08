package com.ntss.bricks.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ntss.bricks.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
