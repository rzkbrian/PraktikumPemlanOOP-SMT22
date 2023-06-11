/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_Abstraksi;

/**
 *
 * @author USER
 */
public class Car extends Vehicle {
  // buat variabel owner yang bertipe data Owner
  Owner owner;

  public Car(Owner o, String name, int year, double rpm) {
    this.owner = o;
    this.nama = name;
    this.tahun = year;
    this.rpm = rpm;

  }
  
  @Override
  public void data() {
    System.out.println("Car name\t: " + this.nama);
    System.out.println("Car owner\t: " + this.owner.getName());
    System.out.println("Output year\t: " + this.tahun);
    System.out.println("RPM\t\t: " + this.rpm);
    System.out.println("");
  }
}
