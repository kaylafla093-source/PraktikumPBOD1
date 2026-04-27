/* Nama File    : Burung.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Burung) Gerak: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Burung) Bersuara: Cuit");
    }
}