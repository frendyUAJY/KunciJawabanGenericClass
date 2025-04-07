/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_b;

/**
 *
 * @author frend
 */
public class UGD_B {
    public static void main(String[] args) {
        RumahSakit<Dokter, Ruang> rumahSakitA = new RumahSakit<>("Rumah Sakit A");
        
        rumahSakitA.addKaryawan(new Dokter("Budi", 1122, "Jantung", 14000000));
        rumahSakitA.addKaryawan(new Dokter("Willy", 1133, "Kulit", 16000000));
        rumahSakitA.addKaryawan(new Dokter("Rusdi", 2123, "THT", 9500000));
        rumahSakitA.addKaryawan(new Dokter("Nadia", 4422, "Umum", 9000000));
        
        rumahSakitA.addRuang(new Ruang("Urtipula", "Reguler", 1300000, 2));
        rumahSakitA.addRuang(new Ruang("Urtipula 2", "VIP", 2000000, 1));
        rumahSakitA.addRuang(new Ruang("Artupelago", "VVIP", 2500000, 1));
        rumahSakitA.addRuang(new Ruang("Artupelago 2", "VVIP", 3000000, 2));
        
        rumahSakitA.displayAll();
        
        RumahSakit<Dokter, Ruang> rumahSakitB = new RumahSakit<>("Rumah Sakit B");
        
        rumahSakitB.addKaryawan(new Dokter("Siska", 1212, "THT", 12000000));
        rumahSakitB.addKaryawan(new Dokter("Neo", 3311, "Jantung", 13500000));
        rumahSakitB.addKaryawan(new Dokter("Vicky", 3344, "Umum", 9500000));
        rumahSakitB.addKaryawan(new Dokter("Budi", 4231, "Hati", 15000000));
        
        rumahSakitB.addRuang(new Ruang("Rochar", "Reguler", 1500000, 2));
        rumahSakitB.addRuang(new Ruang("Rochar 2", "Reguler", 1000000, 1));
        rumahSakitB.addRuang(new Ruang("Dionar", "VIP", 2000000, 1));
        rumahSakitB.addRuang(new Ruang("Dionar 2", "VVIP", 2800000, 1));
        
        rumahSakitB.displayAll();
    }
    
}
