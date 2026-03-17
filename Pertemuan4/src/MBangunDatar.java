/* Nama File    : MBangunDatar.java
 * Deskipsi     : berisi program utama untuk menjalankan dan menguji class BangunDatar
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 10 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi(4, "Kuning", "Hitam");

        Lingkaran l = new Lingkaran(8.0, "Merah", "Hijau");

        System.out.println("Persegi");
        p.printInfo();
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
        System.out.println("Diagonal: " + p.getDiagonal());

        System.out.println("Lingkaran");
        l.printInfo();
        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());

        BangunDatar b1 = new BangunDatar();
        BangunDatar b2 = new BangunDatar();

        b1.printCounterBangunDatar();

        p.printCounterBangunDatar();

        l.printCounterBangunDatar();

// Jika method printCounterBangunDatar dioverride, maka
// method pada kelas Persegi dan Lingkaran yang akan dijalankan,
// bukan method pada kelas BangunDatar. Tetapi, nilai yang ditampilkan 
// tetap jumlah seluruh objek BangunDatar karena masih menggunakan
// variabel counterBangunDatar yang sama. Jadi yang berubah hanya isi 
// pesan yang ditampilkan.
    }
}