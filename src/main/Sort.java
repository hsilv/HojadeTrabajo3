package main;

public class Sort<T> implements Comparador {

    public int Compare(int object1, int object2){
        if(object1 >= object2){
            return 1;
        } else if (object1 < object2){
            return -1;
        }
    }
    
}
