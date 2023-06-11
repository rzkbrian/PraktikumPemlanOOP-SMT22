/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polymorphism;
import Bab7_Polymorphism.Employee;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author USER
 */
public class ProductionEmployee extends Employee {
    private double hourlyRate; // upah per barang
    private int quantity; // jumlah barang yang diproduksi

    public ProductionEmployee(String name, String noKTP, Date dateOfBirth, double hourlyRate, int quantity) {
        super(name, noKTP, dateOfBirth);
        this.hourlyRate = hourlyRate;
        this.quantity = quantity;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double earnings() {
        return hourlyRate * quantity;
    }

    public String toString() {
        return String.format("Production Employee\n%s\nHourly Rate: %.2f\nQuantity: %d",
                super.toString(), getHourlyRate(), getQuantity());
    }
}