/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_a;

/**
 *
 * @author frend
 */
public class Alat {
    private String namaAlat;
    private int jumlah;
    private int tahun;
    private String kategori;

    public Alat(String namaAlat, int jumlah, int tahun, String kategori) {
        this.namaAlat = namaAlat;
        this.jumlah = jumlah;
        this.tahun = tahun;
        this.kategori = kategori;
    }
    
    public String statusAlat(){
        if(tahun < 2015){
            return "Barang " + this.namaAlat + " sudah tua" ;
        }
        else {
            return "Barang " + this.namaAlat + " masih layak pakai";
        }
    }
    
    @Override
    public String toString(){
        return "=== Alat ===\n"
             + "Nama\t\t: " + namaAlat + "\n" 
             + "Tahun dibeli\t: " + tahun + "\n"
             + "Jumlah\t\t: " + jumlah + "\n"
             + "Kategori\t: " + kategori + "\n"
             + statusAlat()+ "\n";
    }
}
