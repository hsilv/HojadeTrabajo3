/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fileGenerator.Principal;
import java.util.ArrayList;

/**
 *
 * @author Sebastián
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola a todos");
        Principal p = new Principal();
        p.generarArchivo("F:\\Java POO\\Programacion\\HojadeTrabajo3\\src\\main\\numeros.txt", 10000);
        ArrayList<Integer> numeros = p.leerArchivo();
    }

    public int[] convertir(ArrayList<Integer> lista) {
        int[] nuevo = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            nuevo[i] = lista.get(i);
        }
        return nuevo;
    }
}
