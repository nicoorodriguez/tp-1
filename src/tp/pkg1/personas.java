/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class personas {
    
    private String nombre;
    private int edad;
    private int dni;
    private Licencia licencia;
    private ArrayList<Autos> autos;
            
    
    public personas(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.autos = new ArrayList<Autos>();
    }

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    
    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void licencia(){
        if (this.edad > 18) {
        System.out.println("puede tener licencia");
        }
        else {
        System.out.println("no puede tener licencia, es menor de edad");
        }
    }
    
    public void auto(){
        System.out.println("Tiene " + autos.size() + " autos");
        for(Autos auto : autos){
            System.out.println(auto.getAuto());
        }
    }
}
