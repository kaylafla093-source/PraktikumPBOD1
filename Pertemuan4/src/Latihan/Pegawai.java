/* Nama File    : Pegawai.java
 * Deskipsi     : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

import java.time.*;
    public class Pegawai {
        protected String NIP;
        protected String nama;
        protected LocalDate tanggal_lahir;
        protected LocalDate TMT_bekerja;
        protected double gaji_pokok;
        
    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT_bekerja = TMT_bekerja;
        this.gaji_pokok = gaji_pokok;
    }

    public Period hitungMasaKerja() {
        LocalDate sekarang = LocalDate.of(2025, 3, 10);
        return Period.between(TMT_bekerja, sekarang);
    }

    public String formatTanggal(LocalDate t) {
        String[] bulan = 
                {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        return t.getDayOfMonth() + " " + 
        bulan[t.getMonthValue() - 1] + " " + 
        t.getYear();
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggal_lahir));
        System.out.println("TMT: " + formatTanggal(TMT_bekerja));
    }
}