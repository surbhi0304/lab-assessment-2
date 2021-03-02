package com.assessment2.customer.dao;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
	List<Customer> getAllCustomers() throws DataAccessException;
	public Customer addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id);
}
