/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myPackage;

/**
 *
 * @author Dwi Novia Al Husaeni
 */

import java.util.Scanner;
import myPackage.Player;
import myPackage.Musuh;
import myPackage.Wilayah;
import myPackage.KostumPlayer;
import myPackage.KostumMusuh;
import myPackage.Perisai;
import myPackage.Senjata;
import myPackage.Obat;
import myPackage.Deksripsi;

public class Play {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int pilihan, pilihMenu, pilihPlayer, pilihMusuh;
        char ulang;
        
        System.out.println("============================");
        System.out.println("  WELCOME TO FIGHTING GAME  ");
        System.out.println("============================");
        System.out.println("[1] Mulai permainan");
        System.out.println("[2] Keluar");

        System.out.print("Pilihan anda: ");
        pilihan = input.nextInt();
    
        if(pilihan == 2){
            System.exit(0);
        }
        else if(pilihan == 1){
            System.out.println();
            do{
                System.out.println("============================");
                System.out.println("  WELCOME TO FIGHTING GAME  ");
                System.out.println("============================");
                System.out.println("[1] Pilih karakter");
                System.out.println("[2] Pilih item");
                System.out.println("[3] Pilih wilayah");
                System.out.println("[4] Toko Obat");
                System.out.println("[5] Cek kondisi ruang dalam tas"); 
                System.out.println("[0] Keluar");
                
                System.out.print("Pilihan anda: ");
                pilihMenu = input.nextInt();
                
                switch(pilihMenu){
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println("============================");
                        System.out.println("       PILIH KARAKTER       ");
                        System.out.println("============================");
                        System.out.println("[1]Player");
                        System.out.println("[2]Musuh");
                        
                        int pilihKarakter;
                        System.out.print("Pilihan anda: ");
                        pilihKarakter = input.nextInt();
                        
                        if(pilihKarakter == 1){
                            System.out.println("============================");
                            System.out.println("        PILIH PLAYER        ");
                            System.out.println("============================");
                            System.out.println("[1]Hinata Hyuga");
                            System.out.println("[2]Sakura Haruno");
                            System.out.println("[3]Sasuke Uchiha");
                            System.out.println("[4]Naruto Uzumaki");

                            System.out.print("Pilihan anda: ");
                            pilihPlayer = input.nextInt();

                            switch (pilihPlayer) {
                                case 1:
                                {
                                    Player player = new Player();
                                    player.setNama("Hinata Hyuga");
                                    player.setHp(5);
                                    player.setGender("Perempuan");
                                    player.setAttack(20);
                                    player.setDefense(20);
                                    System.out.println("============================");
                                    System.out.println("       KARAKTER ANDA        ");
                                    System.out.println("============================");
                                    player.showPlayer();
                                    break;
                                }
                                case 2:
                                {
                                    Player player = new Player();
                                    player.setNama("Sakura Haruno");
                                    player.setHp(5);
                                    player.setGender("Perempuan");
                                    player.setAttack(20);
                                    player.setDefense(20);
                                    System.out.println("============================");
                                    System.out.println("       KARAKTER ANDA        ");
                                    System.out.println("============================");
                                    player.showPlayer();
                                    break;
                                }
                                case 3:
                                {
                                    Player player = new Player();
                                    player.setNama("Sasuke Uchiha");
                                    player.setHp(5);
                                    player.setGender("Laki-laki");
                                    player.setAttack(20);
                                    player.setDefense(20);
                                    System.out.println("============================");
                                    System.out.println("       KARAKTER ANDA        ");
                                    System.out.println("============================");
                                    player.showPlayer();
                                    break;
                                }
                                case 4:
                                {
                                    Player player = new Player();
                                    player.setNama("Naruto Uzumaki");
                                    player.setHp(5);
                                    player.setGender("Laki-laki");
                                    player.setAttack(20);
                                    player.setDefense(20);
                                    System.out.println("============================");
                                    System.out.println("       KARAKTER ANDA        ");
                                    System.out.println("============================");
                                    player.showPlayer();
                                    break;
                                } 
                                default:
                                {
                                    System.out.println("Pilihan anda belum tersedia");
                                    break;
                                }
                            }
                        }else if(pilihKarakter == 2){
                            System.out.println("============================");
                            System.out.println("        PILIH MUSUH        ");
                            System.out.println("============================");
                            System.out.println("[1]Orochimaru");
                            System.out.println("[2]Uciha Obito");
                            System.out.println("[3]Danzo Shimura");
                            System.out.println("[4]Madara Uchiha");

                            System.out.print("Pilihan anda: ");
                            pilihMusuh = input.nextInt();

                            switch (pilihMusuh) {
                                case 1:
                                {
                                    Musuh musuh = new Musuh();
                                    musuh.setNama("Orochimaru");
                                    musuh.setHp(7);
                                    musuh.setGender("Laki-Laki");
                                    musuh.setAttack(20);
                                    System.out.println("============================");
                                    System.out.println("        LAWAN ANDA          ");
                                    System.out.println("============================");
                                    musuh.showMusuh();
                                    break;
                                }
                                case 2:
                                {
                                    Musuh musuh = new Musuh();
                                    musuh.setNama("Uciha Obito");
                                    musuh.setHp(7);
                                    musuh.setGender("Laki-Laki");
                                    musuh.setAttack(20);
                                    System.out.println("============================");
                                    System.out.println("        LAWAN ANDA          ");
                                    System.out.println("============================");
                                    musuh.showMusuh();
                                    break;
                                }
                                case 3:
                                {
                                    Musuh musuh = new Musuh();
                                    musuh.setNama("Danzo Shimura");
                                    musuh.setHp(7);
                                    musuh.setGender("Laki-Laki");
                                    musuh.setAttack(20);
                                    System.out.println("============================");
                                    System.out.println("        LAWAN ANDA          ");
                                    System.out.println("============================");
                                    musuh.showMusuh();
                                    break;
                                }
                                case 4:
                                {
                                    Musuh musuh = new Musuh();
                                    musuh.setNama("Madara Uchiha");
                                    musuh.setHp(7);
                                    musuh.setGender("Laki-Laki");
                                    musuh.setAttack(20);
                                    System.out.println("============================");
                                    System.out.println("        LAWAN ANDA          ");
                                    System.out.println("============================");
                                    musuh.showMusuh();
                                    break;
                                } 
                                default:
                                {
                                    System.out.println("Pilihan anda belum tersedia");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("============================");
                        System.out.println("         PILIH ITEMS        ");
                        System.out.println("============================");
                        System.out.println("[1]Senjata");
                        System.out.println("[2]Perisai");
                        System.out.println("[3]Obat");
                        System.out.println("[4]Kostum");
                        
                        int pilihItem;
                        System.out.print("Pilihan anda: ");
                        pilihItem = input.nextInt();
                        
                        switch (pilihItem) {
                            case 1:
                                System.out.println("============================");
                                System.out.println("        PILIH SENJATA       ");
                                System.out.println("============================");
                                System.out.println("[1]Kunai");
                                System.out.println("[2]Shuriken");
                                System.out.println("[3]Katana");
                                System.out.println("[4]Kugutsu");
                                int pilihSenjata;
                                System.out.print("Pilihan anda: ");
                                pilihSenjata = input.nextInt();
                                switch (pilihSenjata) {
                                    case 1:
                                    {
                                        Senjata senjata = new Senjata();
                                        senjata.setNamaItem("Kunai");
                                        senjata.setAttack(10);
                                        senjata.setMaksAttack(100);
                                        System.out.println("============================");
                                        System.out.println("       SENJATA ANDA        ");
                                        System.out.println("============================");
                                        senjata.showSenjata();
                                        break;
                                    }
                                    case 2:
                                    {
                                        Senjata senjata = new Senjata();
                                        senjata.setNamaItem("Shuriken");
                                        senjata.setAttack(20);
                                        senjata.setMaksAttack(200);
                                        System.out.println("============================");
                                        System.out.println("       SENJATA ANDA        ");
                                        System.out.println("============================");
                                        senjata.showSenjata();
                                        break;
                                    }
                                    case 3:
                                    {
                                        Senjata senjata = new Senjata();
                                        senjata.setNamaItem("Katana");
                                        senjata.setAttack(30);
                                        senjata.setMaksAttack(300);
                                        System.out.println("============================");
                                        System.out.println("       SENJATA ANDA        ");
                                        System.out.println("============================");
                                        senjata.showSenjata();
                                        break;
                                    }
                                    case 4:
                                    {
                                        Senjata senjata = new Senjata();
                                        senjata.setNamaItem("Kugutsu");
                                        senjata.setAttack(40);
                                        senjata.setMaksAttack(400);
                                        System.out.println("============================");
                                        System.out.println("       SENJATA ANDA        ");
                                        System.out.println("============================");
                                        senjata.showSenjata();
                                        break;
                                    } 
                                    default:
                                    {
                                        System.out.println("Pilihan anda belum tersedia");
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("============================");
                                System.out.println("        PILIH PERISAI       ");
                                System.out.println("============================");
                                System.out.println("[1]Perisai Kayu");
                                System.out.println("[2]Perisai Tembaga");
                                System.out.println("[3]Perisai Timbal");
                                System.out.println("[4]Perisai Besi");
                                int pilihPerisai;
                                System.out.print("Pilihan anda: ");
                                pilihPerisai = input.nextInt();
                                switch (pilihPerisai) {
                                    case 1:
                                    {
                                        Perisai perisai = new Perisai();
                                        perisai.setNamaItem("Perisai Kayu");
                                        perisai.setDefense(5);
                                        perisai.setMaksDefense(50);
                                        System.out.println("============================");
                                        System.out.println("        PERISAI ANDA        ");
                                        System.out.println("============================");
                                        perisai.showSenjata();
                                        break;
                                    }
                                    case 2:
                                    {
                                        Perisai perisai = new Perisai();
                                        perisai.setNamaItem("Perisai Tembaga");
                                        perisai.setDefense(10);
                                        perisai.setMaksDefense(100);
                                        System.out.println("============================");
                                        System.out.println("       PERISAI ANDA        ");
                                        System.out.println("============================");
                                        perisai.showSenjata();
                                        break;
                                    }
                                    case 3:
                                    {
                                        Perisai perisai = new Perisai();
                                        perisai.setNamaItem("Perisai Timbal");
                                        perisai.setDefense(15);
                                        perisai.setMaksDefense(150);
                                        System.out.println("============================");
                                        System.out.println("       PERISAI ANDA        ");
                                        System.out.println("============================");
                                        perisai.showSenjata();
                                        break;
                                    }
                                    case 4:
                                    {
                                        Perisai perisai = new Perisai();
                                        perisai.setNamaItem("Perisai Besi");
                                        perisai.setDefense(20);
                                        perisai.setMaksDefense(200);
                                        System.out.println("============================");
                                        System.out.println("       PERISAI ANDA        ");
                                        System.out.println("============================");
                                        perisai.showSenjata();
                                        break;
                                    } 
                                    default:
                                    {
                                        System.out.println("Pilihan anda belum tersedia");
                                        break;
                                    }
                                }
                                break;
                        case 3:
                            System.out.println("============================");
                            System.out.println("         PILIH OBAT         ");
                            System.out.println("============================");
                            System.out.println("[1]Pil tiga warna");
                            System.out.println("[2]Gehin");
                            int pilihObat;
                            System.out.print("Pilihan anda: ");
                            pilihObat = input.nextInt();
                            switch (pilihObat) {
                                case 1:
                                {
                                    Obat obat = new Obat();
                                    obat.setNamaBarang("Pil Tiga Warna");
                                    obat.setJumlahBarang(2);
                                    System.out.println("============================");
                                    System.out.println("         OBAT ANDA          ");
                                    System.out.println("============================");
                                    obat.showObat();
                                    break;
                                }
                                case 2:
                                {
                                    Obat obat = new Obat();
                                    obat.setNamaBarang("Gehin");
                                    obat.setJumlahBarang(1);
                                    System.out.println("============================");
                                    System.out.println("         OBAT ANDA          ");
                                    System.out.println("============================");
                                    obat.showObat();
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Pilihan anda belum tersedia");
                                    break;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("============================");
                            System.out.println("        PILIH KOSTUM        ");
                            System.out.println("============================");
                            System.out.println("[1]Kostum Player");
                            System.out.println("[2]Kostum Musuh");
                            int pilihKostum;
                            System.out.print("Pilihan anda: ");
                            pilihKostum = input.nextInt();
                            
                            if(pilihKostum == 1){
                                System.out.println("============================");
                                System.out.println("    PILIH KOSTUM PLAYER     ");
                                System.out.println("============================");
                                System.out.println("[1]Kostum 1");
                                System.out.println("[2]Kostum 2");
                                System.out.println("[3]Kostum 3");
                                System.out.println("[4]Kostum 4");
                                
                                int pilihKosPlayer;
                                System.out.print("Pilihan anda: ");
                                pilihKosPlayer = input.nextInt();
                                
                                switch (pilihKosPlayer) {
                                    case 1:
                                    {
                                        KostumPlayer KP = new KostumPlayer();
                                        KP.setWarnaBaju("Gray-Purple");
                                        KP.setWarnaRambut("Dark-Blue");
                                        KP.setAksesoris("Ikat kepala");
                                        System.out.println("============================");
                                        System.out.println("         KOSTUM ANDA        ");
                                        System.out.println("============================");
                                        KP.showKostumPlayer();
                                        break;
                                    }
                                    case 2:
                                    {
                                        KostumPlayer KP = new KostumPlayer();
                                        KP.setWarnaBaju("Red-Pink");
                                        KP.setWarnaRambut("Pink");
                                        KP.setAksesoris("Ikat kepala");
                                        System.out.println("============================");
                                        System.out.println("         KOSTUM ANDA        ");
                                        System.out.println("============================");
                                        KP.showKostumPlayer();
                                        break;
                                    }
                                    case 3:
                                    {
                                        KostumPlayer KP = new KostumPlayer();
                                        KP.setWarnaBaju("Gray-Blue");
                                        KP.setWarnaRambut("Black");
                                        KP.setAksesoris("Ikat kepala");
                                        System.out.println("============================");
                                        System.out.println("         KOSTUM ANDA        ");
                                        System.out.println("============================");
                                        KP.showKostumPlayer();
                                        break;
                                    }
                                    case 4:
                                    {
                                        KostumPlayer KP = new KostumPlayer();
                                        KP.setWarnaBaju("Orange-Black");
                                        KP.setWarnaRambut("Orange");
                                        KP.setAksesoris("Ikat kepala");
                                        System.out.println("============================");
                                        System.out.println("         KOSTUM ANDA        ");
                                        System.out.println("============================");
                                        KP.showKostumPlayer();
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Pilihan anda belum tersedia");
                                        break;
                                    }
                                }
                                break;
                            }else if(pilihKostum == 2){
                                System.out.println("============================");
                                System.out.println("     PILIH KOSTUM MUSUH     ");
                                System.out.println("============================");
                                System.out.println("[1]Kostum 1");
                                System.out.println("[2]Kostum 2");
                                System.out.println("[3]Kostum 3");
                                System.out.println("[4]Kostum 4");
                                
                                int pilihKosMusuh;
                                System.out.print("Pilihan anda: ");
                                pilihKosMusuh = input.nextInt();
                                
                                switch (pilihKosMusuh) {
                                    case 1:
                                    {
                                        KostumMusuh KM = new KostumMusuh();
                                        KM.setWarnaBaju("Beige");
                                        KM.setWarnaRambut("Black");
                                        System.out.println("============================");
                                        System.out.println("        KOSTUM MUSUH        ");
                                        System.out.println("============================");
                                        KM.showKostumMusuh();
                                        break;
                                    }
                                    case 2:
                                    {
                                        KostumMusuh KM = new KostumMusuh();
                                        KM.setWarnaBaju("Black-Red");
                                        KM.setWarnaRambut("Black");
                                        System.out.println("============================");
                                        System.out.println("        KOSTUM MUSUH        ");
                                        System.out.println("============================");
                                        KM.showKostumMusuh();
                                        break;
                                    }
                                    case 3:
                                    {
                                        KostumMusuh KM = new KostumMusuh();
                                        KM.setWarnaBaju("Gray-Purple");
                                        KM.setWarnaRambut("Dark-Blue");
                                        System.out.println("============================");
                                        System.out.println("        KOSTUM MUSUH        ");
                                        System.out.println("============================");
                                        KM.showKostumMusuh();
                                        break;
                                    }
                                    case 4:
                                    {
                                        KostumMusuh KM = new KostumMusuh();
                                        KM.setWarnaBaju("Gray-Purple");
                                        KM.setWarnaRambut("Dark-Blue");
                                        System.out.println("============================");
                                        System.out.println("        KOSTUM MUSUH        ");
                                        System.out.println("============================");
                                        KM.showKostumMusuh();
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Pilihan anda belum tersedia");
                                        break;
                                    }
                                }
                                break;
                            }
                        default:
                            System.out.println("Pilihan anda belum tersedia");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("============================");
                        System.out.println("       PILIH WILAYAH        ");
                        System.out.println("============================");
                        System.out.println("[1]Wilayah 1");
                        System.out.println("[2]Wilayah 2");
                        System.out.println("[3]Wilayah 3");
                        System.out.println("[4]Wilayah 4");                        
                        
                        int pilihWilayah;
                        System.out.print("Pilihan anda: ");
                        pilihWilayah = input.nextInt();
                            
                        switch(pilihWilayah) {
                            case 1:
                            {
                                Wilayah wilayah = new Wilayah();
                                wilayah.setNamaLokasi("Konohagakure");
                                wilayah.setCuaca("Cerah");
                                wilayah.setWaktu("Siang");
                                System.out.println("============================");
                                System.out.println("     WILAYAH BERTARUNG      ");
                                System.out.println("============================");
                                wilayah.showWilayah();
                                break;
                            }
                            case 2:
                            {
                                Wilayah wilayah = new Wilayah();
                                wilayah.setNamaLokasi("Sunagakure");
                                wilayah.setCuaca("Badai Pasir");
                                wilayah.setWaktu("Malam");
                                System.out.println("============================");
                                System.out.println("     WILAYAH BERTARUNG      ");
                                System.out.println("============================");
                                wilayah.showWilayah();
                                break;
                            }
                            case 3:
                            {
                                Wilayah wilayah = new Wilayah();
                                wilayah.setNamaLokasi("Kirigakure");
                                wilayah.setCuaca("Hujan");
                                wilayah.setWaktu("Siang");
                                System.out.println("============================");
                                System.out.println("     WILAYAH BERTARUNG      ");
                                System.out.println("============================");
                                wilayah.showWilayah();
                                break;
                            }
                            case 4:
                            {
                                Wilayah wilayah = new Wilayah();
                                wilayah.setNamaLokasi("Kumogakure");
                                wilayah.setCuaca("Berawan");
                                wilayah.setWaktu("Malam");
                                System.out.println("============================");
                                System.out.println("     WILAYAH BERTARUNG      ");
                                System.out.println("============================");
                                wilayah.showWilayah();
                                break;
                            }
                            default:
                            {
                                System.out.println("Pilihan anda belum tersedia");
                                break;
                            }      
                        }
                        break;
                    case 4:
                        System.out.println("===============================");
                        System.out.println("           TOKO OBAT           ");
                        System.out.println("   SELAMAT DATANG DAN MELIHAT  ");
                        System.out.println("===============================");
                        System.out.println("[1]Pil tiga warna");
                        System.out.println("[2]Gehin");
                        
                        int tokoObat;
                        System.out.print("Pilihan anda: ");
                        tokoObat = input.nextInt();
                        
                        switch (tokoObat) {
                            case 1:
                            {
                                    Obat obat = new Obat();
                                    obat.setNamaBarang("Pil Tiga Warna");
                                    obat.setJumlahBarang(100);
                                    obat.setHargaBarang(50);
                                    obat.showObat();
                                    break;
                            }
                            case 2:
                            {
                                Obat obat = new Obat();
                                obat.setNamaBarang("Gehin");
                                obat.setJumlahBarang(50);
                                obat.setHargaBarang(70);
                                obat.showObat();
                                break;
                            }
                            default:
                            {
                                System.out.println("Pilihan anda belum tersedia");
                                break;
                            }    
                        }
                        break;
                    case 5:
                        Deksripsi desk = new Deksripsi();
                        
                        System.out.println();
                        desk.kondisi();
                        
                        System.out.println("Apakah ingin cek isi didalam tas?");
                        System.out.println("[1] Ya");
                        System.out.println("[2] Tidak");
                        
                        int pilihCek;
                        System.out.print("Pilihan anda: ");
                        pilihCek = input.nextInt();
                        
                        if(pilihCek == 1){
                            System.out.println();
                            desk.deskripsi();
                        }else if(pilihCek == 2){
                            System.exit(0);
                        }
                        break;
                    default:
                    {
                        System.out.println("Menu tidak tersedia");
                    }
                }
                System.out.println();
                System.out.print("Ingin memilih menu lain (y/t)? ");
                ulang = input.next().charAt(0);
                System.out.println();
            }
            while(ulang != 't');
        }
    }
}
