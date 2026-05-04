package PBO08_24060124120004;

/* Nama File    : OperatorGenerik.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 04 Mei 2026
 */

/* 3. a) Prosedur generik Tukar */
public class OperatorGenerik<G> {
    public void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    /* 3. c) Fungsi generik Bobot2 yang menerima masukan dua objek keturunan
    kucing lalu mengembalikan jumlah bobot keduanya! */
    public double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }

    /* Cara kerja konsep Generik:
    Konsep generik memungkinkan kita membuat kelas atau metode yang tidak bergantung pada satu 
    tipe data tertentu, sehingga bisa digunakan untuk berbagai tipe seperti integer, string, maupun objek. 
    Tipe data ditentukan saat pemakaian, bukan saat penulisan kode. Dengan cara tersebut, program menjadi lebih fleksibel */
}