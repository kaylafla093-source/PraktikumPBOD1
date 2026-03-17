/* Nama File    : Mahasiswa.java
 * Deskipsi     : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 03 Maret 2026
 */

import java.util.ArrayList;
public class Mahasiswa {
    /***************ATRIBUT***************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/
    //Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(); //Inisialisasi ArrayList kosong
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
    int totalSKS = 0;
    for(int i = 0; i < listMatkul.size(); i++) {
        totalSKS = totalSKS + listMatkul.get(i).getSks();
    }
    return totalSKS;
    }

    public int getJumlahMatkul() {
    return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

        System.out.println("Daftar mata kuliah yang diambil: ");
        int i;
        for(i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }

        System.out.println("Dosen Wali: " + dosenWali.getNIP());
        System.out.println("Nama Dosen: " + dosenWali.getNama());
        System.out.println("Prodi Dosen: " + dosenWali.getProdi());

        System.out.println("No plat kendaraan: " + kendaraan.getNoPlat());
        System.out.println("Jenis kendaraan: " + kendaraan.getJenis());
    }
}