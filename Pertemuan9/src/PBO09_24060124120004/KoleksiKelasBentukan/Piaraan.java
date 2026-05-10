package PBO09_24060124120004.KoleksiKelasBentukan;
import java.util.*;

/* Nama File    : Piaraan.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 10 Mei 2026
 */

public class Piaraan {
    public int nbelm;
    public ArrayList<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new ArrayList<Anabul>();
        nbelm = 0;
    }

    /* 2. b) i. getNbelm() */
    public int getNbelm() {
        return nbelm;
    }

    /* 2. b) ii. enqueueAnabul(anabul) */
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm = Lanabul.size();
    }

    /* 2. b) iii. isMember(anabul) */
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    /* 2. b) iv. getAnabul() */
    public Anabul getAnabul() {
        if(!Lanabul.isEmpty()) {
            return Lanabul.get(0);
        }
        return null;
    }

    /* 2. b) v. dequeueAnabul() */
    public Anabul dequeueAnabul() {
        if(!Lanabul.isEmpty()) {
            Anabul temp = Lanabul.remove(0);
            nbelm = Lanabul.size();
            return temp;
        }
        return null;
    }

    /* 2. c) showAnabul() */
    public void showAnabul() {
        System.out.println("Daftar Anabul:");
        for(Anabul a: Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    /* 2. d) countKucing() */
    public int countKucing() {
        int count = 0;
        for(Anabul a : Lanabul) {
            if(a.getClass().getSimpleName().equals("Kucing")) {
                count++;
            }
        }
        return count;
    }

    /* 2. e) bobotKucing() */
    public double bobotKucing() {
        double total = 0;
        for(Anabul a : Lanabul) {
            if(a.getClass().getSimpleName().equals("Kucing")) {
                if(a instanceof Kucing) {
                    total += ((Kucing) a).getBobot();
                }
            }
        }
        return total;
    }

    /* 2. f) showJenisAnabul() */
    public void showJenisAnabul() {
        System.out.println("Daftar Anabul + Jenis:");
        for(Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (" + a.getClass().getSimpleName() + ")");
        }
    }
}