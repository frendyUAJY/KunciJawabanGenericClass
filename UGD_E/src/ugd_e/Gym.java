/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_e;

import java.util.List;
import java.util.ArrayList;
public class Gym<T extends Alat, U extends Customer>{
    private String namaGym;
    private DataAlat<T> dataAlat;
    private List<U> member;

    public Gym(String namaGym, DataAlat<T> dataAlat) {
        this.namaGym = namaGym;
        this.dataAlat = dataAlat;
	this.member = new ArrayList();
    }

    public void addMember(U member) {
        this.member.add(member);
    }

//    public void removeMember(String id) {
//        member.remove(id);
//    }
    public void displayDataAlat(){
        dataAlat.displayItems();
    }
    
    public void displayMember(){
        for (U member : member) {
            System.out.println(member);
        }
    }
    
    public void displayAll() {
        System.out.println("==================================================");
        System.out.println("Gym: " + namaGym);
        displayDataAlat();
        displayMember();
    }
}
