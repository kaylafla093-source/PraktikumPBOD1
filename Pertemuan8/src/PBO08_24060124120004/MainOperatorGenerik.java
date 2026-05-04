package PBO08_24060124120004;

/* Nama File    : MainOperatorGenerik.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 04 Mei 2026
 */

public class MainOperatorGenerik {
    /* 3. b) Aplikasi Prosedur Generik Tukar */
    public static void main(String[] args) {
        /* Tukar Integer */
        OperatorGenerik<Integer> opInt = new OperatorGenerik<>();

        Datum<Integer> a = new Datum<Integer>(3);
        Datum<Integer> b = new Datum<Integer>(6);

        System.out.println("===== INTEGER =====");
        System.out.println("Sebelum Tukar:");
        System.out.println("a = " + a.getIsi() + ", b = " + b.getIsi());

        opInt.Tukar(a, b);

        System.out.println("Sesudah Tukar:");
        System.out.println("a = " + a.getIsi() + ", b = " + b.getIsi());

        //* Tukar String */
        OperatorGenerik<String> opStr = new OperatorGenerik<>();

        Datum<String> s1 = new Datum<String>("Novel");
        Datum<String> s2 = new Datum<String>("Cerpen");

        System.out.println("\n===== STRING ======");
        System.out.println("Sebelum Tukar:");
        System.out.println("s1 = " + s1.getIsi() + ", s2 = " + s2.getIsi());

        opStr.Tukar(s1, s2);

        System.out.println("Sesudah Tukar:");
        System.out.println("s1 = " + s1.getIsi() + ", s2 = " + s2.getIsi());

        /* Tukar Anabul */
        OperatorGenerik<Anabul> opAnabul = new OperatorGenerik<>();

        Datum<Anabul> d1 = new Datum<Anabul>(new Anjing("Doggy"));
        Datum<Anabul> d2 = new Datum<Anabul>(new Kucing("Kitty", 4.5));

        System.out.println("\n===== ANABUL =====");
        System.out.println("Sebelum Tukar:");
        System.out.println("d1 = " + d1.getIsi());
        System.out.println("d2 = " + d2.getIsi());

        opAnabul.Tukar(d1, d2);

        System.out.println("Sesudah Tukar:");
        System.out.println("d1 = " + d1.getIsi());
        System.out.println("d2 = " + d2.getIsi());

        /* 3. c) Aplikasi fungsi generik Bobot2 */
        System.out.println("\n===== BOBOT KUCING =====");

        Kucing k1 = new Kucing("Kitty", 4.5);
        Kucing k2 = new Kucing("Milo", 3.2);

        OperatorGenerik<Kucing> opKucing = new OperatorGenerik<>();

        double totalBobot = opKucing.Bobot2(k1, k2);

        System.out.println("Bobot k1 = " + k1.getBobot());
        System.out.println("Bobot k2 = " + k2.getBobot());
        System.out.println("Total Bobot = " + totalBobot);
    }
}