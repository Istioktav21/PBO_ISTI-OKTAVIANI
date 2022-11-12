/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */

public class Items {
    protected String namaItem;
    protected int hargaBeli;
    protected int hargaJual;
    
    public Items(){}
    public Items(String namaItem, int hargaBeli, int hargaJual){
        this.namaItem = namaItem;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }
    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getNamaItem() {
        return this.namaItem;
    }
    public int getHargaBeli() {
        return this.hargaBeli;
    }
    public int getHargaJual() {
        return this.hargaJual;
    }
}
