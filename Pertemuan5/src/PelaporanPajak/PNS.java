/* Nama File    : PNS.java
 * Deskipsi     : berisi atribut dan method dalam class PNS
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS() {
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor
    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public static void setCounterPNS(int counterPNS) {
        PNS.counterPNS = counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        int masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return masaKerja + 4; // A = 4
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}