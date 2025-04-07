/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_b;

/**
 *
 * @author frend
 */
public class Ruang {
    private String namaRuang;
    private String grade;
    private int harga;
    private int jumlahKasur;
    private static int i = 0;

    public Ruang(String namaRuang, String grade, int harga, int jumlahKasur) {
        this.namaRuang = namaRuang;
        this.grade = grade;
        this.harga = harga;
        this.jumlahKasur = jumlahKasur;
    }
    
    public String statusRuang(){
        i++;
        if(i%2 == 0){
            System.out.println(i);
            return "Ruang "+ namaRuang +" sudah terisi";
        }
        else {
            return "Ruang "+ namaRuang +" masih kosong";
        }
    }
    
    @Override
    public String toString(){
        return "=== Ruang ===\n"
             + "Nama\t\t: " + namaRuang + "\n" 
             + "Harga\t\t: " + harga + "\n"
             + "Grade\t\t: " + grade + "\n"
             + "Jumlah Kasur\t: " + jumlahKasur + "\n"
             + statusRuang()+ "\n";
    }
}
