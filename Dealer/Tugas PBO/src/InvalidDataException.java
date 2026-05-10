// Nama File : InvalidDataException.java
// Deskripsi : Custom exception untuk data tidak valid

public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}