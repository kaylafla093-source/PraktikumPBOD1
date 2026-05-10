// // Nama File : Main.java
// // Deskripsi : Kelas main untuk simulasi sistem dealer kendaraan

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Showroom showroom = new Showroom("Showroom Utama", "Semarang");
//             Dealer dealer = new Dealer(
//                     "DLR-001",
//                     "Dealer Maju Jaya",
//                     "Jl. Pahlawan No. 10",
//                     "081234567890",
//                     showroom);

//             Mobil mobil = new Mobil("Toyota Avanza", 2022, 250000000, "Hitam", 4, 7);
//             Motor motor = new Motor("Honda Vario", 2023, 23000000, "Merah", 160);
//             Truk truk = new Truk("Mitsubishi Fuso", 2021, 450000000, "Kuning", 8000, 6);
//             Bus bus = new Bus("Mercedes Benz", 2020, 1200000000, "Putih", 45, 6);

//             dealer.tambahKendaraan(mobil);
//             dealer.tambahKendaraan(motor);
//             dealer.tambahKendaraan(truk);
//             dealer.tambahKendaraan(bus);

//             dealer.tampilkanInfoDealer();
//             System.out.println();
//             dealer.tampilkanSemuaKendaraan();

//             System.out.println("\n=== Simulasi Servis ===");
//             Servis servisMobil = new Servis(
//                     "SRV-001",
//                     "31-03-2026",
//                     "Ganti oli dan pengecekan umum",
//                     300000,
//                     mobil);
//             servisMobil.tampilkanInfoServis();
//             System.out.println("Total biaya servis standar : " + mobil.formatRupiah(servisMobil.hitungBiayaServis()));
//             System.out.println(
//                     "Total biaya servis tambahan: " + mobil.formatRupiah(servisMobil.hitungBiayaServis(150000)));
//             servisMobil.prosesServis();

//             System.out.println("\n=== Uji Exception ===");
//             try {
//                 Motor motorSalah = new Motor("Motor Salah", 2024, -1000, "Biru", 150);
//                 System.out.println(motorSalah.getInfoMotor());
//             } catch (InvalidDataException e) {
//                 System.out.println("Terjadi kesalahan data: " + e.getMessage());
//             }
//         } catch (InvalidDataException e) {
//             System.out.println("Program gagal dijalankan: " + e.getMessage());        }
//     }
// }