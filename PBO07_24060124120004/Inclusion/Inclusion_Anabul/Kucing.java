/* Nama File    : Kucing.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

public class Kucing extends Anabul {
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Kucing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Kucing) Bersuara: Meong");
    }
}