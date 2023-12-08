package com.learning.banking.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerQandAResponse {
	private String securityQuestion;
	private String securityAnswer;
}
