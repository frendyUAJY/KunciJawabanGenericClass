/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_c;

/**
 *
 * @author frend
 */
public class UGD_C {
    public static void main(String[] args) {
        DataBuku<Buku> dataBuku = new DataBuku<>();
        dataBuku.addItem(new Buku("Laskar Pelangi", "Andrea Hirata", 2007, true));
        dataBuku.addItem(new Buku("Marmut Merah Jambu", "Raditya Dika", 2012, false));
        dataBuku.addItem(new Buku("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, false));
        dataBuku.addItem(new Buku("Filosofi Teras", "Henry Manampiring", 2018, true));
        
        Perpustakaan<Buku, Customer> perpusA = new Perpustakaan<>("Perpustakaan A", dataBuku);
        perpusA.addMember(new Customer("Hendra", "hendra@gmail.com", 25, "Jl. Merdeka"));
        perpusA.addMember(new Customer("Jono", "jono@gmail.com", 18, "Jl. A. Yani"));
        perpusA.addMember(new Customer("Nanda", "nanda@gmail.com", 22, "Jl. Babarsari"));
        perpusA.addMember(new Customer("Nira", "nira@gmail.com", 26, "Jl. Seturan"));
        perpusA.displayAll();
        
        dataBuku.addItem(new Buku("Kambing Jantan", "Raditya Dika", 2005, false));
        dataBuku.addItem(new Buku("Mantappu Jiwa", "Jerome Polin", 2023, true));
        dataBuku.addItem(new Buku("Cantik Itu Luka", "Eka Kurniawan", 2002, false));
        dataBuku.addItem(new Buku("Rumah Kaca", "Pramudya Ananta Toer", 1988, true));
        
        Perpustakaan<Buku, Customer> perpusB = new Perpustakaan<>("Perpustakaan B", dataBuku);
        perpusB.addMember(new Customer("Vicky", "vicky@gmail.com", 19, "Jl. Merdeka"));
        perpusB.addMember(new Customer("Aldi", "aldi@gmail.com", 30, "Jl. A. Yani"));
        perpusB.addMember(new Customer("Dimas", "dimas@gmail.com", 27, "Jl. Babarsari"));
        perpusB.addMember(new Customer("Joni", "joni@gmail.com", 25, "Jl. Seturan"));
        
        perpusB.displayAll();
    }
    
}
