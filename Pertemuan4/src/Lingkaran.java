/* Nama File    : Lingkaran.java
 * Deskipsi     : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 10 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        this.jari = 0.0;
    }

    // public Lingkaran(double diameter, String warna, String border) {
    //     this.jari = diameter / 2;
    //     setWarna(warna);
    //     setBorder(border);
    // }

    public Lingkaran(double diameter, String warna, String border) {
        super(4, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public void printInfo() {
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + jari);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar dari kelas Lingkaran: " + counterBangunDatar);
    }
}