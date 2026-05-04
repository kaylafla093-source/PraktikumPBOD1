package PBO08_24060124120004;

/* Nama File    : MainData.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 01 Mei 2026
 */

public class MainData {
    public static void main(String[] args) {
        /* 4. a) Aplikasi kelas Data */
        Data<String> dataString;
        dataString = new Data<>();

        dataString.setIsi(1, "Novel");
        dataString.setIsi(2, "Cerpen");
        dataString.setIsi(3, "Komik");
        dataString.setIsi(4, "Koran");

        for(int i = 1; i <= dataString.getSize(); i++) {
            System.out.println("Elemen ke-" + i + ": " + dataString.getIsi(i));
        }
        System.out.println();
        
        Data<Anabul> dataAnabul;
        dataAnabul = new Data<>();

        Anabul a1 = new Anggora("Milo", 3.5);
        Anabul a2 = new Kembangtelon("Flo", 2.8);
        Anabul a3 = new Anjing("Boni");
        Anabul a4 = new Burung("Tweety");
        Anabul a5 = new Kucing("Cati", 2.6);

        /* 4. b) Aplikasi prosedur setIsi */
        dataAnabul.setIsi(1, a1);
        dataAnabul.setIsi(2, a2);
        dataAnabul.setIsi(3, a3);
        dataAnabul.setIsi(4, a4);
        dataAnabul.setIsi(5, a5);

        for(int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul a = dataAnabul.getIsi(i); /* 4. c) Aplikasi fungsi getIsi */
            System.out.println("Anabul ke-" + i + ": " + a.Nama);
            a.Gerak();
            a.Bersuara();
            System.out.println();
        }

        /* 4. d) Aplikasi fungsi getSize */
        int jumlah = dataAnabul.getSize();
        System.out.println("Jumlah Anabul dalam data: " + jumlah);
    }
}