/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class KostumPlayer extends Kostum {
    String aksesoris;
    
    public KostumPlayer(){}
    public KostumPlayer(String warnaBaju, String warnaRambut, String aksesoris){
        super(warnaBaju, warnaRambut);
        this.aksesoris = aksesoris;
    }
    
    public void setAksesoris(String aksesoris){
        this.aksesoris = aksesoris;
    }
    
    public String getAksesoris(){
        return this.aksesoris;
    }
    
    public void showKostumPlayer(){
        System.out.println("Warna baju: " + warnaBaju);
        System.out.println("Warna rambut: " + warnaRambut);
        System.out.println("Aksesoris: " + aksesoris);
    }
}
