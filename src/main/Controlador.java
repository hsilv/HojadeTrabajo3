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
public class Controlador
{
    public int[] convertir(ArrayList<Integer> lista)
    {
        int[] nueva = lista.stream().mapToInt(i -> i).toArray();

        return nueva;
    }
    
}