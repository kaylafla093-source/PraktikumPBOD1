/* Nama File    : ExceptionOnArray.java
 * Deskipsi     : program penggunaan eksepsi menggunakan class library Java
 * Pembuat      : Kayla Febrina Laura Ayu / 24060124120004  
 * Tanggal      : 24 Maret 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}