/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_d;

/**
 *
 * @author frend
 */
public class Mahasiswa {
    private String namaMahasiswa;
    private int umur;
    private String prodi;
    private String divisi;

    public Mahasiswa(String namaMahasiswa, int umur, String prodi, String divisi) {
        this.namaMahasiswa = namaMahasiswa;
        this.umur = umur;
        this.prodi = prodi;
        this.divisi = divisi;
    }
    
    public String kegiatan(){
        if(divisi.equals("Acara")){
            return "Mahasiswa " + namaMahasiswa + " sedang susun rundown";
        }
        else if(divisi.equals("Usaha Dana")){
            return "Mahasiswa " + namaMahasiswa + " sedang berjualan";
        }
        else if(divisi.equals("Perkap")){
            return "Mahasiswa " + namaMahasiswa + " sedang angkat barang";
        }
        else {
            return "Mahasiswa " + namaMahasiswa + " sedang desain poster";
        }
    }
    
    @Override
    public String toString(){
        return "=== Mahasiswa ===\n"
             + "Nama\t: " + namaMahasiswa + "\n" 
             + "Umur\t: " + umur + "\n"
             + "Prodi\t: " + prodi + "\n"
             + "Divisi\t: " + divisi + " tahun\n"
             + kegiatan()+ "\n";
    }
}
