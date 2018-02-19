
package NoInformado;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * lunes.12.febrero.2018
 * Arroyo Cabañas José Edoardo 2153044503
 * Soriano Germán
 * Samuel "el abandonado" Diaz
 * Caballo Dorado de ajedrez
 */
public class Principal {
    
    public static void main(String[] args){
        int xIni, yIni;
        int xFin, yFin;
        //Estado[] arreglo = null;
        //Estado[] estadosNuevos = null;
        
        
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
        
        buscarAmplitud(estadoInicial, estadoFinal);
        //System.out.println(buscarAmplitud(estadoInicial, estadoFinal));


        
    }//fin de main
    
    /**
     *
     * @param estadoInicial
     * @param estadoFinal
     */
    
    public static Cola buscarAmplitud(Estado estadoInicial, Estado estadoFinal){
        
        Cola cola = new Cola(); //Estructura FIFO que contiene los siguientes estados a revisar        
        Cola hijos = new Cola(); //Contiene los hijos del siguiente estado a revisar        
        Cola revisados = new Cola(); //Cola que contiene todos los estados revisados hasta el momento
        ArrayList<Estado> estadosNuevos = new ArrayList(); //Estructura auxiliar para almacenar los nuevos estados generados de manera temporal        
        Estado siguiente;
        Estado revisado;
               
        cola.inserta(estadoInicial);
        System.out.println(Arrays.toString(cola.toArray()));
        siguiente = cola.revisa();        
        estadosNuevos  = CreadorEstadosNuevos.creaEstados(siguiente);                
        hijos.inserta(estadosNuevos, revisados);        
        while(!cola.isEmpty()){
            revisado = cola.desencola();        
            revisados.inserta(revisado);
            if(revisado == estadoFinal)
                return revisados;
            else{
                cola.inserta(hijos.desencolaTodos());
                siguiente = cola.revisa();
                estadosNuevos = CreadorEstadosNuevos.creaEstados(siguiente);
                hijos.inserta(estadosNuevos, revisados);
            }
        }
        System.out.println("\nNo se encontró el estado final");
        return revisados;
    }//fin de buscarAmplitud
    
    
    
}//fin de la clase principal
