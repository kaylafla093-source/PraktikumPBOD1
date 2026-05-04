package PBO08_24060124120004;

/* Nama File    : Kembangtelon.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

/* 1. b) Kelas Kembangtelon yang mewarisi kelas Kucing */
public class Kembangtelon extends Kucing {
    public Kembangtelon(String Nama, double bobot) {
        super(Nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Kembangtelon) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Kembangtelon) Bersuara: Meong");
    }
}