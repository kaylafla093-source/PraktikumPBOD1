// // Nama File : Truk.java
// // Deskripsi : Kelas turunan Kendaraan untuk jenis truk

// public class Truk extends Kendaraan {
//     // Atribut
//     private double kapasitasMuatan;
//     private int jumlahRoda;

//     // Method
//     public Truk(String merk, int tahunProduksi, double harga, String warna, double kapasitasMuatan, int jumlahRoda)
//             throws InvalidDataException {
//         super(merk, tahunProduksi, harga, warna);
//         setKapasitasMuatan(kapasitasMuatan);
//         setJumlahRoda(jumlahRoda);
//     }

//     public double getKapasitasMuatan() {
//         return kapasitasMuatan;
//     }

//     public int getJumlahRoda() {
//         return jumlahRoda;
//     }

//     public void setKapasitasMuatan(double kapasitasMuatan) throws InvalidDataException {
//         if (kapasitasMuatan <= 0) {
//             throw new InvalidDataException("Kapasitas muatan truk harus lebih dari nol");
//         }
//         this.kapasitasMuatan = kapasitasMuatan;
//     }

//     public void setJumlahRoda(int jumlahRoda) throws InvalidDataException {
//         if (jumlahRoda <= 0) {
//             throw new InvalidDataException("Jumlah roda truk harus lebih dari nol");
//         }
//         this.jumlahRoda = jumlahRoda;
//     }

//     @Override
//     public double hitungHargaJual() {
//         return getHarga() * 1.15;
//     }

//     @Override
//     public double hitungBiayaServisDasar() {
//         return 800000 + (kapasitasMuatan * 50) + (jumlahRoda * 75000);
//     }

//     public String getInfoTruk() {
//         return "Truk -> " + getInfo()
//                 + ", Kapasitas Muatan: " + kapasitasMuatan + " kg"
//                 + ", Jumlah Roda: " + jumlahRoda
//                 + ", Harga Jual: " + formatRupiah(hitungHargaJual());
//     }

//     // Alias agar tetap konsisten dengan variasi istilah pada dokumentasi
//     public int getJumlahBan() {
//         return getJumlahRoda();
//     }

//     public void setJumlahBan(int jumlahBan) throws InvalidDataException {
//         setJumlahRoda(jumlahBan);
//     }
// }