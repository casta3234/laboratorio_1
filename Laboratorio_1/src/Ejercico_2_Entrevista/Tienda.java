/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico_2_Entrevista;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Óscar Andrés Mancera Garzón 
 * Sebastian Castañeda Romero
 */
public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Double> gastos;
 

    public Tienda() {
         this.productos= new ArrayList<>();
         this. ventas= new ArrayList<>() ;
         this.vendedores = new ArrayList<>();
         this.gastos = new ArrayList();
  
    }
    public void addProductos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la nombre, el precio del producto y la cantidad de existecias");
        String descripcion = teclado.next();
        double precio = teclado.nextDouble();
        int cantidad = teclado.nextInt();
        Producto producto = new Producto( descripcion, precio,cantidad);
        
        this.productos.add(producto);
        producto.setCodigo(this.productos.indexOf(producto));
        System.out.println("el codigo de este producto es " + producto.getCodigo() );
    }
    public void makeVenta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el codigo del producto el ID del vendedor y la cantidad vendida");
        int codigo = teclado.nextInt();
        int id = teclado.nextInt();
        int cantidadVendida = teclado.nextInt();
        Producto producto = this.productos.get(codigo);
        Vendedor vendedor = this.vendedores.get(id);
        Venta venta = new Venta(producto, vendedor,  cantidadVendida);
        this.ventas.add(venta);
        producto.setCantidad(producto.getCantidad() - cantidadVendida);
        producto.setCantidadVendida(producto.getCantidadVendida() + cantidadVendida);
        this.productos.set(codigo,producto);
    }

    public void addVendedores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el nombre luego el apellido del nuevo vendedor ");
        String nombre = teclado.next();
        String apellido = teclado.next();
        Vendedor vendedor = new Vendedor(nombre, apellido);
        this.vendedores.add(vendedor);
        vendedor.setId(this.vendedores.indexOf(vendedor));
        System.out.println("la ID de " + vendedor.getNombre()+" "+vendedor.getApellido()+" es " + vendedor.getId() );
    } 
    public void getTotalVentas(){
        double i = 0;
        for (Venta v : this.ventas){
            i = i + v.getValorVenta();
        }
        System.out.println("el valor de todas las ventas es " + i);
    }
    public void getTotalGastos(){
        double i = 0;
        for(double g: gastos){
            i = i + g;
        }
        System.out.println("el valor de todos los gastos es " + i);        
    }
    public void comprar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el codigo la cantidad y el precio del producto que esta comprando");
        int codigo = teclado.nextInt();
        int cantidad = teclado.nextInt();
        double precio = teclado.nextDouble();
        for (Producto p:this.productos){
            if (p.getCodigo()==codigo){
                p.setCantidad(p.getCantidad()+cantidad);
                precio = precio*cantidad;
                System.out.println("el total a pagar es "+ precio);
                gastos.add(precio);
            }
        }
    }
    public void getCantidadProducto(){
     for (Producto p:this.productos){
         if (p.getCantidad()<1){
             System.out.println("el producto "+p.getDescripcion()+" esta agotado");
         }
         else
         System.out.println(p.getDescripcion()+" : "+ p.getCantidad());
        }    
    }
    public void getBalance(){
        double i = 0;
        for (Venta v : this.ventas){
            i = i + v.getValorVenta();
        }
        double j = 0;
        for(double g: gastos){
            j = j + g;
        }
        double g = i-j;
        System.out.println("el balance de ventas y gastos es de " + g );
        this.gastos.clear();
        this.ventas.clear();
    }
    public void getProductoMasVenido(){
        int i = 0;
        int p1= 0;
        int j = 0;
        int p2 =0;
        Producto producto;
         for (Producto p:this.productos){
             i=p.getCantidadVendida();
             p1 = this.productos.indexOf(p);
             if(i>=j){
                 i=j;
                 p2 = p1;
             }
         }
         producto=this.productos.get(p2);
         System.out.println("el producto mas vendido es " + producto.getDescripcion());
    }
    public void getValorAPagarAEmpleado(){
        
    }
}
