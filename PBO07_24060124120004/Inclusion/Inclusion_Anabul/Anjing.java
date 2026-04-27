/* Nama File    : Anjing.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Anjing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Anjing) Bersuara: Guk-guk");
    }
}