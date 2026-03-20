/* Nama File    : Dosen.java
 * Deskipsi     : berisi atribut dan method dalam class Dosen
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

    public class Dosen extends Pegawai {
        protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok, String fakultas) {
        super(NIP, nama, tanggal_lahir, TMT_bekerja, gaji_pokok); 
        this.fakultas = fakultas;
    }
}