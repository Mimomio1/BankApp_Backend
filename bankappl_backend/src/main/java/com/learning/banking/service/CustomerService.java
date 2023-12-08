package com.learning.banking.service;

import java.util.List;
import java.util.Optional;

import com.learning.banking.entity.Customer;
import com.learning.banking.enums.UserRoles;
import com.learning.banking.exceptions.NoRecordsFoundException;


public interface CustomerService {
	Customer addCustomer(Customer customer);
	Optional<Customer> getCustomerByID(long id);
	Optional<Customer> getCustomerByUsername(String username);
	List<Customer> getAllCustomers();
	boolean deleteCustomerByID(long id);
	Customer updateCustomer(Customer customer) throws NoRecordsFoundException;
	boolean existsByID(long id);
	boolean existsByUsername(String username);
	List<Customer> findCustomersByrolesRoleName(UserRoles roleName);
}
