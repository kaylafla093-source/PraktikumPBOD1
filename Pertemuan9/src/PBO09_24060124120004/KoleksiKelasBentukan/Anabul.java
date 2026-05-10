package PBO09_24060124120004.KoleksiKelasBentukan;

/* Nama File    : Anabul.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

public abstract class Anabul {
    /* 2. a) atribut panggilan */
    protected String panggilan;

    public Anabul() {

    }

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    /* 2. a) fungsi getNama */
    public String getNama() {
        return panggilan;
    }

    /* 2. a) prosedur setNama */
    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}