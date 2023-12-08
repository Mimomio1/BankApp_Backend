package com.learning.banking.payload.response;

import com.learning.banking.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCustomerResponse {
	private Long id;

	private String username;
	private String fullname;
	
	
	public RegisterCustomerResponse(Customer customer) {
		this.id = customer.getCustomerID();
		this.username = customer.getUsername();
		this.fullname = customer.getFullname();
		
	}
}
