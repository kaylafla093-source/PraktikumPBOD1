/* Nama File    : DosenTetap.java
 * Deskipsi     : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

import java.time.*;
import java.time.Period;
    public class DosenTetap extends Dosen {
        private String NIDN;
        private int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok, String fakultas) {
        super(NIP, nama, tanggal_lahir, TMT_bekerja, gaji_pokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.02 * masaKerja * gaji_pokok;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggal_lahir.plusYears(BUP);
        pensiun = pensiun.plusMonths(1).withDayOfMonth(1);
        return pensiun;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggal_lahir));
        System.out.println("TMT: " + formatTanggal(TMT_bekerja));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);

        Period masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan ");

        System.out.println("Tanggal Pensiun: " + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Gaji Pokok: Rp " + gaji_pokok);

        int tahun = masaKerja.getYears();
        System.out.println("Tunjangan: 2% x " + tahun + " x Rp " + gaji_pokok + " = Rp " + hitungTunjangan());
    }
}