/* Nama File    : AngkaSial.java
 * Deskipsi     : program penggunaan exception buatan sendiri 
                  pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 24 Maret 2026
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Ketika eksepsi terjadi, baris 12 tidak dieksekusi karena program
// langsung melempar exception. Sedangkan baris 21 dieksekusi 
// karena exception terjadi saat as.cobaAngka(13), maka program masuk ke blok 
// catch (AngkaSialException ase) untuk menangani exception tersebut.