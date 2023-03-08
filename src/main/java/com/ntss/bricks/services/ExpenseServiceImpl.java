/**
 * 
 */
package com.ntss.bricks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntss.bricks.domain.Expense;
import com.ntss.bricks.repositories.ExpenseRepository;

/**
 * @author 3719072
 *
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public Iterable<Expense> listAllExpenses() {
		return expenseRepository.findAll();
	}

	@Override
	public Expense getExpenseById(Integer id) {
		return expenseRepository.findById(id).orElse(null);
	}

	@Override
	public Expense saveExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

}
