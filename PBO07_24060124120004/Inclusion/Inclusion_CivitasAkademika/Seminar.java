/* Nama File    : Seminar.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

/* b.Kelas Seminar */
public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    /* c.Fungsi countPeserta untuk menghitung banyaknya peserta seminar */
    public int countPeserta() {
        return banyakpeserta;
    }

    /* d.Prosedur registrasi untuk menambahkan seorang peserta dengan parameter masukan sebuah objek Civitasakademika */
    public void registrasi(Civitasakademika c) {
        if(banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas Penuh!");
        }
    }
    
    /* g.Prosedur tampilPeserta untuk menampilkan daftar Nomor dan Nama semua peserta seminar */
    public void tampilPeserta() {
        System.out.println(" ===== DAFTAR PESERTA ===== ");
        for(int i = 0; i < banyakpeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].Nama);
        }
    }

    /* h.Fungsi countMahasiswa untuk menghitung banyaknya peserta Mahasiswa */
    public int countMahasiswa() {
        int count = 0;
        for(int i = 0; i < banyakpeserta; i++) {
            if(pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}