package com.example.demo;

import com.example.demo.GeneradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GeneradorController {

    @Autowired
    private GeneradorService generadorService;

    @GetMapping("/generar")
    public Map<String, Object> generar(@RequestParam int identificador) {
        ArrayList<Integer> lista = generadorService.generador();
        boolean existe = lista.contains(identificador);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("lista", lista);
        respuesta.put("identificador", identificador);
        respuesta.put("existe", existe);

        return respuesta;
    }
}
