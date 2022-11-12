/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Player extends Karakter {
    public int defense;
    
    public Player(){}
    public Player(String nama, int hp, char level, String gender, int attack, int defense){
        super (nama, hp, level, gender, attack);
        this.defense = defense;
    }
    
    public void setDefense(int defense){
        this.defense = defense;
    }
    
    public int getDefense(){
        return this.defense;
    }
    
    public void showPlayer(){
        System.out.println("Nama: " + nama);
        System.out.println("Gender: " + gender);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
    }
}
