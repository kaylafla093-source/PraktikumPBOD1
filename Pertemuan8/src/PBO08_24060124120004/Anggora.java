package PBO08_24060124120004;

/* Nama File    : Anggora.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

/* 1. b) Kelas Anggora yang mewarisi kelas Kucing */
public class Anggora extends Kucing {
    public Anggora(String Nama, double bobot) {
        super(Nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Anggora) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Anggora) Bersuara: Meong");
    }  
}