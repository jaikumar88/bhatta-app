/**
 * 
 */
package com.ntss.bricks.services;

import com.ntss.bricks.domain.Customer;

/**
 * @author 3719072
 *
 */
public interface CustomerService {
    Iterable<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveCustomer(Customer customer);
}
