package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class GeneradorService {

    public ArrayList<Integer> generador() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            lista.add(rand.nextInt(100));
        }

        return lista;
    }
}
