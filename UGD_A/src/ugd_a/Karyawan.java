/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_a;

/**
 *
 * @author frend
 */
public class Karyawan {
    private String namaKaryawan;
    private int umur;
    private int gaji;
    private int pengalaman;

    public Karyawan(String namaKaryawan, int umur, int gaji, int pengalaman) {
        this.namaKaryawan = namaKaryawan;
        this.umur = umur;
        this.gaji = gaji;
        this.pengalaman = pengalaman;
    }
    
    public String bekerja(){
        return "Karyawan " + namaKaryawan + " sedang bekerja";
    }
    
    @Override
    public String toString(){
        return "=== Karyawan ===\n"
             + "Nama\t\t\t: " + namaKaryawan + "\n" 
             + "Umur\t\t\t: " + umur + "\n"
             + "Gaji\t\t\t: Rp" + gaji + "\n"
             + "Pengalaman bekerja\t: " + pengalaman + " tahun\n"
             + bekerja()+ "\n";
    }
}
