package com.example.projjet.service;

import java.util.List;

import com.example.projjet.model.Projet;
import com.example.projjet.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class ProjetService {
	@Autowired
	ProjetRepository repository;
	public List<Projet> list(){
		return repository.findAll();

}
}