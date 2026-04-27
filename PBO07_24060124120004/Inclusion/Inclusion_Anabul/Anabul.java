/* Nama File    : Anabul.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

/* III. POLIMORFISME UNIVERSAL INCLUSION
   3. Kelas induk: Anabul
      Kelas anak: Kucing, Anjing, Burung */
public abstract class Anabul {
    protected String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}