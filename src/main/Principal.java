package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Controlador controlador = new Controlador();
        Sort sort = new Sort();
        Archivo archivo = new Archivo();
        String ruta = "";
        Scanner scanner = new Scanner(System.in);
        
        try {
            //System.out.println("\nPor favor, ingrese la ruta de su archivo de tipo texto.");
            //ruta = scanner.nextLine();
            //ruta = ruta + "\\numeros.txt";
            ruta = "C:\\Users\\ealva\\Documents\\GitHub\\HojadeTrabajo3\\src\\numeros.txt";
            System.out.println(archivo.crearArchivo(ruta));
            archivo.agregarNumeros(10);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("\nNo se pudo leer el documento. Por favor, asegurese que la ruta sea la correcta.");
        }

        ArrayList<Integer> lista = new ArrayList<>();
        lista = archivo.leerArchivo();
        int[] nuevaLista = controlador.convertir(lista);

        
        System.out.println("\nDatos");
        System.out.println("\n" + lista.toString());
        
        int[] ordenados = sort.gnomeSort(nuevaLista, 10);
        System.out.println("\nOrdenados con Gnome");
        System.out.println("\n" + Arrays.toString(ordenados));
        
        System.out.println("\nOrdenados con Merge");
        int[] ordenadosMerge = sort.mergeSort(nuevaLista);
        System.out.println("\n" + Arrays.toString(ordenadosMerge));
    }

    public static int pregunta(String pregunta, int opciones)
    {
        boolean bucle = true;
        int respuesta = 0;
        Scanner scanner = new Scanner(System.in);
        try 
        {
            while(bucle)
            {
                System.out.println(pregunta);
                respuesta = scanner.nextInt();
                scanner.nextLine();
                if(respuesta > 0 && respuesta <= opciones) bucle = false;
                else System.out.println("\nRepuesta no valida.\n");
            }    
        } catch (Exception e) {
            System.out.println("\nRepuesta no valida. Ingrese solamente numeros.\n");
            respuesta = pregunta(pregunta, opciones);
        }
        return respuesta;
    }


}
