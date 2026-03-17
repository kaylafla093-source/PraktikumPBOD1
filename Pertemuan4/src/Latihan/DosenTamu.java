/* Nama File    : DosenTamu.java
 * Deskipsi     : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

import java.time.*;
    public class DosenTamu extends Dosen {
        private String NIDK;
        private LocalDate akhir_kontrak;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok, String fakultas, LocalDate akhir_kontrak) {
        super(NIP, nama, tanggal_lahir, TMT_bekerja, gaji_pokok, fakultas);
        this.NIDK = NIDK;
        this.akhir_kontrak = akhir_kontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gaji_pokok;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggal_lahir);
        System.out.println("TMT: " + TMT_bekerja);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);

        System.out.println("Akhir Kontrak: " + formatTanggal(akhir_kontrak));
        System.out.println("Gaji Pokok: " + gaji_pokok);
        System.out.println("Tunjangan: 2.5% x Rp" + gaji_pokok + " = Rp " + hitungTunjangan());
    }
}