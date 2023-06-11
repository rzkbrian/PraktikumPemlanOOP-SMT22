/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1_2_Inheritance_InstanceMethod;

/**
 *
 * @author USER
 */
public class Student {
   private String name;
   private String address;
   private int age;
   private double mathGrade;
   private double englishGrade;
   private double scienceGrade;
   private static int jumlahObjek ;

   public Student(){
      name = "";
      address = "";
      age = 0;
      jumlahObjek +=1;
   }

   public Student(String n, String a, int ag){
      name = n;
      address = a;
      age = ag;
      jumlahObjek+=1;
   }

   //Constructor dengan parameter masing-masing nilai
   public Student(double m, double e, double s){
      mathGrade = m;
      englishGrade = e;
      scienceGrade = s;
      jumlahObjek+=1;
   }

   public void setName(String n){
      name = n;
   }

   public void setAddress(String a){
      address = a;
   }

   public void setAge(int ag){
      age = ag;
   }

   public void setMath(int math){
      mathGrade = math;
   }

   public void setEnglish(int english){
      englishGrade = english;
   }

   public void setScience(int science){
      scienceGrade = science;
   }

   private double getAverage(){
      double result = 0;
      result = (mathGrade+scienceGrade+englishGrade)/3;
      return result;
   }

   private boolean statusAkhir(){
      if(getAverage()>60){
         return true;
      } else {
         return false;
      }
   }

   public void jumlahObjek(){
      System.out.println("Jumlah objek yang digunakan adalah : " + jumlahObjek);
   }

   public void displayMessage(){
      System.out.println("Siswa dengan nama " + name);
      System.out.println("beralamat di " + address);
      System.out.println("berumur " + age);
      System.out.println("mempunyai nilai rata rata " + getAverage());
      if(statusAkhir()==true){
         System.out.println("Siswa " + name + " Telah lolos dan tidak perlu remidi");
      }else{
         System.out.println("Siswa " + name + " Tidak lolos dan harus mengikuti remidi");
      }
      jumlahObjek();
   }
}

