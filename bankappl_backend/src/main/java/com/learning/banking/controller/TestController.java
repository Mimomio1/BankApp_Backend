package com.learning.banking.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.banking.entity.Account;
import com.learning.banking.entity.Beneficiary;
import com.learning.banking.entity.Customer;
import com.learning.banking.entity.Role;
import com.learning.banking.enums.AccountStatus;
import com.learning.banking.enums.AccountType;
import com.learning.banking.enums.BeneficiaryStatus;
import com.learning.banking.enums.CustomerStatus;
import com.learning.banking.enums.UserRoles;
import com.learning.banking.payload.response.TestGetCustomersResponse;
import com.learning.banking.payload.response.TestCustomerResponse;
import com.learning.banking.repo.CustomerRepository;
import com.learning.banking.repo.RoleRepository;

@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PutMapping("/addRoles")
	public ResponseEntity<?> addRoles() {
		for (UserRoles role : UserRoles.values()) {
			roleRepo.save(new Role(role));
		}

		List<Role> roles = roleRepo.findAll();

		return ResponseEntity.ok(roles);
	}

	@PutMapping("/addAdmin")
	public ResponseEntity<?> addAdmin() {
		Customer admin = new Customer();
		admin.setFullname("Administrator");
		admin.setUsername("admin@admin.com");
		admin.setPassword(passwordEncoder.encode("admin123"));
		admin.getRoles().add(roleRepo.getByRoleName(UserRoles.ROLE_ADMIN));
		admin.setSecretQuestion("What's your favorite fil?");
		admin.setSecretAnswer("Knowing");
		admin.setPhone("123-456-7891");
		admin.setDateCreated(LocalDateTime.now());
		admin.setStatus(CustomerStatus.ENABLED);

		Customer updated = customerRepo.save(admin);
		return ResponseEntity.ok(new TestGetCustomersResponse(updated));
	}

	@PutMapping("/addStaff")
	public ResponseEntity<?> addStaff() {
		Customer admin = new Customer();
		admin.setFullname("Administrator");
		admin.setUsername("staff01");
		admin.setPassword(passwordEncoder.encode("123"));
		admin.getRoles().add(roleRepo.getByRoleName(UserRoles.ROLE_STAFF));
		admin.setSecretQuestion("What's your favorite color?");
		admin.setSecretAnswer("Blue");
		admin.setPhone("111-111-1111");
		admin.setDateCreated(LocalDateTime.now());
		admin.setStatus(CustomerStatus.ENABLED);

		Customer updated = customerRepo.save(admin);
		return ResponseEntity.ok(new TestGetCustomersResponse(updated));
	}

	@PutMapping("/addStuff")
	public ResponseEntity<?> addStuff() {
		Customer customer1 = new Customer();
		customer1.setFullname("Dudley");
		customer1.setUsername("dudley");
		customer1.setPassword(passwordEncoder.encode("password"));
		customer1.getRoles().add(roleRepo.getByRoleName(UserRoles.ROLE_CUSTOMER));
		customer1.setSecretQuestion("What's your favorite color?");
		customer1.setSecretAnswer("Blue");
		customer1.setPhone("111-111-1111");
		customer1.setDateCreated(LocalDateTime.now());
		customer1.setStatus(CustomerStatus.ENABLED);

		Account account1 = new Account();
		account1.setAccountType(AccountType.CHECKING);
		account1.setApproved(false);
		account1.setAccountBalance(new BigDecimal("100000.00"));
		account1.setDateOfCreation(LocalDateTime.now());
		account1.setAccountStatus(AccountStatus.ENABLED);
		account1.setCustomer(customer1);

		customer1.getAccounts().add(account1);

		Customer customer2 = new Customer();
		customer2.setFullname("Steve");
		customer2.setUsername("steve");
		customer2.setPassword("password");
		customer2.getRoles().add(roleRepo.getByRoleName(UserRoles.ROLE_CUSTOMER));
		customer2.setSecretQuestion("What's your favorite color?");
		customer2.setSecretAnswer("Red");
		customer2.setPhone("222-222-2222");
		customer2.setDateCreated(LocalDateTime.now());
		customer2.setStatus(CustomerStatus.ENABLED);

		Account account2 = new Account();
		account2.setAccountType(AccountType.CHECKING);
		account2.setApproved(false);
		account2.setAccountBalance(new BigDecimal("100000.00"));
		account2.setDateOfCreation(LocalDateTime.now());
		account2.setAccountStatus(AccountStatus.DISABLED);
		account2.setCustomer(customer2);

		customer2.getAccounts().add(account2);

		Beneficiary benefit1 = new Beneficiary(account2, customer1);
		benefit1.setAddedDate(LocalDate.now());
		benefit1.setApproved(true);
		benefit1.setActive(BeneficiaryStatus.YES);
		customer1.getBeneficiaries().add(benefit1);

		Beneficiary benefit2 = new Beneficiary(account1, customer2);
		benefit2.setAddedDate(LocalDate.now());
		benefit2.setApproved(false);
		benefit2.setActive(BeneficiaryStatus.YES);
		customer2.getBeneficiaries().add(benefit2);

		List<Customer> updated = customerRepo.saveAll(Arrays.asList(customer1, customer2));

		List<TestCustomerResponse> responseBody = updated.stream().map(c -> {
			return new TestCustomerResponse(c);
		}).collect(Collectors.toList());

		return ResponseEntity.ok(responseBody);
	}

	@GetMapping("/customers")
	public ResponseEntity<?> getCustomers() {
		List<Customer> customers = customerRepo.findAll();
		return ResponseEntity.ok(customers.stream().map(c -> {
			return new TestCustomerResponse(c);
		}).collect(Collectors.toList()));
	}
}
