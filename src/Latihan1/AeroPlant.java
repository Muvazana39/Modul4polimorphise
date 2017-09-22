/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author ChaVaZaSRL
 */
public class AeroPlant extends Vehicle{
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main(String [] args){
        AeroPlant garuda = new AeroPlant();
        garuda.funtion();
        garuda.fuel();
        garuda.walk();
    }
}
