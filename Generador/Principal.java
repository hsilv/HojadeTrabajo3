import java.util.ArrayList;
import java.util.Scanner;


public class Principal
{
    public static void main(String[] args)
    {
        String ruta = "";
        Archivo archivo = new Archivo();
        Scanner scanner = new Scanner(System.in);
        
        try {
            //System.out.println("\nPor favor, ingrese la ruta de su archivo de tipo texto.");
            //ruta = scanner.nextLine();
            //ruta = ruta + "\\datos.txt";
            ruta = "C:\\Users\\ealva\\Documents\\Java\\Generador\\numeros.txt";
            System.out.println(archivo.crearArchivo(ruta));
            archivo.agregarNumeros(1);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("\nNo se pudo leer el documento. Por favor, asegurese que la ruta sea la correcta.");
        }

        System.out.println(imprimir(archivo.leerArchivo()));
    }    

    public static String imprimir(ArrayList<Integer> lista)
    {
        String info = "";
        for(int x: lista)
        {
            info += x + "\n";
        }
        return info;
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
