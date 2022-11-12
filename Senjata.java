/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Senjata extends Items{
    int maksAttack;
    int attack;
    
    public Senjata(){}
    public Senjata(String namaItem, int hargaBeli, int hargaJual, int maksAttack, int attack ){
        super(namaItem, hargaBeli, hargaJual);
        this.maksAttack = maksAttack;
        this.attack = attack;
    }
    
    public void setMaksAttack(int maksAttack){
        this.maksAttack = maksAttack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    
    public int getMaksAttack(int maksAttack){
        return this.maksAttack;
    }
    public int detAttack(int attack){
        return this.attack;
    }
    
    public void showSenjata(){
        System.out.println("Nama Senjata: " + namaItem);
        System.out.println("Attack: " + attack);
        System.out.println("Maksimal attack: " + maksAttack);
        System.out.println("Harga beli: " + hargaBeli);
        System.out.println("Harga jual: " + hargaJual);
    }
}
