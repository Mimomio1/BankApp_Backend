package com.learning.banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.banking.entity.Beneficiary;


@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
