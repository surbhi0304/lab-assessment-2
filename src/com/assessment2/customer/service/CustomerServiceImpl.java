package com.assessment2.customer.service;

import java.util.List;
import java.util.Optional;

import com.assessment2.customer.dao.Customer;
import com.assessment2.customer.dao.CustomerDao;
import com.assessment2.customer.dao.CustomerDaoImpl;
import com.assessment2.customer.dao.DataAccessException;


public class CustomerServiceImpl implements CustomerService {

		private CustomerDao customerDao;
		
		
		public CustomerServiceImpl() {
			customerDao=new CustomerDaoImpl();
		}

		
		public CustomerDao getEmployeeDao() {
			return customerDao;
		}


		public void setEmployeeDao(CustomerDao employeeDao) {
			this.customerDao = employeeDao;
		}

		@Override
		public List<Customer> getAllCustomers()throws DataAccessException {
			List<Customer>employees=customerDao.getAllCustomers();
			return employees;
		}

		@Override
		public void addCustomer(Customer customer) {
			customerDao.addCustomer(customer);
		}


		@Override
		public Optional<Customer> getCustomerById(int id) {
			return customerDao.getCustomerById(id);
		}

	}
