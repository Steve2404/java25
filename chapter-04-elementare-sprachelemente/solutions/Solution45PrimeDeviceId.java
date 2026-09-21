/**
 * Corrige de l'exercice 45.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise45PrimeDeviceId.java.
 */
void main() {
    long n = 97;
    boolean prime = n >= 2;
    long grenze = (long) Math.sqrt(n);

    for (long i = 2; prime && i <= grenze; i++) {
        if (n % i == 0) {
            prime = false;
            break;
        }
    }

    IO.println(prime ? "Primzahl" : "Keine Primzahl");
    ExerciseChecker.check("97 ist prim", prime);
    ExerciseChecker.summary();
}
