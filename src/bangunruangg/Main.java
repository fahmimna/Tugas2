/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruangg;
import java.util.*;
import bangunruangg.Balok;
import bangunruangg.Tabung;

public class Main {
    static int pil,menu;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, tinggiBalok, jari, tinggiTabung;
        
        do{
        System.out.println("\n+----------------+");
        System.out.println("|   MENU UTAMA   |");
        System.out.println("+----------------+");
        System.out.println("[1] Hitung Balok");
        System.out.println("[2] Hitung Tabung");
        System.out.println("[0] Exit");
        System.out.print("> Pilih  : ");
        pil=input.nextInt();
        
        switch (pil) {
            case 1:
                System.out.print("Input Panjang  : ");
                panjang=input.nextInt();
                System.out.print("Input Lebar    : ");
                lebar=input.nextInt();
                System.out.print("Input Tinggi   : ");
                tinggiBalok=input.nextInt();
                
                Balok balok = new Balok(panjang,lebar,tinggiBalok);
                
                System.out.println("Luas Persegi Panjang        : " + balok.luas());
                System.out.println("Keliling Persegi Panjang    : " + balok.keliling());
                System.out.println("Volume Balok                : " + balok.volume());
                System.out.println("Luas Permukaan Balok        : " + balok.luasPermukaan());
                break;
            case 2:                
                System.out.print("Input Jari-jari : ");
                jari=input.nextDouble();
                System.out.print("Input Tinggi    : ");
                tinggiTabung=input.nextDouble();
                
                Tabung tabung = new Tabung(jari,tinggiTabung);
                System.out.println("Luas Lingkaran         : " + tabung.luas());
                System.out.println("Keliling Lingkaran     : " + tabung.keliling());
                System.out.println("Volume Tabung          : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung  : " + tabung.luasPermukaan());                
                break;
            case 0:
                System.exit(0);
              default:
                System.out.println("\n ! Opsi tidak tersedia, Harap input dengan benar !\n");
                  break;
            }
        
        System.out.print("Ulangi ?  (Ya = 1 || Tidak = 0) : ");
        menu=input.nextInt();
        }while(menu!=0);
    }   
}