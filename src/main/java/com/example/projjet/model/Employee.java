package com.example.projjet.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private int age;
	private String mail;
	private String password;
	private String Role;
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "employee",cascade = CascadeType.REMOVE,orphanRemoval = true)
	@JsonIgnore
	private  Set<Projet> projet=new HashSet<>();
    @ManyToOne
	private Tache tache ;

	
	public Set<Projet> getProjet() {
		return projet;
	}







	public void setProjet(Set<Projet> projet) {
		this.projet = projet;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}


	public Employee(long id, String nom, int age, String mail, String password, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.mail = mail;
		this.password = password;
		Role = role;
		
	}


	public Employee() {
		super();
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}
}
