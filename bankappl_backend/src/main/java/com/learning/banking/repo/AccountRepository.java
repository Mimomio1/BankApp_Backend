package com.learning.banking.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.banking.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {
	@Transactional 
	@Override
	<S extends Account> S save(S entity);
	
	@Transactional 
	@Override
	<S extends Account> List<S> saveAll(Iterable<S> entities);
	
	boolean existsByAccountNumber(Long accountNumber);

	Optional<Account> findAccountByAccountNumber(Long accountNumber);
	
	List<Account> findAccountsByCustomerCustomerID(Long id);
}
