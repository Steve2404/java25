/**
 * Corrige de l'exercice 46.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise46DigitChecksum.java.
 */
void main() {
    long inventar = 48317;
    long arbeit = inventar;
    int summe = 0;

    while (arbeit > 0) {
        summe += (int) (arbeit % 10);
        arbeit /= 10;
    }

    int checksum = summe % 10;

    ExerciseChecker.check("Ziffernsumme 23", summe == 23);
    ExerciseChecker.check("Checksum 3", checksum == 3);
    ExerciseChecker.summary();
}
