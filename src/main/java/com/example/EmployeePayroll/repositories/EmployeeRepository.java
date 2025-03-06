package com.example.EmployeePayRoll.repositories;

import com.example.EmployeePayRoll.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
