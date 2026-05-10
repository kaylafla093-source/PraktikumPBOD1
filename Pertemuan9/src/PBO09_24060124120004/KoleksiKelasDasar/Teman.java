package PBO09_24060124120004.KoleksiKelasDasar;
import java.util.*;

/* Nama File    : Teman.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 5 Mei 2026
 */

public class Teman<T> {
    private int nbelm;
    private ArrayList<String> Lnama;

    public Teman () {
        nbelm = 0;
        Lnama = new ArrayList<String>();
    }

    /* 1. a) getNbelm */
    public int getNbelm() {
        return nbelm;
    }

    /* 1. b) getNama */
    public String getNama(int indeks) {
        if(indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    /* 1. c) setNama */
    public void setNama(int indeks, String nama) {
        if(indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    /* 1. d) addNama */
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }

    /* 1. e) delNama */
    public void delNama(String nama) {
        if(Lnama.remove(nama)) {
            nbelm = Lnama.size();
        }
    }

    /* 1. f) isMember */
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    /* 1. g) gantiNama */
    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);
        if(idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    /* 1. h) countNama */
    public int countNama(String nama) {
        int count = 0;
        for(String n : Lnama) {
            if(n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    /* 1. i) showTeman */
    public void showTeman() {
        for(String n : Lnama) {
            System.out.println("- " + n);
        }
    }
}