package PBO09_24060124120004.KoleksiKelasBentukan;

/* Nama File    : Anggora.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

public class Anggora extends Kucing {
    public Anggora(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Anggora) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Anggora) Bersuara: Meong");
    }  
}