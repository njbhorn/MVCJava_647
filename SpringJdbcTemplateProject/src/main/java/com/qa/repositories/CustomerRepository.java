package com.qa.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.qa.beans.Customer;


@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int addCustomer(int customerId,String name,String address)
	{
	
		String query = "insert into customer values(?,?,?)";
		
		int i = jdbcTemplate.update(query, new Object[]{customerId,name,address});
		
		return i;
	}
	
	public int updateCustomerAddressById(String address,int customerId)
	{
	
        String query = "UPDATE customer set address = ? where customerId = ?";
		
		int i = jdbcTemplate.update(query, new Object[]{address,customerId});
		
		return i;
	}
	
	public List<Customer> findCustomerById(int customerId)
	{
        List<Customer> customerList = jdbcTemplate.query("select * from customer where customerId = ?",new Object[]{customerId}, new MyRowMapper());
		
		return customerList;
	}
	
	public List<Customer> findAllCustomers()
	{
		List<Customer> customerList = jdbcTemplate.query("select * from customer", new MyRowMapper());
		
		System.out.println("Number of Customers are :"+customerList.size());
		
		return customerList;
		
	}
	
	public int deleteCustomerById(int customerId)
	{
       String query = "DELETE from customer where customerId = ?";
		
		int i = jdbcTemplate.update(query, new Object[]{customerId});
		
		return i;
		
	}
	
	
	private class MyRowMapper implements RowMapper<Customer>
	{

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Customer c1 = new Customer();
			c1.setCustomerId(rs.getInt(1));
			c1.setName(rs.getString(2));
			c1.setAddress(rs.getString(3));
			return c1;
		}
		
	}
	
	
	
	
}
