/**
 * Clase principal para la creacion y lectura del archivo txt.
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 27/02/2022
 * @version 6
 */

package fileGenerator;

import java.util.*;


public class Principal
{
    Archivo file;
    
    /** 
     * @param ruta
     * @param numeros
     */
    public void generarArchivo(String ruta, int numeros)
    {
        Archivo archivo = new Archivo();
        this.file = archivo;
        Scanner scanner = new Scanner(System.in);
        
        try {
            //System.out.println("\nPor favor, ingrese la ruta de su archivo de tipo texto.");
            //ruta = scanner.nextLine();
            //ruta = ruta + "\\datos.txt";
            System.out.println(archivo.crearArchivo(ruta));
            archivo.agregarNumeros(numeros);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("\nNo se pudo leer el documento. Por favor, asegurese que la ruta sea la correcta.");
        }
    }    
    
    /** 
     * @param lista
     * @return String
     */
    public static String imprimir(ArrayList<Integer> lista)
    {
        String info = "";
        for(int x: lista)
        {
            info += x + "\n";
        }
        return info;
    }
    
    /** 
     * @param pregunta
     * @param opciones
     * @return int
     */
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
                if(respuesta > 10 && respuesta <= opciones) bucle = false;
                else System.out.println("\nRepuesta no valida.\n");
            }    
        } catch (Exception e) {
            System.out.println("\nRepuesta no valida. Ingrese solamente numeros.\n");
            respuesta = pregunta(pregunta, opciones);
        }
        return respuesta;
    }
    
    /** 
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> leerArchivo (){
        return this.file.leerArchivo();
    }
}
