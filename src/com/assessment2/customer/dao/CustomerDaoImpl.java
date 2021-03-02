package com.assessment2.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class CustomerDaoImpl implements CustomerDao {
	
	private Connection connection;
	
	public CustomerDaoImpl() {
		this.connection=ConnectionFactory.getConnection();
	}

	@Override
	public List<Customer> getAllCustomers()throws DataAccessException {
		List<Customer> customers = new ArrayList<>();
		Customer customer = null;
	
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from cust");

			while (rs.next()) {
				customer = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
						rs.getString("phone"), rs.getDate("dob"));
				customers.add(customer);
			}
		}catch(SQLException ex) {
			throw new DataAccessException (ex.getMessage());
		}
		

		return customers;
	}


	@Override
	public Customer addCustomer(Customer customer) {
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into customer_new(name, address, phoneNumber, dob) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer. getPhoneNumber());
			pstmt.setDate(4, new java.sql.Date(customer.getDob().getTime()));
			
			pstmt.executeUpdate();
			
			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next()) {
				customer.setId(rs.getInt(1));
			}
			
		}catch(SQLException ex) {
			throw new DataAccessException(ex.getCause().toString());
		}
		return customer;
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		PreparedStatement pstmt;
		Customer customer=null;
		try {
			pstmt = connection.prepareStatement("select * from cust where id=?");
			pstmt.setInt(1, id);

			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				customer=new Customer
						(rs.getInt("id"), 
						rs.getString("name"),
						rs.getString("address"),
						rs.getString("phone"), 
						rs.getDate("dob")); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.ofNullable(customer);
	}
	

}
