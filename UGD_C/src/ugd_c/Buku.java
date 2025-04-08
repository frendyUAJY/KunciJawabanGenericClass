/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_c;

/**
 *
 * @author frend
 */
public class Buku {
    private String judulBuku;
    private String penulis;
    private int tahunTerbit;
    private boolean isDipinjam;

    public Buku(String judulBuku, String penulis, int tahunTerbit, boolean isDipinjam) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = isDipinjam;
    }
    
    public String informasiBuku(){
        if(this.isDipinjam){
            return "Buku dengan judul " + this.judulBuku + " sedang dipinjam";
        }
        else {
            return "Buku dengan judul " + this.judulBuku + " sedang tidak dipinjam";
        }
    }
    
    @Override
    public String toString(){
        return "=== Buku ===\n"
             + "Judul\t\t\t: " + judulBuku + "\n" 
             + "Tahun Terbit\t\t: " + tahunTerbit + "\n"
             + "Penulis\t\t\t: " + penulis + "\n"
             + "Status peminjaman\t: " + isDipinjam + "\n"
             + informasiBuku()+ "\n";
    }
}
