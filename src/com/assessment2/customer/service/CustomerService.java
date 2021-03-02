package com.assessment2.customer.service;

import java.util.List;
import java.util.Optional;

import com.assessment2.customer.dao.Customer;
import com.assessment2.customer.dao.DataAccessException;

public interface CustomerService {
	public List<Customer> getAllCustomers() throws DataAccessException;

	public void addCustomer(Customer customer);

	public Optional<Customer> getCustomerById(int id);

}
