/* Nama File    : MTitik.java
 * Deskipsi     : berisi atribut dan method dalam class Titik
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 24 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T4 = new Titik(); //Membuat objek titik T4 (0,0)
        Titik T5 = new Titik(3,5); //Membuat objek titik T5 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T5.getCounterTitik());

        System.out.println(T1.getKuadran());

        System.out.println(T1.getJarakPusat());

        Titik T3 = new Titik(); 
        T3.setAbsis(5); 
        T3.setOrdinat(6); 
        System.out.println(T1.getJarak(T3));

        T1.refleksiX();
        T1.printTitik();

        T3.refleksiY();
        T3.printTitik();

        Titik hasilT3 = T3.getRefleksiX();
        hasilT3.printTitik();

        Titik hasilT1 = T1.getRefleksiY();
        hasilT1.printTitik();
    }
}