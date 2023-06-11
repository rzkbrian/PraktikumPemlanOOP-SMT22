/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4_Encapsulation;

/**
 *
 * @author USER
 */
public class transaksiSwalayan {
   private String noPelanggan, nama;
   private double saldo;
   private String pin;
   private int salahAutentikasi=0;
   private int batasSalahAutentikasi = 3;
   
   public transaksiSwalayan(){
      noPelanggan = "";
      nama = "";
   }

   public transaksiSwalayan(double saldo,String pin, String nama){
      this.saldo=saldo;
      this.pin=pin;
      this.nama = nama;
   }

   //Set nilai dari semua atribut yang ada
   public void setSaldo(double saldo){
      this.saldo = saldo;
   }
   public void setNama(String nama){
      this.nama = nama;
   }
   public void setNoPelanggan(String noPelanggan){
      this.noPelanggan= noPelanggan;
      
   }
   public void setPin(String pin){
      this.pin = pin;
   }

   //Getter untuk mengambil nilai atribut
   public String getnama(){
      return this.nama;
   }
   public String getNoPelanggan(){
      return this.noPelanggan;
   }
   public double getSaldo(){
      return this.saldo;
   }
   private String getPin(){
      return pin;
   }

   private String getJenis(){
      String jenis = getNoPelanggan().substring(0,2);
      return jenis;
   }

   private void jenisKartu(String nomor){
      if(getJenis().equals("38")){
         System.out.println("Anda merupakan pelanggan jenis silver.");
         System.out.println("Anda akan mendapatkan cashback sebesar 5% untuk setiap pembelian diatas 1 jt.");
      } else if(getJenis().equals("56")){
         System.out.println("Anda merupakpan pelanggan jenis gold.");
         System.out.println("Anda akan mendapatkan cashback sebesar 7% untuk setiap pembelian diatas 1 jt. Selain itu cashback 2%.");
      } else if(getJenis().equals("74")){
         System.out.println("Anda merupakan pelanggan jenis platinum");
         System.out.println("Anda akan mendapatkan cashback sebesar 10% untuk setiap pembelian diatas 1 jt. Selain itu cashback 5%.");
      } else{
         System.out.println("Jenis rekening Anda belum diidentifikasi");
      }
   }

   public void pembelian(double beli, String pin){
      double selisih = getSaldo()-beli;
      
      if(pin.equals(getPin())){
         if(selisih<10000){
            System.out.println("Saldo Anda tidak mencukupi");
            System.out.println("Saldo minimal Rp10.000");
         } else{
            this.saldo-=beli;
            System.out.println("Pembelian berhasil.");
            switch (getJenis()){
               case "38":
               if(beli>1000000){
                  System.out.println("Anda mendapatkan cashback sebesar 5%.");
                  this.saldo += (beli*0.05);
               } 
               System.out.println("Sisa saldo : Rp" + getSaldo());
               break;
               case "56":
               if(beli>1000000){
                  System.out.println("Anda mendapatkan cashback sebesar 7%.");
                  this.saldo +=(beli*0.07);
               } else{
                  System.out.println("Anda mendapatkan cashback sebesar 2%.");
                  this.saldo += (beli*0.02);
               }
               System.out.println("Sisa saldo : Rp" + getSaldo());
               break;
               case "74":
               if(beli>1000000){
                  System.out.println("Anda mendapatkan cashback sebesar 10%.");
                  this.saldo += (beli*0.1);
               }else{
                  System.out.println("Anda mendapatkan cashback sebesar 5%");
                  this.saldo += (beli*0.05);
               }
               System.out.println("Sisa saldo : Rp" +getSaldo());
               break;
            }
         }
      }else{
         salahAutentikasi++;
         if(salahAutentikasi == batasSalahAutentikasi){
            System.out.println("Kesalahan autentikasi sudah melewati batas.");
            System.out.println("Akun Anda terblokir.");
            System.exit(0);
         }
         else{
            System.out.println("Pin yang anda masukkan salah.");
         }
      }
   }


   public void topUp(double TopUp, String pin){
      if(pin.equals(getPin())){
            if(TopUp>=10000){
               this.saldo += TopUp;
               System.out.println("Selamat, top-up Anda berhasil.");
               System.out.println("Saldo anda sekarang : Rp" + getSaldo());
            } else{
               System.out.println("Mohon maaf, saldo minimal untuk top-up masih kurang.");
               System.out.println("Minimal top-up sebesar Rp10.000.");
            } 
         } else{
            salahAutentikasi++;
            if(salahAutentikasi == batasSalahAutentikasi){
               System.out.println("Kesalahan autentikasi sudah melewati batas.");
               System.out.println("Akun Anda terblokir.");
               System.exit(0);
            }
            else{
               System.out.println("Pin yang anda masukkan salah.");
            }
         }
      }
   

   public void displayIdentitas(){
      System.out.println("Nama : " + getnama());
      jenisKartu(noPelanggan);
      System.out.println("Saldo anda : Rp" + getSaldo());
      
   }
}
