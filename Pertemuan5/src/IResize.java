/* Nama File    : IResize.java
 * Deskipsi     : mendefinisikan method untuk resize suatu objek
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 17 Maret 2026
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih byesar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}

// Keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface 
// IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar adalah 
// bisa digunakan untuk class yang tidak berhubungan langsung dengan BangunDatar (tetap 
// dapat memiliki perilaku IResize). Jika method tersebut diletakkan dalam abstract 
// class BangunDatar, maka hanya subclass dari BangunDatar saja yang dapat memiliki 
// perilaku IResize.