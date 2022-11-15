package com.example.projjet.controller;

import com.example.projjet.model.Projet;
import com.example.projjet.model.Tache;
import com.example.projjet.repository.TacheRepository;
import com.example.projjet.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TacheController {
    @Autowired
    TacheService tacheService;
    @Autowired
    TacheRepository tacheRepository;

    @GetMapping("/tache")

    public List<Tache> GETALLTACHE() {

            return tacheRepository.findAll();
        }




}
