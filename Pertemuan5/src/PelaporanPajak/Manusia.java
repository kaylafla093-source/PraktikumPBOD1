/* Nama File    : Manusia.java
 * Deskipsi     : berisi atribut dan method dalam class Manusia
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = null;
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor
    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void pendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static void setCounterMns(int counterMns) {
        Manusia.counterMns = counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tgl Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    // abstract method
    public abstract int hitungMasaKerja();

}