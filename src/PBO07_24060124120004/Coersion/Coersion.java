package Coersion;
/* Nama File    : Coersion.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 21 April 2026
 */

public class Coersion {
    public static void main(String[] args) {
        System.out.println("I. POLIMORFISME AD HOC COERSION");
        /* 1. Suatu nilai dapat diubah formatnya menjadi jenis-jenis data yang berbeda.
              Contoh: Sebuah nilai integer 65
              - Saat ditampilkan sebagai integer, maka yang tampil tetap 65
              - Jika ditampilkan sebagai karakter, maka yang tampil adalah huruf 'A'
              - Jika ditampilkan sebagai real, maka akan tampil 65.0 */
        System.out.println("a.Program Java yang mengilustrasikan konsep polimorfisme (Coersion)");
        int a = 65;
        char b = (char) a;
        double c = (double) a;

        System.out.println("Integer: " + a);
        System.out.println("Karakter: " + "'" + b + "'");
        System.out.println("Double: " + c);
        System.out.println();

        System.out.println("b.Nilai integer yang sudah diubah menjadi real, dikembalikan ke format integer di dalam variabel berbeda");
        int d = (int) c;
        System.out.println("Double = 65.0");
        System.out.println("Integer: " + d);
        System.out.println();

        String X = "1234";
        String Y = "5678";
        System.out.println("c.String X = \"" + X + "\" String Y = \"" + Y + "\"");
        String S = X + Y;
        System.out.println("String S adalah hasil konkatenasi X dan Y");
        System.out.println("String S: \"" + S + "\"");
        
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        Integer Z = x + y;
        System.out.println("Integer Z adalah hasil penjumlahan angka X dan Y");
        System.out.println("Integer Z: " + Z);
        System.out.println();

        String P = "12.34";
        String Q = "56.78";
        System.out.println("d.String P = \"" + P + "\" String Q = \"" + Q + "\"");
        String R = P + Q;
        System.out.println("String R adalah hasil konkatenasi P dan Q");
        System.out.println("String R: \"" + R + "\"");

        double p = Double.parseDouble(P);
        double q = Double.parseDouble(Q);
        Double D = p + q;
        System.out.println("Double D adalah hasil penjumlahan angka P dan Q");
        System.out.println("Double D: " + D);
        System.out.println();

        System.out.println("e.Integer A diisi hasil konversi S");
        System.out.println("String S = \"" + 12345678 + "\"");
        Integer A = Integer.parseInt(S);
        System.out.println("Integer A: " + A);
        System.out.println();

        System.out.println("f.String T diisi hasil konversi nilai A");
        System.out.println("Integer A = 12345678");
        String T = A.toString();
        System.out.println("String T: \"" + T + "\"");
    }  
}