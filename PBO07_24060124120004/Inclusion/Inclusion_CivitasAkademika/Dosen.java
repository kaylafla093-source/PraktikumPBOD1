/* Nama File    : Dosen.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

/* a.Kelas Dosen */
public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}