package main;

import java.util.ArrayList;

public class Sort<T> implements Comparador {
    //Quicksort
    public void Quicksort(ArrayList<Integer> data, int t){
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        int t1 = 0;
        int t2 = 0;
        int e = data.get(0);

        for(int i = 1; i<t;i++){
            if(data.get(i)<e)
                l1.add(t1++, data.get(i));
            else
                l2.add(t2++, data.get(i));        
        }
        Quicksort(l1, t1);
        Quicksort(l2, t2);
        data.clear();
        for(int i = 0;i<t1;i++)
            data.add(i,l1.get(i));
        data.add(t1,e);
        for(int i = 0;i<t2;i++)
            data.add(t1+i+1,l2.get(i));
    }

    public void Radix(ArrayList<Integer> data){
        
    }
}
