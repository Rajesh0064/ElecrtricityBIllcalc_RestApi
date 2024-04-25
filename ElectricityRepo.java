package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Electricity;

public interface ElectricityRepo extends JpaRepository<Electricity, Integer> {

}
