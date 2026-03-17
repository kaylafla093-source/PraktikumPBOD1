import java.util.ArrayList;

public class Mahasiswa {
    /***************ATRIBUT***************/
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/

    //konstruktor untuk membuat mahasiswa tanpa parameter
    // public Mahasiswa() {
    //     this.listMatkul = new ArrayList<> (); // Inisialisai ArrayList kosong
    // }
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.dosenWali = null;
        
    }

    //konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    //Mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void printDetailMhs () {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i = 0; i < ListMatkul.size (); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }
    
}