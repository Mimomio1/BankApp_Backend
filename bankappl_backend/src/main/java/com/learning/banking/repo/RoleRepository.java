package com.learning.banking.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.banking.entity.Role;
import com.learning.banking.enums.UserRoles;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByRoleName(UserRoles roleName);
	Role getByRoleName(UserRoles roleName);
}
