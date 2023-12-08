package com.learning.banking.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResetPasswordRequest {
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	@NotBlank
	private String confirmPassword;
}
