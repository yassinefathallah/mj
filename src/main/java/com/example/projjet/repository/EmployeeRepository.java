package com.example.projjet.repository;

import java.util.Optional;

import com.example.projjet.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Optional<Employee> findByNom (String nom);


}
