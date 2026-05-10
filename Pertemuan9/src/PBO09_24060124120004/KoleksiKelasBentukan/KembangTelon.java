package PBO09_24060124120004.KoleksiKelasBentukan;

/* Nama File    : Kembangtelon.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

public class KembangTelon {
    public class Kembangtelon extends Kucing {
        public Kembangtelon(String panggilan, double bobot) {
            super(panggilan, bobot);
        }

        @Override
        public void Gerak() {
            System.out.println(panggilan + " (Kembangtelon) Gerak: Melata");
        }

        @Override
        public void Bersuara() {
            System.out.println(panggilan + " (Kembangtelon) Bersuara: Meong");
        }
    }  
}