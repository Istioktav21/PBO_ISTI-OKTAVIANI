/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Karakter {
    protected String nama;
    protected int hp;
    protected char level;
    protected String gender;
    protected int attack;
    
    public Karakter(){}
    public Karakter(String nama, int hp, char level, String gender, int attack){
        this.nama = nama;
        this.hp = hp;
        this.level = level;
        this.gender = gender;
        this.attack = attack;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setLevel(char level){
        this.level = level;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
        
    public String getNama(){
        return this.nama;
    }
    public int getHp(){
        return this.hp;
    }
    public char getLevel(){
        return this.level;
    }
    public String getGender(){
        return this.gender;
    } 
    public int getAttack(){
        return this.attack;
    }
}
