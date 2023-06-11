/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3_Overload_OverloadingMethod;

/**
 *
 * @author USER
 */
public class LingkaranMain{
   public static void main(String[] args){
   Lingkaran l = new Lingkaran(3);
   l.setTinggi(10);
   l.displayMessage();
   Lingkaran l2 = new Lingkaran(4, 10);
   l2.displayMessage();
   Lingkaran Lstring = new Lingkaran("2", "10");
   Lstring.displayMessage();
} 
}
