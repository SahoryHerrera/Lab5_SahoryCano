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
public class Clases {

    private String Nombre;
    private String Sección;
    private int edificio;
    private int salon;
    private String Aire_Acondicionado;

    public Clases() {

    }

    public Clases(String Nombre, String Sección, int edificio, int salon, String Aire_Acondicionado) {
        this.Nombre = Nombre;
        this.Sección = Sección;
        this.edificio = edificio;
        this.salon = salon;
        this.Aire_Acondicionado = Aire_Acondicionado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSección() {
        return Sección;
    }

    public void setSección(String Sección) {
        this.Sección = Sección;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getAire_Acondicionado() {
        return Aire_Acondicionado;
    }

    public void setAire_Acondicionado(String Aire_Acondicionado) {
        this.Aire_Acondicionado = Aire_Acondicionado;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
