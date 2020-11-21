/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_sahorycano;

/**
 *
 * @author sahor
 */
public class Carrera {

    protected String Carrera;
   
    protected int Costo_mensual;
    protected String Jefe_carrera;
 

    public Carrera() {

    }

    public Carrera(String Carrera,  int Costo_mensual, String Jefe_carrera) {
        this.Carrera = Carrera;
      
        this.Costo_mensual = Costo_mensual;
        this.Jefe_carrera = Jefe_carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    

    public int getCosto_mensual() {
        return Costo_mensual;
    }

    public void setCosto_mensual(int Costo_mensual) {
        this.Costo_mensual = Costo_mensual;
    }

    public String getJefe_carrera() {
        return Jefe_carrera;
    }

    public void setJefe_carrera(String Jefe_carrera) {
        this.Jefe_carrera = Jefe_carrera;
    }

    @Override
    public String toString() {
        return "Carrera{" + "Carrera=" + Carrera + '}';
    }

    
   

}
