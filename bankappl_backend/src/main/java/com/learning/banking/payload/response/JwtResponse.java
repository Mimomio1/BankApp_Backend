package com.learning.banking.payload.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
	private String token;
    private final String type = "Bearer";
    private Long id;
    private String username;
    private List<String> roles;
}
