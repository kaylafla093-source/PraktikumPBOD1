/* Nama File    : CivitasAkademika.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

/* III. POLIMORFISME UNIVERSAL INCLUSION
   4. Kelas induk: Civitasakademika
      Kelas anak: Dosen dan Mahasiswa 
      a.Kelas Civitasakademika */
public abstract class Civitasakademika {
    protected String Nama;

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public abstract String getNomor(); 
}