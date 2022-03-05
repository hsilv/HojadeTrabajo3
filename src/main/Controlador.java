/**
 * Clase controlador, sera la encargada de tener el control de todas las acciones que realizara el programa
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 27/02/2022
 * @version 8
 */

package main;

import fileGenerator.Principal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastián
 */
public class Controlador
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal p = new Principal();
        p.generarArchivo("F:\\Java POO\\Programacion\\HojadeTrabajo3\\src\\main\\numeros.txt", 50);
        ArrayList<Integer> numeros = p.leerArchivo();
        ArrayList<Integer> numeros2 = p.leerArchivo();
        ArrayList<Integer> numeros3 = p.leerArchivo();
        Sort<Integer> sort = new Sort<Integer>();

        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        while (flag) {
            System.out.println("Que desea hacer? \n1.BubbleSort \n2.gnomeSort \n3.mergeSort \n4.QuickSort \n5.RadixSort \n6.Salir");
            int opcion = scan.nextInt();
            ArrayList<Integer> lista = new ArrayList<>();
            lista = p.leerArchivo();
            int[] nuevaLista = convertir(lista);

            System.out.println("\nDatos");
            System.out.println("\n" + lista.toString());
            while (opcion <= 0 || opcion >= 7) {
                System.out.println("Ingrese una opcion");
                opcion = scan.nextInt();
            }
            if (opcion == 1) {

                numeros = sort.bubbleSort(numeros);
            } else if (opcion == 2) {
                int[] ordenados = convertir(sort.gnomeSort(lista));
            } else if (opcion == 3) {
                int[] ordenadosMerge = sort.mergeSort(nuevaLista);
            } else if (opcion == 4) {
                ArrayList<Integer> ordenadosQuick = sort.Quicksort(numeros, 100);
            } else if (opcion == 5) {
                numeros2 = sort.Radix(convertir(numeros2), numeros2.size());
            } else if(opcion == 6){
                flag = false;
            }
    }
}

/** 
 * @param lista
 * @return int[]
 */
public static int[] convertir(ArrayList<Integer> lista) {
        int[] nuevo = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            nuevo[i] = lista.get(i);
        }
        return nuevo;
    }
}
