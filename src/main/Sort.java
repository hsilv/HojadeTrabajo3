package main;

public class Sort
{
	public Sort()
	{
		
	}
    public void gnomeSort(int[] lista)
    {
        int i=1;
        int j=2;
        
        while(i < lista.length)
        {
            if(lista[i - 1] <= lista[i])
            {
                i = j;
                j++;
            }
            else
            {
                int x = lista[i - 1];
                lista[i - 1] = lista[i];
                lista[i--] = x;
				if(i == 0) j++;
            }
        }
    }

	////////////////////////////////////////////////

    public Integer[] mergeSort(Integer[] lista)
    {
		mSort(lista, 0, lista.length - 1);
		return lista;
	}
	
	public void mSort(Integer[] arreglo, int inicio, int fin)
    {
		if(inicio > fin) return;
		else
		{
			int puntoM = inicio + (fin - inicio) / 2;
		
			// Ordenar cada mitad
			mSort(arreglo, inicio, puntoM);
			mSort(arreglo, puntoM + 1, fin);
			
			// Unir las dos mitades
			merge(arreglo, inicio, puntoM, fin);
		}
	}
	
	public void merge(Integer[] arreglo, int inicio, int medio, int fin)
    {
		// Encontrar el tamano de los subarreglos a ser unidos
		int n1 = medio - inicio + 1;
		int n2 = fin - medio;

		// Crear arreglos temporales
		Integer[] arr1 = new Integer[n1];
		Integer[] arr2 = new Integer[n2];

		// Copiar la informacion a los arreglos temporales
		for (int i = 0; i < n1; ++i)
			arr1[i] = arreglo[inicio + i];
		for (int j = 0; j < n2; ++j)
			arr2[j] = arreglo[medio + 1 + j];

		// Unir los arreglos temporales

		// Indices iniciales de cada subarreglo
		int i = 0;
        int j = 0;

		// Indice inicial del arreglo unido
		int k = inicio;
		while (i < n1 && j < n2)
        {
			if (arr1[i] <= arr2[j])
            {
				arreglo[k] = arr1[i];
				i++;
			}
			else
            {
				arreglo[k] = arr2[j];
				j++;
			}
			k++;
		}

		// Copiar elementos restantes de arr1[] si los hay
		while (i < n1)
        {
			arreglo[k] = arr1[i];
			i++;
			k++;
		}

		// Copiar elementos restantes de arr2[] si los hay
		while (j < n2)
        {
			arreglo[k] = arr2[j];
			j++;
			k++;
		}
	}

	/////////////////////////////////////

	public void mergeSort(int[] lista)
	{
		if (lista.length < 2) return;
		int puntoM = lista.length / 2;
		int[] inicio = new int[puntoM];
		int[] fin = new int[lista.length - puntoM];
	
		for (int i = 0; i < puntoM; i++) inicio[i] = lista[i];
		for (int i = puntoM; i < lista.length; i++) fin[i - puntoM] = lista[i];

		mergeSort(inicio);
		mergeSort(fin);
	
		merge(lista, inicio, fin);
	}

	public static void merge(int[] lista, int[] inicio, int[] fin)
	{
		int i = 0, j = 0, k = 0;
		while (i < inicio.length && j < fin.length)
		{
			if (inicio[i] <= fin[j]) lista[k++] = inicio[i++];
			else lista[k++] = fin[j++];				
		}
		while (i < inicio.length) lista[k++] = inicio[i++];
		while (j < fin.length) lista[k++] = fin[j++];
	}
}