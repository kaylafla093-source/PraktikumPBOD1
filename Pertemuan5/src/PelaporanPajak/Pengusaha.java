/* Nama File    : Pengusaha.java
 * Deskipsi     : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha() {
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor
    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Mutator
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static void setCounterPengusaha(int counterPengusaha) {
        Pengusaha.counterPengusaha = counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        int masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return masaKerja; // B = 0;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}