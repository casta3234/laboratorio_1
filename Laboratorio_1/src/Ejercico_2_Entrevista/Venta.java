/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico_2_Entrevista;

import java.util.Date;

/**
 *
 * @author Óscar Andrés Mancera Garzón
 * Sebastian Castañeda Romero
 */
public class Venta {

    private Date fecha;
    private Producto producto;
    private Vendedor vendedor;
    private int cantidadVendida;
    private double valorVenta;

    public Venta(Producto producto, Vendedor vendedor, int cantidadVendida) {

            this.producto = producto;
            this.vendedor = vendedor;
            this. cantidadVendida = cantidadVendida;
            this.fecha = new Date();
            this.valorVenta = (this.producto.getPrecioUnidad() * cantidadVendida);
            imprimirFactura();
        
    }

    public void imprimirFactura() {
        System.out.println("año:" + this.fecha.getYear() + " mes:" + this.fecha.getMonth()
                + " dia:" + this.fecha.getDay() + " hora:" + this.fecha.getHours());
        System.out.println("Vendedor: " + this.vendedor.getNombre() + " " + this.vendedor.getApellido()
                + " ID: " + this.vendedor.getId());
        System.out.println("codigo del producto: " + this.producto.getCodigo() + " nombre del producto: " + this.producto.getDescripcion()
                + " precio del product: " + this.producto.getPrecioUnidad() + " catidad vendida: " +  cantidadVendida
                + " valor total: " + this.valorVenta);


    }

    public double getValorVenta() {
        return valorVenta;
    }
}
