package PBO09_24060124120004.KoleksiKelasDasar;

/* Nama File    : MainTeman.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 5 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Kayla");
        t.addNama("Rana");
        t.addNama("Laura");
        t.addNama("Gaby");
        t.addNama("Adel");

        System.out.println("\nMenampilkan semua teman");
        t.showTeman();

        System.out.println("\nJumlah teman: " + t.getNbelm());

        System.out.println("\nNama indeks 2: " + t.getNama(2));

        System.out.println("\nSebelum setNama:");
        t.showTeman();

        t.setNama(1, "Fla");

        System.out.println("\nSesudah setNama:");
        t.showTeman();

        System.out.println("\nSebelum delNama:");
        t.showTeman();

        t.delNama("Adel");

        System.out.println("\nSesudah delNama (Adel):");
        t.showTeman();

        System.out.println("\nApakah Fla ada?" + t.isMember("Fla"));

        System.out.println("\nSebelum gantiNama:");
        t.showTeman();

        t.gantiNama("Fla", "Ayu");

        System.out.println("\nSesudah gantiNama");
        t.showTeman();
        System.out.println();

        System.out.println("Jumlah nama Laura: " + t.countNama("Laura"));
    }
}