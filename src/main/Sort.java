package main;
import java.util.*;

public class Sort<T> implements Comparador {

    public int Compare(int object1, int object2){
        if(object1 > object2){
            return object1;
        } else if (object1 < object2){
            return object2;
        } else{
            return object1;
        }
    }
    
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> lista){
       return null; 
    }
}
