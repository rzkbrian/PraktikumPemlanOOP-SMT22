/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polymorphism;
import java.util.Calendar;
import java.util.Date;

public abstract class Employee {
    private String name;
    private String noKTP;
    private Date dateOfBirth;

    public Employee(String name, String noKTP, Date dateOfBirth) {
        this.name = name;
        this.noKTP = noKTP;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract double earnings(); // pendapatan

    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s", getName(), getNoKTP());
    }
}