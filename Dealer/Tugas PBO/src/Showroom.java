// // Nama File : Showroom.java
// // Deskripsi : Kelas showroom untuk mengelola daftar kendaraan

// import java.util.ArrayList;

// public class Showroom {
//     // Atribut
//     private String namaShowroom;
//     private String kota;
//     private ArrayList<Kendaraan> daftarKendaraan;

//     // Method
//     public Showroom(String namaShowroom, String kota) throws InvalidDataException {
//         setNamaShowroom(namaShowroom);
//         setKota(kota);
//         daftarKendaraan = new ArrayList<>();
//     }

//     public String getNamaShowroom() {
//         return namaShowroom;
//     }

//     public String getKota() {
//         return kota;
//     }

//     public ArrayList<Kendaraan> getDaftarKendaraan() {
//         return daftarKendaraan;
//     }

//     private void setNamaShowroom(String namaShowroom) throws InvalidDataException {
//         if (namaShowroom == null || namaShowroom.trim().equals("")) {
//             throw new InvalidDataException("Nama showroom tidak boleh kosong");
//         }
//         this.namaShowroom = namaShowroom;
//     }

//     public void setKota(String kota) throws InvalidDataException {
//         if (kota == null || kota.trim().equals("")) {
//             throw new InvalidDataException("Kota showroom tidak boleh kosong");
//         }
//         this.kota = kota;
//     }

//     public void tambahKendaraan(Kendaraan kendaraan) {
//         assert kendaraan != null : "Kendaraan tidak boleh null";
//         daftarKendaraan.add(kendaraan);
//     }

//     public void hapusKendaraan(Kendaraan kendaraan) {
//         assert kendaraan != null : "Kendaraan tidak boleh null";
//         daftarKendaraan.remove(kendaraan);
//     }

//     public void tampilkanDaftarKendaraan() {
//         System.out.println("Nama Showroom: " + namaShowroom);
//         System.out.println("Kota         : " + kota);
//         System.out.println("Daftar Kendaraan:");
//         if (daftarKendaraan.isEmpty()) {
//             System.out.println("Belum ada kendaraan di showroom.");
//             return;
//         }

//         for (int i = 0; i < daftarKendaraan.size(); i++) {
//             Kendaraan kendaraan = daftarKendaraan.get(i);
//             System.out.println((i + 1) + ". " + kendaraan.getInfo());
//             System.out.println("   Harga Jual           : " + kendaraan.formatRupiah(kendaraan.hitungHargaJual()));
//             System.out
//                     .println("   Biaya Servis Dasar   : " + kendaraan.formatRupiah(kendaraan.hitungBiayaServisDasar()));
//         }
//     }

//     public int getJumlahKendaraan() {
//         return daftarKendaraan.size();
//     }
// }