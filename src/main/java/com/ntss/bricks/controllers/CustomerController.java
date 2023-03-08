/**
 * 
 */
package com.ntss.bricks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ntss.bricks.domain.Customer;
import com.ntss.bricks.services.CustomerService;

/**
 * @author Jai
 *
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	 @RequestMapping(value = "/customers", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("customers", customerService.listAllCustomers());
	        System.out.println("Returning customers:");
	        return "customers";
	    }

	    @RequestMapping("customer/{id}")
	    public String showProduct(@PathVariable Integer id, Model model){
	        model.addAttribute("customer", customerService.getCustomerById(id));
	        return "customershow";
	    }

	    @RequestMapping("customer/edit/{id}")
	    public String edit(@PathVariable Integer id, Model model){
	        model.addAttribute("customer", customerService.getCustomerById(id));
	        return "customerform";
	    }

	    @RequestMapping("customer/new")
	    public String newProduct(Model model){
	        model.addAttribute("customer", new Customer());
	        return "customerform";
	    }

	    @RequestMapping(value = "customer", method = RequestMethod.POST)
	    public String saveCustomer(Customer customer){

	    	customerService.saveCustomer(customer);

	        return "redirect:/customer/" + customer.getId();
	    }
	/**
	 * @return the customerService
	 */
	public CustomerService getCustomerService() {
		return customerService;
	}

	/**
	 * @param customerService the customerService to set
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	
}
