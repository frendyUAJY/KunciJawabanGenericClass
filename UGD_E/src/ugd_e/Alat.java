/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_e;

/**
 *
 * @author frend
 */
public class Alat {
    private String namaAlat;
    private String brand;
    private int tahunPembuatan;
    private boolean isRusak;

    public Alat(String namaAlat, String brand, int tahunPembuatan, boolean isRusak) {
        this.namaAlat = namaAlat;
        this.brand = brand;
        this.tahunPembuatan = tahunPembuatan;
        this.isRusak = isRusak;
    }
    
    public String informasiAlat(){
        if(this.isRusak){
            return "Alat " + this.namaAlat + " dengan brand " + this.brand + " sudah rusak";
        }
        else {
            return "Alat " + this.namaAlat + " dengan brand " + this.brand + " masih bagus";
        }
    }
    
    @Override
    public String toString(){
        return "=== Alat ===\n"
             + "Nama\t\t: " + namaAlat + "\n" 
             + "Tahun\t\t: " + tahunPembuatan + "\n"
             + "Brand\t\t: " + brand + "\n"
             + "Status rusak\t: " + isRusak + "\n"
             + informasiAlat()+ "\n";
    }
}
