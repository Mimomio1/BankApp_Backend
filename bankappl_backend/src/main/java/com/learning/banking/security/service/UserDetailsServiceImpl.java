package com.learning.banking.security.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.learning.banking.entity.Customer;
import com.learning.banking.exceptions.NoDataFoundException;
import com.learning.banking.repo.CustomerRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	CustomerRepository customerRepository;

	@Transactional
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer user = customerRepository.findByUsername(username)
				.orElseThrow(() -> new NoDataFoundException("user not find with username " + username));

		return UserDetailsImpl.build(user);

	}

}
