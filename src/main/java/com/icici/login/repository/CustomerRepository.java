package com.icici.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icici.login.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findById(long id);
}
