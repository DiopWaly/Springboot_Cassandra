package com.example.demo.cassandra.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cassandra.modal.Etudiant;
import com.example.demo.cassandra.repository.EtudiantRepository;

@RestController
public class EtudiantController {

	@Autowired
	private EtudiantRepository rep;
	
	@PostConstruct
	public void saveEtudiants() {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		etudiants.add(new Etudiant("N123","Diop","Papa waly","M"));
		etudiants.add(new Etudiant("N124","Coly","Mady","M"));
		etudiants.add(new Etudiant("N125","Mbengue","Momar","M"));
		etudiants.add(new Etudiant("N127","Ndiaye","Fatou","F"));
		etudiants.add(new Etudiant("N126","Diop","Marie","F"));
		rep.saveAll(etudiants);
	}
	
	@GetMapping("/getAllEtudiants")
	public List<Etudiant> getEtudiants(){
		System.out.println("/home");
		for(Etudiant e: rep.findAll()) {
			System.out.println(e.toString());
		}
		return rep.findAll();
	}
	
	
	
	public EtudiantController() {
		// TODO Auto-generated constructor stub
	}

}
