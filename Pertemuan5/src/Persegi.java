/* Nama File    : Persegi.java
 * Deskipsi     : berisi atribut dan method dalam class Persegi
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 17 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public Persegi() {
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String warna, String border) {
    //     this.sisi = sisi;
    //     setWarna(warna);
    //     setBorder(border);
    //     setJmlSisi(4);
    // }

    public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    // public Persegi(double sisi, String warna, String border) {
    //     super(4, warna, border);
    //     this.sisi = sisi;
    // }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // @Override
    // public void printInfo() {
    //     System.out.println("Jumlah sisi: " + getJmlSisi());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Sisi: " + sisi);
    // }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar dari kelas Persegi: " + counterBangunDatar);
    }
}