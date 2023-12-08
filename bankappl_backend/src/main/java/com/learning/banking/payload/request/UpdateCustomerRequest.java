package com.learning.banking.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {
	@NotBlank
	private String fullname;
	@NotBlank
	private String phone;
	@NotBlank
	private String pan;
	@NotBlank
	private String aadhar;
	@NotBlank
	private String secretQuestion;
	@NotBlank
	private String secretAnswer;


}
