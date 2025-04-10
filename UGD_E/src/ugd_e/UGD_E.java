/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_e;

/**
 *
 * @author frend
 */
public class UGD_E {
    public static void main(String[] args) {
        
        DataAlat<Alat> dataAlat = new DataAlat<>();
        dataAlat.addItem(new Alat("Bench Press", "FitnessOne", 2018, false));
        dataAlat.addItem(new Alat("Dumbell", "GoFitness", 2020, true));
        dataAlat.addItem(new Alat("Barbell", "FitnessOne", 2024, true));
        dataAlat.addItem(new Alat("Leg Press", "FitnessOne", 2015, false));
        
        Gym<Alat, Customer> gymA = new Gym<>("Gym A", dataAlat);
        gymA.addMember(new Customer("Hendra", "hendra@gmail.com", 25, "Jl. Merdeka"));
        gymA.addMember(new Customer("Jono", "jono@gmail.com", 18, "Jl. A. Yani"));
        gymA.addMember(new Customer("Nanda", "nanda@gmail.com", 22, "Jl. Babarsari"));
        gymA.addMember(new Customer("Nira", "nira@gmail.com", 26, "Jl. Seturan"));
        gymA.displayAll();
        
        dataAlat.addItem(new Alat("Shoulder Press", "GoFitness", 2017, true));
        dataAlat.addItem(new Alat("Pull Up Bar", "GoFitness", 2024, false));
        dataAlat.addItem(new Alat("Treadmill", "FitAndGo", 2023, false));
        dataAlat.addItem(new Alat("Barbell", "FitnessOne", 2021, true));
        
        Gym<Alat, Customer> gymB = new Gym<>("Gym B", dataAlat);     
        gymB.addMember(new Customer("Vicky", "vicky@gmail.com", 19, "Jl. Merdeka"));
        gymB.addMember(new Customer("Aldi", "aldi@gmail.com", 30, "Jl. A. Yani"));
        gymB.addMember(new Customer("Dimas", "dimas@gmail.com", 27, "Jl. Babarsari"));
        gymB.addMember(new Customer("Joni", "joni@gmail.com", 25, "Jl. Seturan"));
        gymB.displayAll();
    }
    
}
