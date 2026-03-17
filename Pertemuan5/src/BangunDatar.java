/* Nama File    : BangunDatar.java
 * Deskipsi     : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 17 Maret 2026
 */

public abstract class BangunDatar {
    // Jika BangunDatar tidak dijadikan abstract class, method
    // isEqualLuas() dan isEqualKeliling() bisa dibuat, tetapi dengan syarat
    // class BangunDatar memiliki method getLuas() dan getKeliling().
    // Tetapi hal tersebut tidak disarankan, karena BangunDatar tidak spesifik
    // jenisnya, sehingga jika method getLuas dan getKeliling dijalankan, hasilnya
    // tidak valid (bernilai 0). dan Output dari method isEqualLuas() maupun 
    // isEqualKeliling() menjadi salah.

    // Kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada 
    // non-abstract class :
    // - Mencegah objek tidak valid
    //   Karena tidak bisa dibuat objek langsung
    //   BangunDatar D1 = new BangunDatar(); (salah) 
    //   BangunDatar D1 = new Lingkaran(5); (benar)
    //   Kelas abstrak tidak dapat diinstansiasi.
    // - Memaksa subclass implementasi method
    //   public abstract double getLuas();
    //   public abstract double getKeliling();
    //   Subclass BangunDatar harus mengisi method tersebut.

    public abstract double getLuas();
    public abstract double getKeliling();

    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    // public Persegi(double sisi, String warna, String border) {
    // this.jmlSisi = 4;
    // this.warna = warna;
    // this.border = border;
    // this.sisi = sisi;
    // }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // public double getLuas() {
    //     return 0.0;
    // }

    // public double getKeliling() {
    //     return 0.0;
    // }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}