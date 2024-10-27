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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Controller  // Cambiado de RestController a Controller
public class AppController {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @GetMapping("/hola")
    public String decirHola(Model model) {
        model.addAttribute("mensaje", "Hola Mundo!");
        return "hola";  // Devolver el nombre del archivo Thymeleaf
    }
    
    @GetMapping("/validarEdad")
    public String validarEdad(@RequestParam int edad, Model model) {
        String mensaje = (edad >= 0 && edad <= 18) ? "La persona tiene entre 0 y 18 años." : "Edad fuera de rango.";
        model.addAttribute("mensaje", mensaje);
        return "validarEdad";  // Retorna una vista de Thymeleaf
    }
    
    @GetMapping("/buscarNumero")
    public String buscarNumero(@RequestParam int num, Model model) {
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= 100; i++) {
            numeros.add(rand.nextInt(99) + 1);
        }
        String mensaje = numeros.contains(num) ? "Número encontrado" : "Número no encontrado";
        model.addAttribute("mensaje", mensaje);
        return "buscarNumero";  // Retorna una vista de Thymeleaf
    }

    @GetMapping("/formularioPersona")
    public String mostrarFormulario(Model model) {
        model.addAttribute("persona", new Persona());
        return "formularioPersona";  // Muestra el formulario HTML
    }

    @PostMapping("/guardarPersona")
    public String guardarPersona(@ModelAttribute Persona persona, Model model) {
        personaRepository.save(persona);
        model.addAttribute("mensaje", "Persona guardada!");
        return "resultado";  // Retorna una vista que confirma el guardado
    }

    @GetMapping("/buscarPorId")
    public String buscarPorId(@RequestParam Long id, Model model) {
        Persona persona = personaRepository.findById(id).orElse(null);
        model.addAttribute("persona", persona);
        return "resultadoBusqueda";  // Retorna una vista con los resultados de la búsqueda
    }
}


