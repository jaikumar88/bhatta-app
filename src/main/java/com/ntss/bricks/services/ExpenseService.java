/**
 * 
 */
package com.ntss.bricks.services;

import com.ntss.bricks.domain.Expense;

/**
 * @author 3719072
 *
 */
public interface ExpenseService {
    Iterable<Expense> listAllExpenses();

    Expense getExpenseById(Integer id);

    Expense saveExpense(Expense expense);
}
