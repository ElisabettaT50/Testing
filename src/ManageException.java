/*
Riprendi uno degli esercizi già svolti e corretti
Aggiungi Junit al progetto
Crea una funzione di test che non dia errori
 */
/*
Esercizio 1 exceptions

Scrivere una funzione che controlli se un numero int è in un determinato range
Se lo è ritorna true se non lo è lancia un'eccezione
 */
public class ManageException {
    public static void main (String[] args){
        checkNumInRange(16, 10, 15);
    }
    public static boolean checkNumInRange(int numToCheck, int minNum, int maxNum) {
        if (numToCheck >= minNum && numToCheck <= maxNum) {
            return true;
        } else {
            throw new ArithmeticException("number outside range");
        }
    }
}