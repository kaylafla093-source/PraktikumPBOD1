/* Nama File    : Kendaraan.java
 * Deskipsi     : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 03 Maret 2026
 */

public class Kendaraan {
    /***************ATRIBUT***************/
    private String noPlat;
    private String jenis; //motor atau mobil

    /***************METHOD***************/
    //Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}