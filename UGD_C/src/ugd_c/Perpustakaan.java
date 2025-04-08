/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_c;

import java.util.List;
import java.util.ArrayList;
public class Perpustakaan<T extends Buku, U extends Customer>{
    private String namaPerpustakaan;
    private DataBuku<T> dataBuku;
    private List<U> member;

    public Perpustakaan(String namaPerpustakaan, DataBuku<T> dataBuku) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.dataBuku = dataBuku;
	this.member = new ArrayList();
    }

    public void addMember(U member) {
        this.member.add(member);
    }

//    public void removeMember(String id) {
//        member.remove(id);
//    }
    public void displayDataBuku(){
        dataBuku.displayItems();
    }
    
    public void displayMember(){
        for (U member : member) {
            System.out.println(member);
        }
    }
    
    public void displayAll() {
        System.out.println("==================================================");
        System.out.println("Perpustakaan: " + namaPerpustakaan);
        displayDataBuku();
        displayMember();
    }
}
