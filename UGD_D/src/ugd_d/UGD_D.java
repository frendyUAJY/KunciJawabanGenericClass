/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_d;

/**
 *
 * @author frend
 */
public class UGD_D {
    public static void main(String[] args) {
        Organisasi<Alat, Mahasiswa> HMS = new Organisasi<>("Himpunan Mahasiswa Sipil");
        
        HMS.addInventaris(new Alat("Printer", 5, 2016, "Elektronik"));
        HMS.addInventaris(new Alat("Staples", 20, 2022, "Pemberkasan"));
        HMS.addInventaris(new Alat("Meja", 15, 2010, "Perabotan"));
        HMS.addInventaris(new Alat("Papan Tulis", 3, 2023, "Alat Tulis"));
        
        HMS.addMember(new Mahasiswa("Luki", 19, "Sipil", "Perkap"));
        HMS.addMember(new Mahasiswa("Nira", 18, "Sipil", "Acara"));
        HMS.addMember(new Mahasiswa("Sujiteng", 20, "Sipil", "Usaha Dana"));
        HMS.addMember(new Mahasiswa("Miko", 19, "Sipil", "Acara"));
        
        HMS.displayAll();
        
        Organisasi<Alat, Mahasiswa> semaFTI = new Organisasi<>("Senat Mahasiswa FTI");
        
        semaFTI.addInventaris(new Alat("Monitor", 12, 2019, "Elektronik"));
        semaFTI.addInventaris(new Alat("Kursi", 15, 2014, "Perabotan"));
        semaFTI.addInventaris(new Alat("CPU", 16, 2018, "Elektronik"));
        semaFTI.addInventaris(new Alat("Spidol", 20, 2024, "Alat Tulis"));
        
        semaFTI.addMember(new Mahasiswa("Masiko", 20, "Teknik Industri", "Desain"));
        semaFTI.addMember(new Mahasiswa("Marina", 19, "Informatika", "Usaha Dana"));
        semaFTI.addMember(new Mahasiswa("Sakoshi", 18, "Sistem Informasi", "Perkap"));
        semaFTI.addMember(new Mahasiswa("Nirmala", 19, "Informatika International", "Usaha Dana"));
        
        semaFTI.displayAll();
    }
    
}
