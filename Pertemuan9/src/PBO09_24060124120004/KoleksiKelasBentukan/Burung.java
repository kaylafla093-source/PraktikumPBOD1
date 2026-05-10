package PBO09_24060124120004.KoleksiKelasBentukan;

/* Nama File    : Burung.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

public class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Burung) Gerak: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Burung) Bersuara: Cuit");
    }
}    