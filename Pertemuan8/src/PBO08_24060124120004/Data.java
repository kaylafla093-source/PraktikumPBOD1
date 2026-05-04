package PBO08_24060124120004;

/* Nama File    : Data.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 01 Mei 2026
 */

/* 4. a) Kelas Data */
public class Data<Generik> {
    private Generik[] ruang;
    private int banyak;

    public Data() {
        ruang = (Generik[]) new Object[100];
        banyak = 0;
    }

    /* 4. b) Prosedur setIsi */
    public void setIsi(int i, Generik objek) {
        if(i < 1 || i > 100) {
            throw new IndexOutOfBoundsException("Indeks harus 1..100");
        }

        if(ruang[i - 1] == null) { // hanya bertambah jika sebelumnya kosong
            banyak++;
        }

        ruang [i - 1] = objek;
    }

    /* 4. c) Fungsi getIsi */
    public Generik getIsi(int i) { // i merujuk pada posisi ruang elemen
        if(i < 1 || i > 100) {
            throw new IndexOutOfBoundsException("Indeks harus 1..100");
        }
        return ruang[i-1];
    }

    /* 4. d) Fungsi getSize */
    public int getSize() {
        return banyak;
    }
}