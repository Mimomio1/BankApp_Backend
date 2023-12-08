package com.learning.banking.payload.response;

import java.time.LocalDate;

import com.learning.banking.entity.Customer;
import com.learning.banking.enums.CustomerStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestGetCustomersResponse {
	private long customerId;
	private String customerName;
	private CustomerStatus status;
	private LocalDate created;
	
	public TestGetCustomersResponse(Customer customer) {
		this.customerId = customer.getCustomerID();
		this.customerName = customer.getFullname();
		this.status = customer.getStatus();
		this.created = customer.getDateCreated().toLocalDate();
	}
}
