package main;

import java.util.ArrayList;

import javafx.scene.control.IndexRange;

public class Sort<T> implements Comparador {
    //Quicksort
    int N = 10;
    public int Compare(int object1, int object2){
        if (object1 >= object2)
            return 1;
        else
            return -1;
    }
    public void Quicksort(ArrayList<Integer> data, int t){
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        int t1 = 0;
        int t2 = 0;
        int e = data.get(0);

        for(int i = 1; i<t;i++){
            if(Compare(data.get(i), e)==1)//   data.get(i)<e)
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

    public void Radix(int[] data, int n){
        int max = getMax(data,n);
        for (int place = 1; max / place >0;place*=10)
            countingsort(data, n,place);
    }
    public void countingsort(int[] arr, int n, int place){
        int [] output = new int[n];
        int [] count = new int [N];
        for (int i = 0; i<N;i++)
            count[i]=0;

        for (int i =0;i<n;i++)
            count[(arr[i]/place)%10]++;
         
        for (int i = 1; i < N; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
    //metod para encontrar el mayor de la lista (para radix)
    static int getMax(int[] arr,int n){
        int mx = arr[0];
        for (int i = 1 ;i<n;i++){
            if (arr[i]>mx)
                mx = arr[n];
        }
        return mx;
    }
    
    
}
