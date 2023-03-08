/**
 * 
 */
package com.ntss.bricks.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ntss.bricks.domain.Expense;
import com.ntss.bricks.services.ExpenseService;

/**
 * @author Jai
 *
 */
@Controller
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	
	 @RequestMapping(value = "/expenses", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("expenses", expenseService.listAllExpenses());
	        System.out.println("Returning Expenses:");
	        return "expenses";
	    }

	    @RequestMapping("expense/{id}")
	    public String showProduct(@PathVariable Integer id, Model model){
	        model.addAttribute("expense", expenseService.getExpenseById(id));
	        return "expenseshow";
	    }

	    @RequestMapping("expense/edit/{id}")
	    public String edit(@PathVariable Integer id, Model model){
	        model.addAttribute("expense", expenseService.getExpenseById(id));
	        return "expenseform";
	    }

	    @RequestMapping("expense/new")
	    public String newProduct(Model model){
	        model.addAttribute("expense", new Expense());
	        return "expenseform";
	    }

	    @RequestMapping(value = "expense", method = RequestMethod.POST)
	    public String saveExpense(Expense expense){
	    	expense.setStartDate(new Date());
	    	expense.setEndDate(new Date());
	    	expenseService.saveExpense(expense);

	        return "redirect:/expense/" + expense.getId();
	    }
	/**
	 * @return the ExpenseService
	 */
	public ExpenseService getExpenseService() {
		return expenseService;
	}

	/**
	 * @param ExpenseService the ExpenseService to set
	 */
	public void setExpenseService(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	
	
}
