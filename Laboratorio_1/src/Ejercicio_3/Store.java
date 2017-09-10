/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import java.util.ArrayList;

/**
 *
 * @author Oscar Andrés Mancera Garzón
 * Sebastian Castañeda Romero
 */
public class Store {
    private String name;
    private Address address;
    private Car[] car;
    private int numCars;

    public Store(String name,Address address,Car car,int numCars){
      this.name=name;
      this.address = address;
      this.car = new Car[20];
      this.numCars = 0;
    }
    
    public boolean addCar (Car car){
        if(this.numCars < 20){
          this.car[this.numCars] = car;
          this.numCars++;
          return true;
        }else
            return false;
    }
    
    
    
    public Address getAddress() {
        return address;
    }
    
    public boolean listarCarros(){
      for(Car car : this.car){
          System.out.println("codigo: "+car.getCodigo());
          System.out.println("viajado: "+car.getTraveled());
        }
      return true;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
