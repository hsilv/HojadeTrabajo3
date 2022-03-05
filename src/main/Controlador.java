/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fileGenerator.Principal;
import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Integer> numeros2 = p.leerArchivo();
        numeros = sort.bubbleSort(numeros);
        for(Integer numero: numeros){
            System.out.println(numero);
        }
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista = p.leerArchivo();
        int[] nuevaLista = convertir(lista);

        
        System.out.println("\nDatos");
        System.out.println("\n" + lista.toString());
        
        int [] ordenados = convertir(sort.gnomeSort(lista));
        System.out.println("\nOrdenados con Gnome");
        System.out.println("\n" + Arrays.toString(ordenados));
        
        System.out.println("\nOrdenados con Merge");
        int[] ordenadosMerge = sort.mergeSort(nuevaLista);
        System.out.println("\n" + Arrays.toString(ordenadosMerge));

        System.out.println("\nOrdenados con Quick");
        ArrayList<Integer> ordenadosQuick = sort.Quicksort(numeros, 100);
        System.out.println("\n" + ordenadosQuick.toString());
        
        numeros2 = sort.Radix(convertir(numeros2), numeros2.size());
        for(Integer numero: numeros2){
            System.out.println(numero);
        }
    }

    public static int[] convertir(ArrayList<Integer> lista) {
        int[] nuevo = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            nuevo[i] = lista.get(i);
        }
        return nuevo;
    }
}