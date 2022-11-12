/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class KostumMusuh extends Kostum{
    public KostumMusuh(){}
    public KostumMusuh(String warnaBaju, String warnaRambut){
        super(warnaBaju, warnaRambut);
    }
    
    public void showKostumMusuh(){
        System.out.println("Warna baju: " + warnaBaju);
        System.out.println("Warna rambut: " + warnaRambut);
    }
}
