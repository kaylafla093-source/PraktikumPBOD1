/* Nama File    : MBangunDatar.java
 * Deskipsi     : berisi program utama untuk menjalankan dan menguji class BangunDatar
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 17 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); 
        // Karena BangunDatar adalah abstract class, maka tidak dapat diinstansiasi langsung.

        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);

        // Lingkaran L1 = new Lingkaran(14);
        // Variabel L1 sudah dideklarasikan sebelumnya, sehingga menyebabkan error.

        Lingkaran L2 = new Lingkaran(6);

        System.out.println("========== Persegi ==========");
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());

        System.out.println("========== Lingkaran ==========");
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());

        System.out.println("Apakah Luas P1 = P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah Luas P1 = L1? " + P1.isEqualLuas(L1));

        System.out.println("Apakah Keliling L1 = L2? " + L1.isEqualKeliling(L2));
        System.out.println("Apakah Luas P2 = L2? " + P2.isEqualLuas(L2)); 
        // Method isEqualLuas dan isEqualKeliling dapat digunakan untuk membandingkan
        // objek bangun datar yang berbeda karena parameter dari method tersebut adalah 
        // BangunDatar, dimana Persegi dan Lingkaran merupakan subclass BangunDatar.

        BangunDatar B = new Lingkaran(5);
        System.out.println("Luas: " + B.getLuas());
        System.out.println("Apakah Luas B = L1?: " + B.isEqualLuas(L1));
        
        System.out.println("Luas awal: " + P1.getLuas());
        ((IResize) P1).zoomIn();
        System.out.println("Luas setelah zoom in: " + P1.getLuas());

        System.out.println("Luas awal: " + L2.getKeliling());
        ((IResize) L2).zoomOut();
        System.out.println("Luas setelah zoom out: " + L2.getKeliling());

        System.out.println("Luas awal: " + P2.getLuas());
        ((IResize) P2). zoom(10);
        System.out.println("Luas setelah zoom: " + P2.getLuas());
    }
}