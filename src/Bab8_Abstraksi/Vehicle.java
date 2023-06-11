/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_Abstraksi;

/**
 *
 * @author USER
 */
public abstract class Vehicle {
  // buat variabel nama, tahun, dan rpm
  String nama;
  int tahun;
  double rpm;

  // buat sebuah method abstrak yang nantinya akan di override oleh class Car
  public abstract void data();
}