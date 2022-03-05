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
        Principal p = new Principal();
        p.generarArchivo("F:\\Java POO\\Programacion\\HojadeTrabajo3\\src\\main\\numeros.txt", 10000);
        Sort<Integer> sort = new Sort<Integer>();
        ArrayList<Integer> numeros = p.leerArchivo();
        numeros = sort.bubbleSort(numeros);
        for(Integer numero: numeros){
            System.out.println(numero);
        }
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista = archivo.leerArchivo();
        int[] nuevaLista = controlador.convertir(lista);

        
        System.out.println("\nDatos");
        System.out.println("\n" + lista.toString());
        
        int[] ordenados = sort.gnomeSort(nuevaLista, 10);
        System.out.println("\nOrdenados con Gnome");
        System.out.println("\n" + Arrays.toString(ordenados));
        
        System.out.println("\nOrdenados con Merge");
        int[] ordenadosMerge = sort.mergeSort(nuevaLista);
        System.out.println("\n" + Arrays.toString(ordenadosMerge));

    }

    public static int[] convertir(ArrayList<Integer> lista) {
        int[] nuevo = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            nuevo[i] = lista.get(i);
        }
        return nuevo;
    }
}
