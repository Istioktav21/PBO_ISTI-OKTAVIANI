/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */
public class Obat implements {
    String namaObat;
    int jumlahObat;
    int hargaObat;
    
    @Override
    public void setNamaBarang(String namaBarang) {
        this.namaObat = namaBarang;
    }

    @Override
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahObat = jumlahBarang;
    }

    @Override
    public void setHargaBarang(int hargaBarang) {
        this.hargaObat = hargaBarang;
    }

    @Override
    public String getNamaBarang() {
        System.out.println("Nama Obat: " + namaObat);
        return this.namaObat;
    }

    @Override
    public int getJumlahBarang() {
        System.out.println("Jumlah obat: " + jumlahObat);
        return this.jumlahObat;
    }

    @Override
    public int getHargaBarang() {
        System.out.println("Harga Obat: " + hargaObat);
        return this.hargaObat;
    }
    
    public void showObat(){
        System.out.println("Nama obat: " + namaObat);
        System.out.println("Jumlah obat: " + jumlahObat);
        System.out.println("Harga obat: " + hargaObat);
    }
}
