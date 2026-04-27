package Inclusion.Inclusion_Civitasakademika;
/* Nama File    : Mahasiswa.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

/* a.Kelas Mahasiswa */
public class Mahasiswa extends Civitasakademika {
    private String NIM;
    private Dosen Dosenwali;

    public Mahasiswa(String Nama, String NIM, Dosen Dosenwali) {
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    /* i.Prosedur setWali untuk mengubah isian komponen dosenwali dengan parameter input dosen */
    public void setWali(Dosen d) {
        this.Dosenwali = d;
    }

    /* j. Prosedur tampilDataMahasiswa untuk menampilkan data NIM,
          Nama Mahasiswa, dan Nama Dosenwali */
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Dosen Wali: " + Dosenwali.getNama());
    }
}