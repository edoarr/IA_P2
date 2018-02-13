/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voraz;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Principal {
    
    /**
     *
     * @param args
     */
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
        xIni = leerXI.nextInt();
        yIni = leerYI.nextInt();
        System.out.print("\nIndique las coordenadas de la posisción final del caballo: ");
        xFin = leerXF.nextInt();
        yFin = leerYF.nextInt();
        
        estadoInicial = new Estado(xIni, yIni);
        estadoFinal = new Estado(xFin, yFin);
        


        
    }//fin de main
}//fin de la clase principal
