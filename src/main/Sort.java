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

    public int[] gnomeSort(int arr[], int n)
    {
        int index = 0;
  
        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return arr;
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
}
