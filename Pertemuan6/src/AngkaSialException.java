/* Nama File    : AngkaSialException.java
 * Deskipsi     : eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 24 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}