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
public class Address {
    private String house;
    private String country;
    private String postcode;
    
    public Address(String house, String country, String postcode){

        this.country=country;
        this.house=house;
        this.postcode=postcode;
    }
    
    public String getHouse() {
        return house;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
}
