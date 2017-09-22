/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author ChaVaZaSRL
 */
public class Output {
        
    public void keluar(){
    System.out.println("Hasilnya adalah");
}
  public static void main(String[]args){
        Line line = new Line(1,2,3,4);
       Line line2 = new Line(5,6,7,8);
       
       System.out.println("Panjang Angka Objek 1 = "+line.getLength());
       System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
       System.out.println("");
       
       System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line, line2));
       System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line, line2));
       System.out.println("Perbandingan Objek 1 = Objek 2 = "+line.isEqual(line, line2));
    }
}
