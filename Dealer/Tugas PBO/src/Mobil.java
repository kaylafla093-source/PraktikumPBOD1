// // Nama File : Mobil.java
// // Deskripsi : Kelas turunan Kendaraan untuk jenis mobil

// public class Mobil extends Kendaraan {
//     // Atribut
//     private int jumlahPintu;
//     private int kapasitasKursi;

//     // Method
//     public Mobil(String merk, int tahunProduksi, double harga, String warna, int jumlahPintu, int kapasitasKursi)
//             throws InvalidDataException {
//         super(merk, tahunProduksi, harga, warna);
//         setJumlahPintu(jumlahPintu);
//     }

//     public int getJumlahPintu() {
//         return jumlahPintu;
//     }

//     public int getKapasitasKursi() {
//         return kapasitasKursi;
//     }

//     public void setJumlahPintu(int jumlahPintu) throws InvalidDataException {
//         if (jumlahPintu <= 0) {
//             throw new InvalidDataException("Jumlah pintu mobil harus lebih dari nol");
//         }
//         this.jumlahPintu = jumlahPintu;
//     }

//     @Override
//     public double hitungHargaJual() {
//         return getHarga() * 1.12;
//     }

//     @Override
//     public double hitungBiayaServisDasar() {
//         return 500000 + (kapasitasKursi * 25000);
//     }

//     public String getInfoMobil() {
//         return "Mobil -> " + getInfo()
//                 + ", Jumlah Pintu: " + jumlahPintu
//                 + ", Kapasitas Kursi: " + kapasitasKursi
//                 + ", Harga Jual: " + formatRupiah(hitungHargaJual());
//     }
// }