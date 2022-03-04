/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;

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
        archivo.crearArchivo("C:\\Users\\ealva\\Documents\\GitHub\\HojadeTrabajo3\\src\\main");
        archivo.agregarNumeros(10);

        ArrayList<Integer> lista = new ArrayList<>();
        lista = archivo.leerArchivo();
        int[] nuevaLista = convertir(lista);

        for (int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }
        
        sort.gnomeSort(nuevaLista);
        
        for (int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }
    }

    public static int[] convertir(ArrayList<Integer> lista)
    {
        int[] nueva = lista.stream().mapToInt(i -> i).toArray();

        return nueva;
    }
    
}