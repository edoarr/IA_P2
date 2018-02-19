/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoInformado;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author invitado
 */
public class Cola extends LinkedList{
    
    Queue<Estado>  cola;
    
    
//constructor
    Cola() {
        this.cola = new LinkedList<>();
    }
       
    


//métodos:     
    public void inserta(Estado e){   
        cola.add(e);
    }//fin del método inserta
    
    public void inserta(ArrayList estadosNuevos, Cola revisados){               
       for (Object varTemporal : estadosNuevos ) {
            if(!revisados.contains(varTemporal)){
                cola.add((Estado) varTemporal);
            }
       }        
    }//fin del método Inserta sin repetir
    
    public Estado revisa(){
        return (Estado) cola.peek();
    }//fin del método revisa
    
    public Estado desencola(){ 
        return (Estado) cola.poll();
    }//fin del método desencola
    
    public Estado desencolaTodos(){ 
        for(Object varTemporal : cola){
            return (Estado) cola.poll();            
        }
        return null;
        
    }//fin del método desencola
    
    
}//fin de la clase Cola
