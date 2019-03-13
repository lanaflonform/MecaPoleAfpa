package fr.afpa.formation.mecanique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.afpa.formation.mecanique.entity.Vehicule;
import fr.afpa.formation.mecanique.service.VehiculeService;

@Controller
public class ControleQualiteController {

	@Autowired
	VehiculeService service;

	@GetMapping("/controlequalite")
	public String getvehicules(Model model) throws Exception {
		
		return "controlequalite";
	}

}
