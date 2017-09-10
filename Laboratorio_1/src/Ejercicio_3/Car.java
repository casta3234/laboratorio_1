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
public class Car {
    private int codigo;
    private int traveled;
    private CarModel model;
    
    public Car(int codigo, CarModel model,int traveled){
        this.codigo=codigo;
        this.model=model;
        this.traveled=traveled;
    }

    public CarModel getModel() {
        return model;
    }

    public int getTraveled() {
        return traveled;
    }

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
}
