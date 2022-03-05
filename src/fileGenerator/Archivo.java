/**
 * Clase encargada del manejo del archivo tipo txt.
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 27/02/2022
 * @version 5
 */

package fileGenerator;

import java.io.*;
import java.util.*;


public class Archivo
{
    private File archivo;

	/** 
	 * @param ruta
	 * @return String
	 */
	public String crearArchivo(String ruta)
    {
        try {
            this.archivo = new File(ruta);
            return "\nArchivo creado con exito.";
        } catch (Exception e) {
            //TODO: handle exception
            return "\nOcurrio un error al intentar crear el archivo.";
        }
    }
    
	/** 
	 * @param cantidad
	 */
	public void agregarNumeros(int cantidad)
    {
		FileWriter flwriter = null;
        int x = 0;
        Random random = new Random();
		try {
			flwriter = new FileWriter(this.archivo);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			while(x < cantidad)
            {
				bfwriter.write(random.nextInt(999999) + "\n");
                x++;
			}
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Escritura realizada satisfactoriamente.");
 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/** 
	 * @return ArrayList<Integer>
	 */
	public ArrayList<Integer> leerArchivo()
	{
		try {
			ArrayList<Integer> lista = new ArrayList<Integer>();	
			Scanner scanner;
			try {
				scanner = new Scanner(this.archivo);
				while (scanner.hasNextLine())
				{
					lista.add(Integer.parseInt(scanner.nextLine()));
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return lista;
		} catch (Exception e) {
			//TODO: handle exception
			return null;
		}
	}
}
