/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;

import Generador.*;

/**
 *
 * @author Sebastián
 */
public class Controlador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Sort sort = new Sort();
        Archivo archivo = new Archivo();
        archivo.crearArchivo("C:\\Users\\ealva \\Documents\\GitHub\\HojadeTrabajo3\\src\\main");
        archivo.agregarNumeros(100);

        ArrayList<Integer> lista = new ArrayList<>();
        lista = archivo.leerArchivo();
        
        System.out.println("Welcome");
        

    }
    
}
