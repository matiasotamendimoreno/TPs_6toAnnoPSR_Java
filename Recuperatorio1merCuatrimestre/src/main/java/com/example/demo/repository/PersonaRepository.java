package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	List<Persona> findByNombre(String nombre);
	Persona findFirstByNombre(String nombre);
}
