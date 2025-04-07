/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_b;

/**
 *
 * @author frend
 */
public class Dokter {
    private String namaDokter;
    private int nomorInduk;
    private String spesialisasi;
    private int gaji;

    public Dokter(String namaDokter, int nomorInduk, String spesialisasi, int gaji) {
        this.namaDokter = namaDokter;
        this.nomorInduk = nomorInduk;
        this.spesialisasi = spesialisasi;
        this.gaji = gaji;
    }
    
    public String memeriksa(){
        return "Dokter " + namaDokter + " sedang memeriksa pasien";
    }
    
    @Override
    public String toString(){
        return "=== Dokter ===\n"
             + "Nama\t\t: " + namaDokter + "\n" 
             + "Nomor Induk\t: " + nomorInduk + "\n"
             + "Spesialisasi\t: " + spesialisasi + "\n"
             + "Gaji\t\t: Rp" + gaji + "\n"
             + memeriksa()+ "\n";
    }
}
