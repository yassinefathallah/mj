package com.example.projjet.repository;

import com.example.projjet.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {


}
