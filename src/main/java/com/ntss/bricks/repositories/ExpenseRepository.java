package com.ntss.bricks.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ntss.bricks.domain.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Integer>{
}
