package com.example.projjet.repository;

import com.example.projjet.model.Employee;
import com.example.projjet.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TacheRepository extends JpaRepository<Tache , Long> {




}
