/* Nama File    : MainOverloading.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 21 April 2026
 */

public class MainOverloading {
    public static void main(String[] args) {
    System.out.println("II. POLIMORFISME AD HOC OVERLOADING");
        /* c.Aplikasi konstruktor Mahasiswa tanpa parameter yang menghasilkan objek
        dengan default NIM = -999, Nama = "n/a", Programstudi = "n/a" */
        Mahasiswa m1 = new Mahasiswa();
        m1.displayInfo();

        /* d.Aplikasi konstruktor Mahasiswa dengan tiga buah parameter yang menghasilkan objek
        dengan nilai-nilai komponen sesuai parameter input */
        Mahasiswa m2 = new Mahasiswa("0081", "Zeevanya", "Manajemen Informatika");
        m2.displayInfo();

        /* e.Aplikasi konstruktor Mahasiswa dengan satu parameter objek Mahasiswa lain,
        yang menghasilkan objek hasil 'kloning' objek Mahasiswa input */
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.displayInfo();

        /* b.Contoh aplikasi semua varian operator kelas Mahasiswa */
        System.out.println(" ===== Overloading Method ===== ");
        m1.setProgramstudi(); // Tanpa parameter
        m1.displayInfo();

        m2.setProgramstudi("Manajemen Informatika"); // Satu parameter string
        m2.displayInfo();

        m3.setProgramstudi(m2); // Satu parameter objek Mahasiswa lain
        m3.displayInfo();
    }
}