package main;
import java.util.*;

public class Sort<T> implements Comparador {

    public int Compare(int object1, int object2){
        if(object1 >= object2){
            return 1;
        } else if (object1 < object2){
            return -1;
        }
        else return 1;
    }
    
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> lista){
        for(int n = 0; n<lista.size(); n++){
            for(int z=0; z< lista.size()-1; z++){
                if(Compare(lista.get(z), lista.get(z+1)) > 0){
                    int u = lista.get(z);
                    lista.set(z, lista.get(z+1));
                    lista.set(z+1, u);
                }
            }
        }
       return lista; 
    }

    public ArrayList<Integer> gnomeSort(ArrayList<Integer> lista)
    {
        int index = 0;
  
        while (index < lista.size()) {
            if (index == 0)
                index++;
            if (lista.get(index) >= lista.get(index-1))
                index++;
            else {
                int temp = 0;
                temp = lista.get(index);
                lista.set(index, lista.get(index-1));
                lista.set(index-1, temp);
                index--;
            }
        }
        return lista;
    }

	public int[] mergeSort(int[] lista)
	{
		if (lista.length < 2) return lista;
		int puntoM = lista.length / 2;
		int[] inicio = new int[puntoM];
		int[] fin = new int[lista.length - puntoM];
	
		for (int i = 0; i < puntoM; i++) inicio[i] = lista[i];
		for (int i = puntoM; i < lista.length; i++) fin[i - puntoM] = lista[i];

		mergeSort(inicio);
		mergeSort(fin);
	
		return merge(lista, inicio, fin);
	}

	public int[] merge(int[] lista, int[] inicio, int[] fin)
	{
		int i = 0, j = 0, k = 0;
		while (i < inicio.length && j < fin.length)
		{
			if (inicio[i] <= fin[j]) lista[k++] = inicio[i++];
			else lista[k++] = fin[j++];				
		}
		while (i < inicio.length) lista[k++] = inicio[i++];
		while (j < fin.length) lista[k++] = fin[j++];

		return lista;
	}

    public ArrayList<Integer> Quicksort(ArrayList<Integer> data, int t){

        if(t >= 1)
        {
            ArrayList<Integer> l1 = new ArrayList<Integer>();
            ArrayList<Integer> l2 = new ArrayList<Integer>();
            int t1 = 0;
            int t2 = 0;
            int e = data.get(0);
            for(int i = 1; i<t;i++){
                if(Compare(data.get(i), e)==1)//   data.get(i)<e)
                    l2.add(t2++, data.get(i));
                else
                    l1.add(t1++, data.get(i));
            }
            Quicksort(l1, t1);
            Quicksort(l2, t2);
            data.clear();
            for(int i = 0;i<t1;i++) data.add(i,l1.get(i));
            data.add(t1,e);
            for(int i = 0;i<t2;i++) data.add(t1+i+1,l2.get(i));
            return data;
        }
            
        return data;
    }

    public ArrayList<Integer> Radix(int[] data, int n){
        int max = getMax(data,n);
        for (int place = 1; max / place >0;place*=10)
            countingsort(data, n,place);
        return arrayToList(data);
    }
    public static void countingsort(int[] arr, int n, int place){
        int [] output = new int[n];
        int [] count = new int [n];
        for (int i = 0; i<n;i++)
            count[i]=0;

        for (int i =0;i<n;i++)
            count[(arr[i]/place)%10]++;
         
        for (int i = 1; i < n; i++)
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
                mx = arr[i];
        }
        return mx;
    }
    
    public ArrayList<Integer> arrayToList(int[] array){
        ArrayList<Integer> lista = new ArrayList();
        for(int i = 0; i<array.length; i++){
            lista.add(i);
        }
        return lista;
    }
}