/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4_Encapsulation;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class transaksiSwalayanMain {
   public static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
      int jenisAktivitas;
      double topUp, beli;
      String nopel, pin;

      System.out.println("Selamat Datang di Swalayan Tiny");
      transaksiSwalayan aktivitas = new transaksiSwalayan(100000,"0123","Rizki Febrian");

      System.out.println("Masukkan nomor pelanggan Anda : ");
      nopel = input.nextLine();
      while(nopel.length()!=10){
         System.out.println("Nomor Pelanggan yang Anda masukkan tidak valid");
         System.out.println("Nomor Pelanggan terdiri dari 10 digit.");
         System.out.println("==============================");
         System.out.println("Masukkan nomor pelanggan Anda : ");
         nopel = input.nextLine();
      }
      aktivitas.setNoPelanggan(nopel);
      System.out.println("=================================");
      aktivitas.displayIdentitas();
      System.out.println("=================================");

      while(true){
         System.out.println("Transaksi apa yang ingin anda lakukan : ");
         System.out.println("1 Beli barang \n2 Top up saldo \n3 Keluar");
         jenisAktivitas = input.nextInt();
         switch (jenisAktivitas){
            case 1:
            System.out.println("Masukkan total belanja : ");
            beli = input.nextDouble();
            System.out.println("Masukkan pin : ");
            pin = input.next();
            aktivitas.pembelian(beli, pin);
            break;
            case 2:
            System.out.println("Masukkan jumlah top up : ");
            topUp = input.nextDouble();
            System.out.println("Masukkan pin : " );
            pin = input.next();
            aktivitas.topUp(topUp,pin);
            break;
            case 3:
            System.out.println("Terima kasih.");
            System.exit(0);
            break;
         }
         System.out.println("=================================");
      }
   }
}

