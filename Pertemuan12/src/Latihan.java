/*
 * File         : Latihan.java
 * Deskripsi    : Implementasi ekspresi lambda pada Map untuk menampilkan
                  key berupa NIM dan value berupa nama mahasiswa
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 29 Mei 2026
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Latihan {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new LinkedHashMap<>();

        mahasiswa.put("23111001", "Kayla");
        mahasiswa.put("23111002", "Febrina");
        mahasiswa.put("23111003", "Laura");
        mahasiswa.put("23111004", "Ayu");

        // Menampilkan key dan value menggunakan lambda
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}