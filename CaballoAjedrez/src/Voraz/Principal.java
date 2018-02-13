
package Voraz;
import java.util.Scanner;
/*
 * lunes.12.febrero.2018
 * Arroyo Cabañas José Edoardo 2153044503
 * Soriano Germán
 * Caballo Dorado de ajedrez
 */
public class Principal {
    
    public static void main(String[] args){
        int xIni, yIni;
        int xFin, yFin;
        
        
        Estado estadoInicial = null;
        Estado estadoFinal = null;
        
        Scanner leerXI = new Scanner(System.in);
        Scanner leerYI = new Scanner(System.in);
        Scanner leerXF = new Scanner(System.in);
        Scanner leerYF = new Scanner(System.in);
        
        
        System.out.print("\nIndique las coordenadas de la posisción inicial del caballo: ");
        System.out.print("\nx: ");
        xIni = leerXI.nextInt();
        System.out.print("y: ");
        yIni = leerYI.nextInt();
        
        System.out.print("\nIndique las coordenadas de la posisción final del caballo: ");
        System.out.print("\nx: ");
        xFin = leerXF.nextInt();
        System.out.print("y: ");
        yFin = leerYF.nextInt();
        
        estadoInicial = new Estado(xIni, yIni);
        estadoFinal = new Estado(xFin, yFin);
        
        


        
    }//fin de main
    
    /**
     *
     * @param estadoInicial
     * @param estadoFinal
     */
    public void primeroAmplitud(Estado estadoInicial, Estado estadoFinal){
        
    }
    
    
    
}//fin de la clase principal
