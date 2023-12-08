package com.learning.banking.payload.response;

import com.learning.banking.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
	private Long id;

	private String username;
	private String fullname;
	
	
	private String secretQuestion;
	private String secretAnswer;
	
	private String phone;
	
	private String pan;
	private String aadhar;
	
	public CustomerResponse(Customer customer) {
		this.id = customer.getCustomerID();

		this.username = customer.getUsername();
		this.fullname = customer.getFullname();
		
		
		this.secretQuestion = customer.getSecretQuestion();
		this.secretAnswer = customer.getSecretAnswer();
		
		this.phone = customer.getPhone();
		
		this.pan = customer.getPan();
		this.aadhar = customer.getAadhar();
	}
}