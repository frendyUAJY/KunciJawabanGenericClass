/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_b;

import java.util.List;
import java.util.ArrayList;
public class RumahSakit<T extends Dokter, U extends Ruang>{
    private String departmentName;
    private Karyawan<T> karyawan;
    private List<U> ruang;

    public RumahSakit(String departmentName) {
        this.departmentName = departmentName;
        this.karyawan = new Karyawan<>();
	this.ruang = new ArrayList();
    }

    public void addKaryawan(T ruang) {
        karyawan.addItem(ruang);
    }

    public void addRuang(U ruang) {
        this.ruang.add(ruang);
    }

//    public void removeMember(String id) {
//        ruang.remove(id);
//    }
    public void displayKaryawan(){
        karyawan.displayItems();
    }
    
    public void displayRuang(){
        for (U ruang : ruang) {
            System.out.println(ruang);
        }
    }
    
    public void displayAll() {
        System.out.println("==================================================");
        System.out.println("Rumah Sakit: " + departmentName);
        displayKaryawan();
        displayRuang();
    }
}
