package main;

public class Sort
{
    public void gnomeSort(int[] nums)
    {
        int i=1;
        int j=2;
        
        while(i < nums.length)
        {
            if(nums[i-1] <= nums[i])
            {
                i = j;
                j++;
            }
            else
            {
                int tmp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i--] = tmp;
                i = (i==0) ? j++ : i;
            }
        }
    }

    //////////////////////////

    public Integer[] mergeSort(Integer[] arreglo)
    {
		Integer[] arr = arreglo;
		mSort(arr, 0, arr.length - 1);
		return arr;
	}
	
	public void mSort(Integer[] arreglo, int inicio, int fin)
    {
		if(inicio<fin) {
			// Encontrar el punto medio del arreglo
			int medio = inicio + (fin - inicio) / 2;
		
			// Ordenar cada mitad
			mSort(arreglo, inicio, medio);
			mSort(arreglo, medio + 1, fin);
			
			// Unir las dos mitades
			merge(arreglo, inicio, medio, fin);
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
}