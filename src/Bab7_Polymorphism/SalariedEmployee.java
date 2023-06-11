/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polymorphism;
import Bab7_Polymorphism.Employee;
import java.util.Calendar;
import java.util.Date;
public class SalariedEmployee extends Employee {
    private double monthlySalary; // gaji/bulan

    public SalariedEmployee(String name, String noKTP, Date dateOfBirth, double monthlySalary) {
        super(name, noKTP, dateOfBirth);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double earnings() {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(getDateOfBirth());

        int currentMonth = today.get(Calendar.MONTH) + 1;
        int birthMonth = birthDate.get(Calendar.MONTH) + 1;

        double totalEarnings = monthlySalary;

        if (currentMonth == birthMonth) {
            totalEarnings += 100000; // tambahkan gaji tambahan jika bulan ini adalah bulan ulang tahunnya
        }

        return totalEarnings;
    }

    public String toString() {
        return String.format("Salaried Employee\n%s\nMonthly Salary: %.2f", super.toString(), getMonthlySalary());
    }
}