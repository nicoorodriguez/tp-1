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
public class Licencia {
    
    private int edad;
    private int fecha_de_nacimiento;
    private String nombrec;
    private String localidad;

    public Licencia(int edad, int fecha_de_nacimiento, String nombrec, String localidad) {
        this.edad = edad;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.nombrec = nombrec;
        this.localidad = localidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(int fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void datos(){
        if (this.edad > 18){
         System.out.println("la licencia contiene los siguientes datos: " + this.edad + ", " +this.localidad + ", " + this.nombrec + ", " +this.fecha_de_nacimiento);
        }
        else {
        System.out.println("No se tiene datos por lo que no se puede obtener licencia");
        }
    }
}
