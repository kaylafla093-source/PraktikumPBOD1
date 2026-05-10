// // Nama File : Servis.java
// // Deskripsi : Kelas servis untuk mencatat proses servis kendaraan

// public class Servis {
//     // Atribut
//     private String idServis;
//     private String tanggalServis;
//     private String deskripsiServis;
//     private double biayaDasar;
//     private Kendaraan kendaraan;

//     // Method
//     public Servis(String idServis, String tanggalServis, String deskripsiServis, double biayaDasar, Kendaraan kendaraan)
//             throws InvalidDataException {
//         setIdServis(idServis);
//         setTanggalServis(tanggalServis);
//         setDeskripsiServis(deskripsiServis);
//         setBiayaDasar(biayaDasar);
//         if (kendaraan == null) {
//             throw new InvalidDataException("Kendaraan servis tidak boleh null");
//         }
//         setKendaraan(kendaraan);
//     }

//     public String getIdServis() {
//         return idServis;
//     }

//     public String getTanggalServis() {
//         return tanggalServis;
//     }

//     public String getDeskripsiServis() {
//         return deskripsiServis;
//     }

//     public double getBiayaDasar() {
//         return biayaDasar;
//     }

//     public Kendaraan getKendaraan() {
//         return kendaraan;
//     }

//     public void setIdServis(String idServis) throws InvalidDataException {
//         if (idServis == null || idServis.trim().equals("")) {
//             throw new InvalidDataException("ID servis tidak boleh kosong");
//         }
//         this.idServis = idServis;
//     }

//     public void setTanggalServis(String tanggalServis) throws InvalidDataException {
//         if (tanggalServis == null || tanggalServis.trim().equals("")) {
//             throw new InvalidDataException("Tanggal servis tidak boleh kosong");
//         }
//         this.tanggalServis = tanggalServis;
//     }

//     public void setDeskripsiServis(String deskripsiServis) throws InvalidDataException {
//         if (deskripsiServis == null || deskripsiServis.trim().equals("")) {
//             throw new InvalidDataException("Deskripsi servis tidak boleh kosong");
//         }
//         this.deskripsiServis = deskripsiServis;
//     }

//     public void setBiayaDasar(double biayaDasar) throws InvalidDataException {
//         if (biayaDasar < 0) {
//             throw new InvalidDataException("Biaya dasar servis tidak boleh negatif");
//         }
//         this.biayaDasar = biayaDasar;
//     }

//     public void setKendaraan(Kendaraan kendaraan) {
//         if (kendaraan == null) {
//             throw new IllegalArgumentException("Kendaraan servis tidak boleh null");
//         }
//         this.kendaraan = kendaraan;
//     }

//     public double hitungBiayaServis() {
//         double totalBiaya = biayaDasar + kendaraan.hitungBiayaServisDasar();
//         assert totalBiaya >= biayaDasar : "Total biaya servis tidak valid";
//         return totalBiaya;
//     }

//     public double hitungBiayaServis(double tambahanBiaya) throws InvalidDataException {
//         if (tambahanBiaya < 0) {
//             throw new InvalidDataException("Tambahan biaya servis tidak boleh negatif");
//         }
//         double totalBiaya = hitungBiayaServis() + tambahanBiaya;
//         assert totalBiaya >= hitungBiayaServis() : "Total biaya servis tambahan tidak valid";
//         return totalBiaya;
//     }

//     public void tampilkanInfoServis() {
//         System.out.println("ID Servis      : " + idServis);
//         System.out.println("Tanggal Servis : " + tanggalServis);
//         System.out.println("Deskripsi      : " + deskripsiServis);
//         System.out.println("Biaya Dasar    : " + kendaraan.formatRupiah(biayaDasar));
//         System.out.println("Kendaraan      : " + kendaraan.getMerk());
//     }

//     public void prosesServis() {
//         assert kendaraan != null : "Kendaraan harus tersedia sebelum proses servis";
//         System.out.println("Servis untuk kendaraan " + kendaraan.getMerk() + " sedang diproses.");
//         System.out.println("Perkiraan total biaya: " + kendaraan.formatRupiah(hitungBiayaServis()));
//     }
// }