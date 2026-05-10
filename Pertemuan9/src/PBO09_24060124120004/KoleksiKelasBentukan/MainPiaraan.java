package PBO09_24060124120004.KoleksiKelasBentukan;

/* Nama File    : MainPiaraan.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 10 Mei 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        Kucing k1 = new Kucing("Kitty", 3.5);
        Kucing k2 = new Kucing("Luna", 4.0);
        Kucing k3 = new Kucing("Lano", 3.7);
        Anjing j1 = new Anjing("Boni");
        Anjing j2 = new Anjing("Boli");
        Burung b1 = new Burung("Lova");
        Burung b2 = new Burung("Lani");

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(k3);
        p.enqueueAnabul(j1);
        p.enqueueAnabul(j2);
        p.enqueueAnabul(b1);
        p.enqueueAnabul(b2);
        
        p.showAnabul();

        System.out.println("\nJumlah anabul: " + p.getNbelm());
        System.out.println();

        System.out.println("Apakah Boli ada di antrean? " + p.isMember(j2));
        System.out.println("Apakah Kitty ada di antrean? " + p.isMember(k1));

        System.out.println("\nAnabul pertama: " + p.getAnabul().getNama());

        System.out.println("\nSebelum dequeue:");
        p.showAnabul();
        System.out.println();

        System.out.println("Keluar antrean: " + p.dequeueAnabul().getNama());

        System.out.println("\nSetelah dequeue:");
        p.showAnabul();

        System.out.println("\nJumlah kucing: " + p.countKucing());

        System.out.println("\nTotal bobot kucing: " + p.bobotKucing());
        System.out.println();

        p.showJenisAnabul();
    }

    /* Renungan: cara kerja konsep Koleksi:
       Konsep koleksi pada Java digunakan untuk menyimpan dan mengelola sekumpulan data 
       dalam satu wadah menggunakan ArrayList. Pada Class Teman, koleksi digunakan untuk 
       menyimpan data nama bertipe String, sedangkan pada Class Piaraan, koleksi digunakan 
       untuk menyimpan objek Anabul seperti Kucing, Anjing, dan Burung. Melalui koleksi, 
       data dapat ditambah (add/enqueue), dihapus (remove/dequeue), dicari (contains), 
       ditampilkan, dan dihitung dengan lebih mudah dan fleksibel. Selain itu, koleksi pada 
       Class Piaraan juga menunjukkan penerapan konsep Pemrograman Berorientasi Objek
       dan Polymorphism karena satu ArrayList<Anabul> dapat menyimpan berbagai objek turunan 
       dari kelas Anabul. */
}