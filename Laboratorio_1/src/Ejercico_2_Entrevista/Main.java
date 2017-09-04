/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico_2_Entrevista;


import java.util.Scanner;


/**
 *
 * @author Óscar Andrés Mancera Garzón 
 * Sebastian Castañeda Romero
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tienda t = new Tienda();
        int o;
        System.out.println("lista de funciones ");
        System.out.println("1.agregar producto");
        System.out.println("2.agregar empleado");
        System.out.println("3.hacer una venta");
        System.out.println("4.comprar");
        System.out.println("5.obtener la catidad de todos los productos");
        System.out.println("6.obtener el total de ventas desde el ultimo balance");
        System.out.println("7.obtener el total de gastos desde el ultimo balance");
        System.out.println("8.obtener el balance ventas gastos");
        System.out.println("9.obtener el producto mas vendido");
        System.out.println("10.obtener el valor a pagar a un empleado");
        while (true) {
            System.out.println("a que funcion desea acceder ");
            o = teclado.nextInt();
            switch (o) {
                case (1):
                    t.addProductos();
                    break;
                case (2):
                    t.addVendedores();
                    break;
                case (3):
                    t.makeVenta();
                    break;
                case (4):
                    t.comprar();
                    break;
                case (5):
                    t.getCantidadProducto();
                    break;
                case (6):
                    t.getTotalVentas();
                    break;
                case (7):
                    t.getTotalGastos();
                    break;
                case (8):
                    t.getBalance();
                    break;
                case (9):
                    t.getProductoMasVenido();
                    break;
                case (10):
                    t.getValorAPagarAEmpleado();
                    break;
            }
        }
    }

}
