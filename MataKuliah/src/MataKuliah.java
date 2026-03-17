public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    //Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor
    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    //Mutator
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}