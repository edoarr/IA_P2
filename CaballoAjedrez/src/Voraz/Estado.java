/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voraz;

/**
 *
 * @author invitado
 */
public class Estado {
    //int[] coordenadas;
    double valorHeuristico;
    Caballo caballo = null;

    Estado(int xIni, int yIni) {
        this.caballo = new Caballo(xIni, yIni);
    }
    
    public void creaEstados(){
        
    }
    
    
    
    
    
}//fin de la clase Estado
