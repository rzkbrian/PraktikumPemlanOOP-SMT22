/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polymorphism;
import Bab7_Polymorphism.HourlyEmployee;
import Bab7_Polymorphism.Employee;
import Bab7_Polymorphism.CommissionEmployee;
import Bab7_Polymorphism.BasePlusCommissionEmployee;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author USER
 */

public class Main {
      public static void main(String[] args) {
        // Membuat objek dari semua class Employee
        Date dateOfBirth = new Date(); // Ganti dengan tanggal lahir yang sesuai
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "1234567890", dateOfBirth, 5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", "0987654321", dateOfBirth, 20, 45);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Mike Johnson", "5678901234", dateOfBirth, 100000,
                0.1);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Sarah Williams",
                "4567890123", dateOfBirth, 200000, 0.15, 5000);
        ProductionEmployee productionEmployee = new ProductionEmployee("Tom Lee", "678901234", dateOfBirth, 5000, 100);

        // Menambahkan objek-objek Employee ke dalam array
        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee;

        // Menghitung dan mencetak gaji semua karyawan secara polimorfisme
        for (Employee employee : employees) {
            double earnings = employee.earnings();

            // Menambahkan gaji tambahan jika bulan ini adalah bulan ulang tahunnya
            Date currentDate = new Date();
            if (isBirthday(employee, currentDate)) {
                earnings += 100000;
            }

            System.out.println(employee.toString());
            System.out.println("Earnings: " + earnings);
            System.out.println();
        }
    }

    private static boolean isBirthday(Employee employee, Date currentDate) {
        Date dateOfBirth = employee.getDateOfBirth();
        Calendar currentCal = Calendar.getInstance();
        Calendar birthCal = Calendar.getInstance();
        currentCal.setTime(currentDate);
        birthCal.setTime(dateOfBirth);
        return currentCal.get(Calendar.MONTH) == birthCal.get(Calendar.MONTH)
                && currentCal.get(Calendar.DAY_OF_MONTH) == birthCal.get(Calendar.DAY_OF_MONTH);
    }
}


