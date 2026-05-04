package PBO08_24060124120004;

/* Nama File    : Main.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

public class Main {
    public static void main(String[] args) {
        /* 2. Aplikasi kelas Generik menggunakan keluarga kelas Anabul */
        Anabul A;
        Datum<Anabul> Hewan;

        A = new Anjing("Chika");
        Hewan = new Datum<Anabul>(A);
        Hewan.getIsi().Gerak();
        Hewan.getIsi().Bersuara();
        System.out.println();

        A = new Kucing("Kitty", 8.3);
        Hewan = new Datum<Anabul>(A);
        Hewan.getIsi().Gerak();
        Hewan.getIsi().Bersuara();
        System.out.println();

        A = new Anggora("Hanny", 9.5);
        Hewan = new Datum<Anabul>(A);
        Hewan.getIsi().Gerak();
        Hewan.getIsi().Bersuara();
        System.out.println();

        A = new Kembangtelon("Flo", 6.9);
        Hewan = new Datum<Anabul>(A);
        Hewan.getIsi().Gerak();
        Hewan.getIsi().Bersuara();
        System.out.println();

        A = new Burung("Lobi");
        Hewan = new Datum<Anabul>(A);
        Hewan.getIsi().Gerak();
        Hewan.getIsi().Bersuara();
        System.out.println();
    }
}