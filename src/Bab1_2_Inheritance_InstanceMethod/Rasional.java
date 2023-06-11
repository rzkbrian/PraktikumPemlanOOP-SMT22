/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1_2_Inheritance_InstanceMethod;

/**
 *
 * @author USER
 */
public class Rasional {
   private int pembilang, penyebut;
   private int pemblng,penybt;

   public Rasional(){
      pembilang = 0;
      penyebut = 0;
   }
   public Rasional(int pbi, int pyb){
      pembilang = pbi;
      penyebut = pyb;
      pemblng = pbi;
      penybt = pyb;

   }
   //mengecek suatu bilangan adalah rasional atau bukan
   public boolean isRasional(){
      return (penyebut!=0);
   }
   //menyederhanakan bilangan rasional
   public void Sederhana(){
      int temp,A,B;
      if(penyebut==0){
         return;
      }
      A = (pembilang<penyebut) ? penyebut:pembilang;
      B = (pembilang<penyebut) ? pembilang:penyebut;

      
      for(temp = 0; B != 0; temp = A%B, A = B, B = temp){
         
     }
     
     
      pembilang /=A;
      penyebut /=A;

      pemblng = pembilang;
      penybt = penyebut;
   }
   public double Cast(){
      return (penyebut==0.0) ? 0.0:(double)pembilang/(double)penyebut;
   }
   //operator >
   public boolean moreThan (Rasional A){
      return (pembilang*A.penyebut>penyebut*A.pembilang);
   }
   //operator Unary- ---> A = -A
   public void negasi(){
      pembilang = - pembilang;
   }
   //operator unari += \
   public void unaryPlus(Rasional A){
      pembilang = pemblng * A.penyebut + penyebut*A.pembilang;
      penyebut *= A.penyebut;
   }
   public void cetak(){
      System.out.println(pembilang + "/" + penyebut);
   }

   //Operator  <
   public boolean lessThan(Rasional A){
      return (pembilang*A.penyebut<penyebut*A.pembilang);
   }

   //operator <=
   public boolean lessOrEqual(Rasional A){
      return (pembilang*A.penyebut<=penyebut*A.pembilang);
   }

   //operator >=
   public boolean moreOrEqual(Rasional A){
      return (pembilang*A.penyebut>=penyebut*A.pembilang);
   }

   //Operator - 
   public void unarymin(Rasional A){
      pembilang = penyebut * A.pembilang-pemblng * A.penyebut;
      penyebut *=A.penyebut;
   }

   //Operator *
   public void multiple(Rasional A){
      pembilang = pemblng*A.pembilang;
      penyebut = penybt*A.penyebut;
   }

   //Operator /
   public void divide(Rasional A){
      pembilang = pemblng*A.penyebut;
      penyebut = penybt*A.pembilang;
   }

   
}

