/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_e;

import java.util.List;
import java.util.ArrayList;
public class DataAlat<T> {
    private List<T> items;

    public DataAlat() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }
    
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
