/* Nama File    : Tendik.java
 * Deskipsi     : berisi atribut dan method dalam class Tendik
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

import java.time.*;
    public class Tendik extends Pegawai {
        private String bidang;
        private int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok, String bidang) {
        super(NIP, nama, tanggal_lahir, TMT_bekerja, gaji_pokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.01 * masaKerja * gaji_pokok;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = tanggal_lahir.plusYears(BUP);
        pensiun = pensiun.plusMonths(1).withDayOfMonth(1);
        return pensiun;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggal_lahir);
        System.out.println("TMT: " + TMT_bekerja);
        System.out.println("Gaji Pokok: Rp " + gaji_pokok);
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);

        Period masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan ");

        System.out.println("Tanggal Pensiun: " + formatTanggal(hitungTanggalPensiun()));

        int tahun = masaKerja.getYears();
        System.out.println("Tunjangan: 1% x " + tahun + " x Rp " + gaji_pokok + " = Rp " + hitungTunjangan());
    }
}