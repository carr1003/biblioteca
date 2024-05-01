package com.examen.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examen.biblioteca.model.Libro;
import com.examen.biblioteca.services.LibrosRepository;

@Controller
@RequestMapping("/libros")
public class LibrosController {
	
	@Autowired
	private LibrosRepository librosRepository;
	
	@GetMapping({"","/"})
	public String listarLibros(Model model) {
		List<Libro> libros = librosRepository.findAll();
		model.addAttribute("libros", libros);
		return "libros/index";
	}
}
