/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrés Mancera Garzón
 * Sebastian Castañeda Romero
 */
public class CarModel {
    Scanner teclado = new Scanner(System.in);
    private int price;
    private String modelnumber;
    private Category category;
    
    public CarModel(int price,String modelnumber,Category category){
       this.price=price;
       this.modelnumber=modelnumber;
       this.category=category;
    }

    public int getPrice() {
        return price;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
   
    public void crearModelo() {
        System.out.println("Ingrese la referencia del modelo: ");
        String ref = teclado.next();
        System.out.println("Ingrese el precio del ");
        int prc = teclado.nextInt();
        System.out.println("Introduza el nombre de la categoria: ");
        String cat = teclado.next();
        Category categoria = new Category(cat);
    }

}
