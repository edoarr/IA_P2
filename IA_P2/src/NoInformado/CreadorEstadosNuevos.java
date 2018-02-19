/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoInformado;

import java.util.ArrayList;

/**
 *
 * @author edoarr
 */
public class CreadorEstadosNuevos extends Estado{
    
    static Estado nuevo;
    
    static ArrayList<Estado> estadosNuevos = new ArrayList();

    public CreadorEstadosNuevos(int x, int y) {
        super(x, y);
    }



    public static ArrayList<Estado> creaEstados(Estado siguiente){
        
        estadosNuevos.add(dosArr_unoDer(siguiente));
        estadosNuevos.add(dosArr_unoIzq(siguiente)); 
        
        estadosNuevos.add(dosAba_unoDer(siguiente));
        estadosNuevos.add(dosAba_unoIzq(siguiente));
        
        estadosNuevos.add(dosDer_unoArr(siguiente));
        estadosNuevos.add(dosDer_unoAba(siguiente));
        
        estadosNuevos.add(dosIzq_unoArr(siguiente));
        estadosNuevos.add(dosIzq_unoAba(siguiente));
        
        return estadosNuevos;
    }
    
    public static Estado dosArr_unoDer(Estado siguiente){
        
        if(siguiente.x <= 7 && siguiente.y <= 6){
            nuevo = new CreadorEstadosNuevos(siguiente.x + 1, siguiente.y + 2);
            return nuevo;            
        }
        return null;
    }//fin de dosArr_unoDer
    
    public static Estado dosArr_unoIzq(Estado siguiente){
        
        if(siguiente.x >= 2 && siguiente.y <= 6){
            nuevo = new CreadorEstadosNuevos(siguiente.x - 1, siguiente.y + 2);
            return nuevo;     

        }
        return null;
    }//fin de dosArr_unoIzq
    
    
    
    
    public static Estado dosAba_unoDer(Estado siguiente){
        
        if(siguiente.x <= 7 && siguiente.y >= 3){
            nuevo = new CreadorEstadosNuevos(siguiente.x + 1, siguiente.y - 2);
            return nuevo;     

        }
        return null;
    }//fin de dosAba_unoDer
    
    public static Estado dosAba_unoIzq(Estado siguiente){
        
        if(siguiente.x >= 2 && siguiente.y >= 3){
            nuevo = new CreadorEstadosNuevos(siguiente.x - 1, siguiente.y - 2);
            return nuevo;     

        }
        return null;
    }//fin de dosAba_unoIzqu
    
    
    
    
    
    public static Estado dosDer_unoArr(Estado siguiente){
        
        if(siguiente.x <= 6 && siguiente.y <= 7){
            nuevo = new CreadorEstadosNuevos(siguiente.x + 2, siguiente.y + 1);
            return nuevo;     
        }
        return null;
    }//fin de dosDer_unoArr
  
    public static Estado dosDer_unoAba(Estado siguiente){
        
        if(siguiente.x <= 6 && siguiente.y >= 2){
            nuevo = new CreadorEstadosNuevos(siguiente.x + 2, siguiente.y - 1);
            return nuevo;     
        }
        return null;
    }//fin de dosDer_unoAba
    
    
    
    
    
    
    public static Estado dosIzq_unoArr(Estado siguiente){
        
        if(siguiente.x >= 3 && siguiente.y <= 7){
            nuevo = new CreadorEstadosNuevos(siguiente.x - 2, siguiente.y + 1);
            return nuevo;     
        }
        return null;
    }//fin de dosIzq_unoArr
    
    
    public static Estado dosIzq_unoAba(Estado siguiente){
        
        if(siguiente.x >= 3 && siguiente.y >= 2){
            nuevo = new CreadorEstadosNuevos(siguiente.x - 2, siguiente.y - 1);
            return nuevo;     
        }
        return null;
    }//fin de dosIzq_unoArr
    
}//fin clase CreadorEstadosNuevo
