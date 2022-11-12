/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Kostum {
    String warnaBaju;
    String warnaRambut;
    
    public Kostum(){}
    public Kostum(String warnaBaju, String warnaRambut){
        this.warnaBaju = warnaBaju;
        this.warnaRambut = warnaRambut;
    }
    
    public void setWarnaBaju(String warnaBaju){
        this.warnaBaju = warnaBaju;
    }
    public void setWarnaRambut(String warnaRambut){
        this.warnaRambut = warnaRambut;
    }
    
    public String getWarnaBaju(){
        return this.warnaBaju;
    }
    public String getWarnaRambut(){
        return this.warnaRambut;
    }
}
