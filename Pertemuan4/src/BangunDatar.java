/* Nama File    : BangunDatar.java
 * Deskipsi     : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 10 Maret 2026
 */

public class BangunDatar {
// Saat final ditambahkan pada kelas BangunDatar, kelas 
// tersebut tidak bisa diwariskan, sehingga kelas
// Persegi dan Lingkaran tidak bisa menggunakan extends
// BangunDatar.

    // private int jmlSisi;
    // private String warna;
    // private String border;
    // private static int counterBangunDatar = 0;

    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    // public Persegi(double sisi, String warna, String border) {
    // this.jmlSisi = 4;
    // this.warna = warna;
    // this.border = border;
    // this.sisi = sisi;
    // }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

// Saat final ditambahkan pada method printInfo(). Method tersebut
// tidak dapat dioverride oleh kelas Persegi dan Lingkaran.
}