package Overloading;
/* Nama File    : Mahasiswa.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 21 April 2026
 */

/* II. POLIMORFISME AD HOC OVERLOADING
   2. Class Mahasiswa
      Atribut: NIM, Nama, Programstudi
      Operator: setProgramStudi(tanpa parameter) -> berisi string "Kosong"
                setProgramStudi(satu parameter string) -> berisi sesuai isian input
                setProgramStudi(satu parameter objek Mahasiswa lain) -> berisi sama dengan komponen Programstudi objek masukan */
    /* a.Realisasi kelas Mahasiswa */
public class Mahasiswa {
    // Atribut
    String NIM;
    String Nama;
    String Programstudi;

    // Method
    /* c.Realisasi konstruktor Mahasiswa tanpa parameter yang menghasilkan objek
    dengan default NIM = -999, Nama = "n/a", Programstudi = "n/a" */
    Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    /* d.Realisasi konstruktor Mahasiswa dengan tiga buah parameter yang menghasilkan objek
    dengan nilai-nilai komponen sesuai parameter input */
    Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    /* e.Realisasi konstruktor Mahasiswa dengan satu parameter objek Mahasiswa lain,
    yang menghasilkan objek hasil 'kloning' objek Mahasiswa input */
    Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    void setProgramstudi() { // Tanpa parameter
        this.Programstudi = "Kosong";
    }

    void setProgramstudi(String prodi) { // Satu parameter string
        this.Programstudi = prodi;
    }

    void setProgramstudi(Mahasiswa m) { // Satu parameter objek Mahasiswa lain
        this.Programstudi = m.Programstudi;
    }

    void displayInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + Programstudi);
        System.out.println("\n");
    }
}