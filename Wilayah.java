/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Wilayah {
    String namaLokasi;
    String cuaca;
    String waktu;
    
    public Wilayah(){}
    public Wilayah (String namaLokasi, String cuaca, String waktu){
        this.namaLokasi = namaLokasi;
        this.cuaca = cuaca;
        this.waktu = waktu;
    }
    
    public void setNamaLokasi(String namaLokasi){
        this.namaLokasi = namaLokasi;
    }
    public void setCuaca(String cuaca){
        this.cuaca = cuaca;
    }
    public void setWaktu(String waktu){
        this.waktu = waktu;
    }
    
    public String getNamaLokasi(){
        return this.namaLokasi;
    }
    public String getCuaca(){
        return this.cuaca;
    }
    public String getWaktu(){
        return this.waktu;
    }
    
    public void showWilayah(){
        System.out.println("Nama wilayah: " + namaLokasi);
        System.out.println("Cuaca : " + cuaca);
        System.out.println("Waktu : " + waktu);
    }
}
