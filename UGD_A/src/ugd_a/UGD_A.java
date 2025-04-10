/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_a;

/**
 *
 * @author frend
 */
public class UGD_A {
    public static void main(String[] args) {
        Departemen<Alat, Karyawan> IT = new Departemen<>("IT");
        
        IT.addInventaris(new Alat("Printer", 5, 2016, "Elektronik"));
        IT.addInventaris(new Alat("Staples", 20, 2022, "Pemberkasan"));
        IT.addInventaris(new Alat("Meja", 15, 2010, "Perabotan"));
        IT.addInventaris(new Alat("Papan Tulis", 3, 2023, "Alat Tulis"));
        
        IT.addMember(new Karyawan("Budi", 24, 5500000, 4));
        IT.addMember(new Karyawan("Jono", 32, 11000000, 10));
        IT.addMember(new Karyawan("Siska", 28, 7000000, 5));
        IT.addMember(new Karyawan("Dinny", 29, 3000000, 1));
        
        IT.displayAll();
        
        Departemen<Alat, Karyawan> accounting = new Departemen<>("Accounting");
        
        accounting.addInventaris(new Alat("Monitor", 12, 2019, "Elektronik"));
        accounting.addInventaris(new Alat("Kursi", 15, 2014, "Perabotan"));
        accounting.addInventaris(new Alat("CPU", 16, 2018, "Elektronik"));
        accounting.addInventaris(new Alat("Spidol", 20, 2024, "Alat Tulis"));
        
        accounting.addMember(new Karyawan("Dani", 25, 4000000, 2));
        accounting.addMember(new Karyawan("Fiky", 22, 3000000, 1));
        accounting.addMember(new Karyawan("Riska", 40, 15000000, 10));
        accounting.addMember(new Karyawan("Nira", 35, 7500000, 5));
        
        accounting.displayAll();
    }
    
}
