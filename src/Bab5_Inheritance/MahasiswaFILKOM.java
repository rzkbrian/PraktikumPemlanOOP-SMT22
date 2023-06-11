/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Inheritance;

/**
 *
 * @author USER
 */
public class MahasiswaFILKOM extends Manusia {
public String nim;
private double ipk;
public MahasiswaFILKOM(String nim, double ipk, String nama, String nik,
boolean jenisKelamin, boolean menikah){
super(nama, nik, jenisKelamin, menikah);
this.nim = nim;
this.ipk = ipk;
}

public void setNim(String nim){
this.nim = nim;
}
public void setIpk(double ipk){
this.ipk = ipk;
}
public String getNim(){
return this.nim;
}
public double getIpk(){
return this.ipk;
}
public int getBeasiswa(){
if(getIpk()>3.5 && getIpk()<=4.0){
return 75;
}else if(getIpk()<=3.5 && getIpk()>3.0){
return 50;
}else{
return 0;
}
}
public double getPendapatan(){
return getTunjangan()+getBeasiswa();
}
public String getStatus(){
switch(getNim().charAt(6)){
case '2':
return "Teknik Informatika, 20" + getNim().substring(0, 2);
case '3':
return "Teknik Komputer, 20" + getNim().substring(0, 2);
case '4':
return "Sistem Informasi, 20" + getNim().substring(0, 2);
case '6':
return "Pendidikan Teknik Informasi, 20" + getNim().substring(0, 2);
case '7':
return "Teknologi Informasi, 20" + getNim().substring(0, 2);
default:
return "Status belum terdata.";
}
}
public String toString(){
    return "nama : " + getNama() + "\nNIK : " + getNik() + "\nJenis Kelamin : " 
            + getJenisKelamin() + "\nPendapatan : " + getPendapatan()+ "\nNim : " 
            + getNim() + "\nIpk : " + getIpk() + "\nStatus : " +
getStatus();
}
}
