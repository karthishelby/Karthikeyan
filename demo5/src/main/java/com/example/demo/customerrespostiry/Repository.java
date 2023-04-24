package com.example.demo.customerrespostiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.customer.CustomerDetails;

public interface Repository extends JpaRepository<CustomerDetails, Integer> {

}
