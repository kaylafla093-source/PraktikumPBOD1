// // Nama File : Dealer.java
// // Deskripsi : Kelas dealer sebagai pengelola showroom

// public class Dealer {
//     // Atribut
//     private String idDealer;
//     private String namaDealer;
//     private String alamat;
//     private String noTelepon;
//     private Showroom showroom;

//     // Method
//     public Dealer(String idDealer, String namaDealer, String alamat, String noTelepon, Showroom showroom)
//             throws InvalidDataException {
//         setNamaDealer(namaDealer);
//         setAlamat(alamat);
//         setNoTelepon(noTelepon);
//         setShowroom(showroom);
//     }

//     public String getIdDealer() {
//         return idDealer;
//     }

//     public String getNamaDealer() {
//         return namaDealer;
//     }

//     public String getAlamat() {
//         return alamat;
//     }

//     public String getNoTelepon() {
//         return noTelepon;
//     }

//     public Showroom getShowroom() {
//         return showroom;
//     }

//     public void setNamaDealer(String namaDealer) throws InvalidDataException {
//         if (namaDealer == null || namaDealer.trim().equals("")) {
//             throw new InvalidDataException("Nama dealer tidak boleh kosong");
//         }
//         this.namaDealer = namaDealer;
//     }

//     public void setAlamat(String alamat) throws InvalidDataException {
//         if (alamat == null || alamat.trim().equals("")) {
//             throw new InvalidDataException("Alamat dealer tidak boleh kosong");
//         }
//         this.alamat = alamat;
//     }

//     public void setNoTelepon(String noTelepon) throws InvalidDataException {
//         if (noTelepon == null || noTelepon.trim().equals("")) {
//             throw new InvalidDataException("Nomor telepon dealer tidak boleh kosong");
//         }
//         this.noTelepon = noTelepon;
//     }

//     public void setShowroom(Showroom showroom) throws InvalidDataException {
//         if (showroom == null) {
//             throw new InvalidDataException("Showroom dealer tidak boleh null");
//         }
//         this.showroom = showroom;
//     }

//     public void tampilkanInfoDealer() {
//         System.out.println("=== Informasi Dealer ===");
//         System.out.println("ID Dealer      : " + idDealer);
//         System.out.println("Nama Dealer    : " + namaDealer);
//         System.out.println("Alamat         : " + alamat);
//         System.out.println("No Telepon     : " + noTelepon);
//         System.out.println("Nama Showroom  : " + showroom.getNamaShowroom());
//         System.out.println("Jumlah Kendaraan: " + getJumlahKendaraan());
//     }

//     public void tampilkanSemuaKendaraan() {
//         showroom.tampilkanDaftarKendaraan();
//     }

//     public void tambahKendaraan(Kendaraan kendaraan) {
//         showroom.tambahKendaraan(kendaraan);
//     }

//     public void hapusKendaraan(Kendaraan kendaraan) {
//         showroom.hapusKendaraan(kendaraan);
//     }

//     public int getJumlahKendaraan() {
//         return showroom.getJumlahKendaraan();
//     }
// }