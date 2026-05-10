// // Nama File : Motor.java
// // Deskripsi : Kelas turunan Kendaraan untuk jenis motor

// public class Motor extends Kendaraan {
//     // Atribut
//     private int ccMesin;

//     // Method
//     public Motor(String merk, int tahunProduksi, double harga, String warna, int ccMesin)
//             throws InvalidDataException {
//         super(merk, tahunProduksi, harga, warna);
//         setCcMesin(ccMesin);
//     }

//     public int getCcMesin() {
//         return ccMesin;
//     }

//     public void setCcMesin(int ccMesin) throws InvalidDataException {
//         if (ccMesin <= 0) {
//             throw new InvalidDataException("CC mesin motor harus lebih dari nol");
//         }
//         this.ccMesin = ccMesin;
//     }

//     @Override
//     public double hitungHargaJual() {
//         return getHarga() * 1.08;
//     }

//     @Override
//     public double hitungBiayaServisDasar() {
//         return 150000 + (ccMesin * 500);
//     }

//     public String getInfoMotor() {
//         return "Motor -> " + getInfo()
//                 + ", CC Mesin: " + ccMesin
//                 + ", Harga Jual: " + formatRupiah(hitungHargaJual());
//     }
// }