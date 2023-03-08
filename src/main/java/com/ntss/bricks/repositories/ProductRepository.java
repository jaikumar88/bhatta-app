package com.ntss.bricks.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ntss.bricks.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
