/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */

public class Perisai extends Items{
    int maksDefense;
    int defense;
    
    public Perisai(){}
    public Perisai(String namaItem, int hargaBeli, int hargaJual, int maksDefense, int defense){
        super(namaItem, hargaBeli, hargaJual);
        this.maksDefense = maksDefense;
        this.defense = defense;
    }
    
    public void setMaksDefense(int maksDefense){
        this.maksDefense = maksDefense;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    
    public int getMaksDefense(int maksDefense){
        return this.maksDefense;
    }
    public int getDefense(int defense){
        return this.defense;
    }
    
    public void showSenjata(){
        System.out.println("Nama Senjata: " + namaItem);
        System.out.println("Defense: " + defense);
        System.out.println("Maksimal defense: " + maksDefense);
        System.out.println("Harga beli: " + hargaBeli);
        System.out.println("Harga jual: " + hargaJual);
    }
}
