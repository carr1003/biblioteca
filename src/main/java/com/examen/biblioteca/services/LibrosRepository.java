package com.examen.biblioteca.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.biblioteca.model.Libro;

public interface LibrosRepository extends JpaRepository<Libro, Integer> {

}
 