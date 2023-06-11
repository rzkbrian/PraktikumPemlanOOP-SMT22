/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1_2_Inheritance_InstanceMethod;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MainStudent {
   public static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
       
      Student anna = new Student();
      anna.setName("Anna");
      anna.setAddress("Malang");
      anna.setAge(20);
      anna.setMath(100);
      anna.setScience(89);
      anna.setEnglish(80);
      anna.displayMessage();

      

      //Menggunakan constructor lain
      System.out.println("==============================");
      Student chris = new Student("Chris", "Kediri",21);
      chris.setMath(70);
      chris.setScience(60
      );
      chris.setEnglish(90);
      chris.displayMessage();

      //Siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
      System.out.println("==============================");
      anna = new Student("anna", "Batu", 18);
      anna.setMath(100);
      anna.setScience(89);
      anna.setEnglish(80);
      anna.displayMessage();

      //Siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
      System.out.println("===============================");
      chris.setAddress("Surabaya");
      chris.setAge(22);
      chris.displayMessage();

      //Contoh penggunaan objek constructor dengan parameter nilai masing masing
      System.out.println("===============================");
      Student abdi = new Student(80, 90, 100);
      abdi.setName("Abdi");
      abdi.setAddress("Surabaya");
      abdi.setAge(18);
      abdi.displayMessage();

   

      
//MASUKKAN JUMLAH SISWA SESUAI DENGAN INPUT YANG DIINGINKAN USER

   
      /* System.out.print("Masukkan jumlah siswa : ");
      int jumlahSiswa = input.nextInt();
      input.nextLine();

      Student[] dataSiswa = new Student[jumlahSiswa];

      for(int i = 0;i<jumlahSiswa;i++){

         dataSiswa[i] = new Student();
         System.out.println("Data siswa nomor : " + (i+1));
         System.out.print("Nama : ");
         String nama = input.nextLine();
         dataSiswa[i].setName(nama);
         System.out.print("Alamat : ");
         String alamat = input.nextLine();
         dataSiswa[i].setAddress(alamat);
         System.out.print("Umur : ");
         int umur = input.nextInt();
         dataSiswa[i].setAge(umur);
         
         System.out.print("Nilai Matematika : ");
         int matematika = input.nextInt();
         dataSiswa[i].setMath(matematika);
         
         System.out.print("Nilai Sains : ");
         int sains = input.nextInt();
         dataSiswa[i].setScience(sains);
         
         System.out.print("Nilai Bahasa Inggris : ");
         int inggris = input.nextInt();
         dataSiswa[i].setEnglish(inggris);
         input.nextLine();
         
         System.out.println("===========================");      
      }
      System.out.println();
      System.out.println("Data siswa hasil inputan");
      System.out.println();
      for(int i =0;i<jumlahSiswa;i++){
         dataSiswa[i].displayMessage();
         System.out.println("===========================");
      } 
 */

      
   
   }
}