package org.akh.digiltalbanking.repositories;

import org.akh.digiltalbanking.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
