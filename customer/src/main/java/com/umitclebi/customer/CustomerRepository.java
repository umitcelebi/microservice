package com.umitclebi.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: ucelebi
 * Date: 20.08.2023
 * Time: 14:54
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
