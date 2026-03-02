/* Nama File    : MTitik.java
 * Deskipsi     : berisi atribut dan method dalam class Titik
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 24 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik() {
        System.out.println(this.counterTitik);
    } 

    int getKuadran() {
        if(absis >= 0 && ordinat >= 0) {
            return 1;
        } else if(absis <= 0 && ordinat >= 0) {
            return 2;
        } else if(absis <= 0 && ordinat <= 0) {
            return 3;
        } else {
            return 4;
        }
    } 

    double getJarakPusat() {
        return (Math.sqrt(absis * absis + ordinat * ordinat));
    }

    double getJarak(Titik T) {
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return (Math.sqrt(dx * dx + dy * dy));
    }

    void refleksiX() {
        ordinat = ordinat * -1;
    }

    void refleksiY() {
        absis = absis * -1;
    }

    Titik getRefleksiX() {
        Titik t = new Titik();
        t.setAbsis(this.absis);
        t.setOrdinat(-this.ordinat);
        return t;
    }

    Titik getRefleksiY() {
        Titik t = new Titik();
        t.setAbsis(-this.absis);
        t.setOrdinat(this.ordinat);
        return t;
    }

} //end class Titik
