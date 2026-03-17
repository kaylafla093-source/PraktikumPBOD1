/* Nama File    : MLatihan.java
 * Deskipsi     : berisi program utama untuk menjalankan dan menguji class DosenTetap
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

import java.time.*;
public class MLatihan {
    public static void main(String[] args) {
        DosenTetap d = new DosenTetap (
            "9545647548", 
            "78647324", 
            "Andi", 
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1), 
            5000000, 
            "Fakultas Sains dan Matematika"
        );

        d.printInfo();
    }   
}