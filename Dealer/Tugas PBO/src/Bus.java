// // Nama File : Bus.java
// // Deskripsi : Kelas turunan Kendaraan untuk jenis bus

// public class Bus extends Kendaraan {
//     // Atribut
//     private int kapasitasPenumpang;
//     private int jumlahRoda;

//     // Method
//     public Bus(String merk, int tahunProduksi, double harga, String warna, int kapasitasPenumpang, int jumlahRoda)
//             throws InvalidDataException {
//         super(merk, tahunProduksi, harga, warna);
//         setKapasitasPenumpang(kapasitasPenumpang);
//         setJumlahRoda(jumlahRoda);
//     }

//     public int getKapasitasPenumpang() {
//         return kapasitasPenumpang;
//     }

//     public int getJumlahRoda() {
//         return jumlahRoda;
//     }

//     public void setKapasitasPenumpang(int kapasitasPenumpang) throws InvalidDataException {
//         if (kapasitasPenumpang <= 0) {
//             throw new InvalidDataException("Kapasitas penumpang bus harus lebih dari nol");
//         }
//         this.kapasitasPenumpang = kapasitasPenumpang;
//     }

//     public void setJumlahRoda(int jumlahRoda) throws InvalidDataException {
//         if (jumlahRoda <= 0) {
//             throw new InvalidDataException("Jumlah roda bus harus lebih dari nol");
//         }
//         this.jumlahRoda = jumlahRoda;
//     }

//     @Override
//     public double hitungHargaJual() {
//         return getHarga() * 1.18;
//     }

//     @Override
//     public double hitungBiayaServisDasar() {
//         return 700000 + (kapasitasPenumpang * 10000) + (jumlahRoda * 50000);
//     }

//     public String getInfoBus() {
//         return "Bus -> " + getInfo()
//                 + ", Kapasitas Penumpang: " + kapasitasPenumpang
//                 + ", Jumlah Roda: " + jumlahRoda
//                 + ", Harga Jual: " + formatRupiah(hitungHargaJual());
//     }
// }