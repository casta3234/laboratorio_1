/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico_2_Entrevista;
/**
 *
 * @author Óscar Andrés Mancera Garzón
 * Sebastian Castañeda Romero
 */
public class Vendedor {

    private int id;
    private String nombre;
    private String apellido;

    public Vendedor( String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }





}
