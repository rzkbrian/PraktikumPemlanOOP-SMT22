/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Inheritance;

/**
 *
 * @author USER
 */

public class Manusia {
   protected String nama, nik;
   private boolean jenisKelamin, menikah;
   private double tunjangan, pendapatan;
   
   public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
      this.nama = nama;
      this.nik = nik;
      this.jenisKelamin = jenisKelamin;
      this.menikah = menikah;
   }

   public void setNama(String nama){
      this.nama=nama;
   }

   public void setNik(String nik){
      this.nik = nik;
   }

   public String getJenisKelamin(){
      return this.jenisKelamin ? "Laki-laki":"Perempuan";
   }

   public String getNama(){
      return this.nama;
   }
   
   public String getNik(){
      return this.nik;
   }

   public double getTunjangan(){
      if(menikah){
         return jenisKelamin ? 25:20;
      }else{
         return 15;
      }
   }

   public double getPendapatan(){
      return getTunjangan();
   }
  

   public String toString(){
      return "nama           : " + getNama() + "\nNIK            : " + getNik() + "\nJenis Kelamin  : " + getJenisKelamin() + "\nPendapatan     : " + getPendapatan();
   }
}

