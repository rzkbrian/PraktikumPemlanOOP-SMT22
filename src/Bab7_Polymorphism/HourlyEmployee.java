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
public class HourlyEmployee extends Employee {
    private double hourlyWage; // upah per jam
    private double hoursWorked; // jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, Date dateOfBirth, double hourlyWage, double hoursWorked) {
        super(name, noKTP, dateOfBirth);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double earnings() {
        if (hoursWorked <= 40) {
            return hourlyWage * hoursWorked;
        } else {
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
        }
    }

    public String toString() {
        return String.format("Hourly Employee\n%s\nHourly Wage: %.2f\nHours Worked: %.2f", super.toString(),
                getHourlyWage(), getHoursWorked());
    }
}