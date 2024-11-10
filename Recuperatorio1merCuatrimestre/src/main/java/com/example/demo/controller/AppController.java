package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Controller  // Cambiado de RestController a Controller
public class AppController {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @GetMapping("/hola")
    @ResponseBody
    public String decirHola() {
        return "holaMundo";  // Devolver el nombre del archivo Thymeleaf
    }
    
    @GetMapping("/validarEdad")
    @ResponseBody
    public String validarEdad(@RequestParam int edad) {
        String mensaje = (edad >= 0 && edad <= 18) ? "La persona tiene entre 0 y 18 años." : "Edad fuera de rango.";
        return mensaje;  // Retorna una vista de Thymeleaf
    }
    
    @GetMapping("/buscarNumero")
    @ResponseBody
    public String buscarNumero(@RequestParam int num) {
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= 100; i++) {
            numeros.add(rand.nextInt(99) + 1);
        }
        String mensaje = numeros.contains(num) ? "Número encontrado" : "Número no encontrado";
        return mensaje;  // Retorna una vista de Thymeleaf
    }

    @PostMapping("/guardarPersona")
    @ResponseBody
    public Persona guardarPersona(@RequestBody Persona persona) {
        personaRepository.save(persona);
        return persona;  // Retorna una vista que confirma el guardado
    }

    @GetMapping("/buscarPorId")
    @ResponseBody
    public Persona buscarPorId(@RequestParam Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;  // Retorna una vista con los resultados de la búsqueda
    }
    
    @GetMapping("/buscarPorNombre")
    @ResponseBody
    public List<Persona> buscarPorNombre(@RequestParam String nombre) {
    	List<Persona> persona = personaRepository.findByNombre(nombre);
    	return persona; 
    }
    
    @GetMapping("/formularioBusqueda")
    public String mostrarFormularioBusqueda(Model model) {
        model.addAttribute("persona", new Persona());
        return "formularioBusqueda"; 
    }


    @PostMapping("/buscarPorIdForm")
    public String buscarPorIdForm(@ModelAttribute Persona persona, Model model) {
        Persona resultado = personaRepository.findById(persona.getId()).orElse(null);
        model.addAttribute("persona", resultado);
        return "resultadoBusqueda"; 
    }
}
