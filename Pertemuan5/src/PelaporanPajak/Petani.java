/* Nama File    : Petani.java
 * Deskipsi     : berisi atribut dan method dalam class Petani
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor
    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // Mutator
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static void setCounterPetani(int counterPetani) {
        Petani.counterPetani = counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        int masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return masaKerja; // C = 0;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}