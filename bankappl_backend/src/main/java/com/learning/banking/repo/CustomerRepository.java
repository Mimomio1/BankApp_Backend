package com.learning.banking.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.banking.entity.Account;
import com.learning.banking.entity.Customer;
import com.learning.banking.enums.UserRoles;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	@Transactional 
	@Override
	<S extends Customer> S save(S entity);
	
	@Transactional
	@Override
	<S extends Customer> List<S> saveAll(Iterable<S> entities);
	
	Optional<Customer> findByUsername(String username);
	boolean existsByUsername(String username);
	
	List<Customer> findCustomersByrolesRoleName(UserRoles roleName);
	
	
	
}
