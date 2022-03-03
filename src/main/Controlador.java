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
    public static void main(String[] args) {
        System.out.println("Welcome");
    }
    //Convierte un ArrayList a array para ser enviado a RadixSort
    static int[] convertor(ArrayList<Integer> arr){
        int [] nuevo = new int[arr.size()];
        for (int i = 0; i<arr.size();i++){
            nuevo[i] = arr.get(i);
        }
        return nuevo;
    }
}
