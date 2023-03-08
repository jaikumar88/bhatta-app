/**
 * 
 */
package com.ntss.bricks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntss.bricks.domain.Customer;
import com.ntss.bricks.repositories.CustomerRepository;

/**
 * @author 3719072
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Iterable<Customer> listAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Integer id) {
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
