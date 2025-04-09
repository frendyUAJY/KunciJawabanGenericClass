/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_d;

import java.util.List;
import java.util.ArrayList;
public class Organisasi<T extends Alat, U extends Mahasiswa>{
    private String namaOrganisasi;
    private Inventaris<T> inventaris;
    private List<U> member;

    public Organisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
        this.inventaris = new Inventaris<>();
	this.member = new ArrayList();
    }

    public void addInventaris(T member) {
        inventaris.addItem(member);
    }

    public void addMember(U member) {
        this.member.add(member);
    }

//    public void removeMember(String id) {
//        member.remove(id);
//    }
    public void displayInventaris(){
        inventaris.displayItems();
    }
    
    public void displayMember(){
        for (U member : member) {
            System.out.println(member);
        }
    }
    
    public void displayAll() {
        System.out.println("==================================================");
        System.out.println("Organisasi: " + namaOrganisasi);
        displayMember();
        displayInventaris();
    }
}
