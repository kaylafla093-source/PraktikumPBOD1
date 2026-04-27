/* Nama File    : MainAnabul.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 22 April 2026
 */

public class MainAnabul {
    public static void main(String[] args) {
        System.out.println("III. POLIMORFISME UNIVERSAL INCLUSION");
        Anabul Kucing = new Kucing("Cici");
        Kucing.Gerak();
        Kucing.Bersuara();
        System.out.println();

        Anabul Anjing = new Anjing("Boni");
        Anjing.Gerak();
        Anjing.Bersuara();
        System.out.println();

        Anabul Burung = new Burung("Lobi");
        Burung.Gerak();
        Burung.Bersuara();
    }
}