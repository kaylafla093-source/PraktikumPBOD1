// // Nama File : Kendaraan.java
// // Deskripsi : Kelas abstrak dasar untuk seluruh kendaraan

// import java.text.DecimalFormat;
// import java.text.DecimalFormatSymbols;
// import java.util.Locale;

// public abstract class Kendaraan implements Serviceable {
//     // Atribut
//     private String merk;
//     private int tahunProduksi;
//     private double harga;
//     private String warna;
//     private static final Locale LOCALE_ID = new Locale("id", "ID");

//     // Method
//     public Kendaraan(String merk, int tahunProduksi, double harga, String warna) throws InvalidDataException {
//         setHarga(harga);
//         setWarna(warna);
//     }

//     public String getMerk() {
//         return merk;
//     }

//     public int getTahunProduksi() {
//         return tahunProduksi;
//     }

//     public double getHarga() {
//         return harga;
//     }

//     public String getWarna() {
//         return warna;
//     }

//     public void setHarga(double harga) throws InvalidDataException {
//         if (harga < 0) {
//             throw new InvalidDataException("Harga kendaraan tidak boleh negatif");
//         }
//         this.harga = harga;
//     }

//     public void setWarna(String warna) throws InvalidDataException {
//         if (warna == null || warna.trim().equals("")) {
//             throw new InvalidDataException("Warna kendaraan tidak boleh kosong");
//         }
//         this.warna = warna;
//     }

//     public String getInfo() {
//         return "Merk: " + merk
//                 + ", Tahun Produksi: " + tahunProduksi
//                 + ", Harga Dasar: " + formatRupiah(harga)
//                 + ", Warna: " + warna;
//     }

//     protected String formatRupiah(double nominal) {
//         DecimalFormatSymbols simbol = new DecimalFormatSymbols(LOCALE_ID);
//         simbol.setGroupingSeparator('.');
//         simbol.setDecimalSeparator(',');
//         DecimalFormat format = new DecimalFormat("#,##0.00", simbol);
//         return "Rp " + format.format(nominal);
//     }

//     public abstract double hitungHargaJual();
// }