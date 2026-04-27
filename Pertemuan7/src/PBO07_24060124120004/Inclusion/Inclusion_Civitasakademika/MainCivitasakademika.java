package Inclusion.Inclusion_Civitasakademika;
/* Nama File    : MainCivitasakademika.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

public class MainCivitasakademika {
    public static void main(String[] args) {
        System.out.println("III. POLIMORFISME UNIVERSAL INCLUSION");
        /* b.Aplikator kelas Seminar */
        Seminar s = new Seminar();

        /* e.2 objek Dosen dan 5 objek Mahasiswa */
        // Objek Dosen 
        Dosen d1 = new Dosen("Kayla", "D0046");
        Dosen d2 = new Dosen("Danis", "D0083");

        // Objek Mahasiswa 
        Mahasiswa m1 = new Mahasiswa("Lauria", "M0034", d1);
        Mahasiswa m2 = new Mahasiswa("Dinda", "M0017", d2);
        Mahasiswa m3 = new Mahasiswa("Flo", "M0056", d1);
        Mahasiswa m4 = new Mahasiswa("Ardhi", "M0158", d2);
        Mahasiswa m5 = new Mahasiswa("Dara", "M0105", d1);

        /* f.Uji prosedur registrasi dengan tujuh objek peserta */
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        /* g.tampilPeserta */
        s.tampilPeserta();
        System.out.println();

        /* c.countPeserta */
        System.out.println("Jumlah peserta: " + s.countPeserta());
        System.out.println(); 

        /* h.countMahasiswa */
        System.out.println("Jumlah peserta Mahasiswa: " + s.countMahasiswa());
        System.out.println();

        /* i.setWali */
        m1.setWali(d2);

        /* j.tampilDataMahasiswa */
        System.out.println(" ===== Data Mahasiswa ===== ");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
        System.out.println();
    }
}

/* RENUNGAN: Cara Kerja Polimorfisme
   Polimorfisme bekerja dengan memungkinkan satu operasi/metode digunakan dalam berbagai bentuk, 
   lalu program akan menentukan sendiri perilaku yang sesuai berdasarkan konteksnya. 
   Pada coercion, nilai dapat diubah ke tipe lain agar bisa diproses. 
   Pada overloading, metode yang sama memiliki beberapa versi dan dipilih berdasarkan parameter saat kompilasi. 
   Sedangkan pada inclusion, objek dari kelas turunan dapat diperlakukan sebagai kelas induk, 
   namun saat dijalankan tetap menggunakan perilaku sesuai objek aslinya. Dengan cara ini, 
   satu perintah yang sama bisa menghasilkan tindakan yang berbeda tanpa perlu membuat banyak metode yang berbeda. */