/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg1;

/**
 *
 * @author Alumno
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autos Gol = new Autos("volksvagen",70000,(short)65);
        Autos renault12 = new Autos("renault",86000,(short)709);
        
        renault12.agradecimiento();
        
        Gol.corregir();
        
    
    }
    
}
