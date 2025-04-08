/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_c;

/**
 *
 * @author frend
 */
public class Customer {
    private String nama;
    private String email;
    private int umur;
    private String alamat;
    private static int i = 0;

    public Customer(String nama, String email, int umur, String alamat) {
        this.nama = nama;
        this.email = email;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public String status(){
        i++;
        if(i%2 == 0){
            return nama + " sering meminjam buku.";
        }
        else {
            return nama + " jarang meminjam buku.";
        }
        
    }
    
    @Override
    public String toString(){
        return "=== Pemustaka ===\n"
             + "Nama\t: " + nama + "\n" 
             + "Email\t: " + email + "\n"
             + "Umur\t: " + umur + "\n"
             + "Alamat\t: " + alamat + "\n"
             + status()+ "\n";
    }
}
