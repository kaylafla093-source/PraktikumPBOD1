public class Jam {
    /***************ATRIBUT***************/
    int jam;
    int menit;
    int detik;

    /***************METHOD***************/
    //konstruktor untuk membuat jam
    Jam(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    //mengembalikan nilai jam
    int getJam() {
        return jam;
    }

    //mengembalikan nilai menit
    int getMenit() {
        return menit;
    }

    //mengembalikan nilai detik
    int getDetik() {
        return detik;
    }

    void setJam(int jam) {
        if(jam >= 0 && jam <= 24) {
            this.jam = jam;
        } else {
            System.out.println("Jam tidak valid");
        }
    }

    void setMenit(int menit) {
        if(menit >= 0 && menit <= 60) {
            this.menit = menit;
        } else {
            System.out.println("Menit tidak valid");
        }
    }

    void setDetik(int detik) {
        if(detik >= 0 && detik <= 60) {
            this.detik = detik;
        } else {
            System.out.println("Detik tidak valid");
        }   
    }

    String getWaktuSholat() {
        if(jam >= 4 && jam < 6) {
            return "Subuh";
        } else if(jam >= 12 && jam < 15) {
            return "Dzuhur";
        } else if(jam >= 15 && jam < 18) {
            return "Ashar";
        } else if(jam >= 18 && jam < 19) {
            return "Maghrib";
        } else {
            return "Isya";
        }
    } 

    //mencetak waktu sholat
    void printWaktuSholat() {
        System.out.println(getWaktuSholat());
    }
}