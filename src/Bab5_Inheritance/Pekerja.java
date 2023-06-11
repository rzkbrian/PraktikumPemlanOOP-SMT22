/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Inheritance;

/**
 *
 * @author USER
 */

import java.time.LocalDate;

public class Pekerja extends Manusia{
   private double gaji;
   private int jumlahAnak;
   private LocalDate tahunMasuk;
   
   public Pekerja(double gaji, LocalDate tahunMasuk,int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean Menikah){
      super(nama, nik, jenisKelamin, Menikah);
      this.gaji = gaji;
      this.jumlahAnak = jumlahAnak;
      this.tahunMasuk = tahunMasuk;
   }

   public void setGaji(double gaji){
      this.gaji = gaji;
   }
   public void setJumlahAnak(int jumlahAnak){
      this.jumlahAnak = jumlahAnak;
   }
   public void setTahunMasuk(LocalDate tahunMasuk){
      this.tahunMasuk = tahunMasuk;
   }

   public double getGaji(){
      return this.gaji;
   }
   protected int getJumlahAnak(){
      return this.jumlahAnak;
   }
   public double getBonus(){
      int lamaBekerja = LocalDate.now().getYear()-tahunMasuk.getYear();
      if(lamaBekerja<=5 && lamaBekerja>=0){
         return 0.05*getGaji();
      }else if(lamaBekerja<=10 && lamaBekerja>5){
         return 0.1*getGaji();
      }else {
         return 0.15*getGaji();
      }
   }
   public LocalDate getTahunMasuk(){
      return tahunMasuk;
   }

   public double getTambahTunjangan(){
       return getJumlahAnak()*20;
   }
   public double getPendapatan(){
      return getTambahTunjangan()+getBonus()+getGaji()+getTunjangan();
   }

   public String toString(){
      return "nama              : " + getNama() + "\nNIK               : " + getNik() + "\nJenis Kelamin     : " + getJenisKelamin() + "\nJumlah Pendapatan : " + getPendapatan() + "\nTahun Masuk       : " + getTahunMasuk() + "\nJumlah Anak       : " + getJumlahAnak() + "\nGaji              : " + getGaji();
   }
}

