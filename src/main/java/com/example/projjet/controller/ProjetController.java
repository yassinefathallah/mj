package com.example.projjet.controller;

import java.util.List;

import com.example.projjet.model.Projet;
import com.example.projjet.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProjetController {
	@Autowired
	private ProjetService projetservice;
	@GetMapping("/projets")
	 public List<Projet> list() {
		 return projetservice.list();
	 }

}
