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
public class Estudiantes {

    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected int edad;
    protected int codigo;

    public Estudiantes() {

    }

    public Estudiantes(String nombre, String apellido, String sexo,int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }

  
    

}
