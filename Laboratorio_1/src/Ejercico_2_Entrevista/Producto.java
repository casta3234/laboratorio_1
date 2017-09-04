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
public class Producto {

    private int cantidad;
    private int codigo;
    private String descripcion;
    private double precioUnidad;
    private int cantidadVendida;

    public Producto(String descripcion, double precioUnidad, int cantidad) {
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

}
