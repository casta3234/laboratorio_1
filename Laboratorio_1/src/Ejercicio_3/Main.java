/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Oscar Andrés Mancera Garzón
 * Sebastian Castañeda Romero
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre de la tienda de autos: ");
        String str = teclado.next();
        System.out.println("Ingrese direccion de  "+str+":");
        String hs = teclado.next();
        System.out.println("Ingrese barrio de  "+str+":");
        String brr = teclado.next();
        System.out.println("Ingrese codigo postal de  "+str+":");
        String cpos = teclado.next();
        Address adrss = new Address(hs, brr, cpos);
        Store s = new Store(str, adrss, null, 0);
        
        int op;
        System.out.println(".:OPCIONES:. ");
        System.out.println("1.Añadir Categoria.");
        System.out.println("2.Añadir Modelo de Auto");
        System.out.println("3.Agregar Auto");
        System.out.println("4.Nueva Direccion");
        System.out.println("5.Listar informacion de Carros");
        while (true) {
            System.out.println("Ingrese una opcion: ");
            op = teclado.nextInt();
            switch (op) {
                case (1):
                    System.out.println("Introduza el nombre de la nueva categoria: ");
                    String nombre = teclado.next();
                    Category categoria=new Category(nombre);
                    System.out.println("Se creo la categoria "+categoria.getName());
                    break;
                case (2):
                    System.out.println("Ingrese la referencia del modelo: ");
                    String ref = teclado.next();
                    System.out.println("Ingrese el precio del modelo");
                    int prc = teclado.nextInt();
                    System.out.println("Introduza el nombre de la categoria: ");
                    String cat = teclado.next();
                    categoria=new Category(cat);
                    CarModel modell=new CarModel(prc, ref, categoria);
                    System.out.println("Se creo modelo :"+modell.getModelnumber()+"con valor de "+modell.getPrice()+", de categoria "+modell.getCategory());
                    break;
                case (3):
                    System.out.println("Ingrese codigo del auto: ");
                    int cod = teclado.nextInt();
                    System.out.println("Ingrese km recorridos del auto: ");
                    int kmr = teclado.nextInt();
                    System.out.println("Introduza el modelo del auto... ");
                    System.out.println("Ingrese la referencia del modelo: ");
                    String refc = teclado.next();
                    System.out.println("Ingrese el precio del modelo");
                    int prcc = teclado.nextInt();
                    System.out.println("Introduza el nombre de la categoria: ");
                    String catc = teclado.next();
                    categoria = new Category(catc);
                    CarModel modelc = new CarModel(prcc, refc, categoria);
                    Car carro = new Car(cod, modelc, kmr);
                    s.addCar(carro);
                    break;
                case (4):
                    System.out.println("Ingrese nueva direccion de  " + str + ":");
                    String hsn = teclado.next();
                    System.out.println("Ingrese nueva barrio de  " + str + ":");
                    String brrn = teclado.next();
                    System.out.println("Ingrese nuevo codigo postal de  " + str + ":");
                    String cposn = teclado.next();
                    Address adrssn = new Address(hsn, brrn, cposn);
                    s.setAddress(adrssn);
                    break;
                case (5):
                    s.listarCarros();
                    break;
            }
        }
    }
}
