/* Nama File    : Dosen.java
 * Deskipsi     : berisi atribut dan method dalam class Dosen
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 03 Maret 2026
 */

class Dosen {
    /***************ATRIBUT***************/
    private String nip;
    private String nama;
    private String prodi;

    /***************METHOD***************/
    //Konstruktor tanpa parameter
    public Dosen() {
        this.nip =  "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}