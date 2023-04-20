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
public class Autos {

    private String auto;
    private int kmh;
    private short medidas;

    public Autos(String auto, int kmh, short medidas) {
        this.auto = auto;
        this.kmh = kmh;
        this.medidas = medidas;
    }

    public void corregir() {
        if (this.kmh != 0) {
            System.out.println("El auto es usado y tiene " + kmh + "km");
        } else {
            System.out.println("El auto es nuevo y es un " + this.auto);
        }
    }

    public void agradecimiento() {
        System.out.println("Es un " + auto + " tiene " + kmh + "km y mide " + medidas + "m");
    }
    
    public String getAuto(){
        return auto;
    }
    
    public int getKmh(){
        return kmh;
    }
    
    public short getMedidas(){
        return medidas;
    }
    
    public void setAuto(String auto){
        this.auto = auto;
    }
    
    public void setKmh(int kmh){
        this.kmh = kmh;
    }
    
    public void setMedidas(short medidas){
        this.medidas = medidas;
    }
}
