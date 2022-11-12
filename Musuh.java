/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Musuh extends Karakter{
    public Musuh(){}
    public Musuh(String nama, int hp, char level, String gender, int attack){
        super (nama, hp, level, gender, attack);
    }
    
    public void showMusuh(){
        System.out.println("Nama: " + nama);
        System.out.println("Gender: " + gender);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
    }
}
