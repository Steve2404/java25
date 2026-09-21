/**
 * Corrige de l'exercice 35.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise35FirstDivisor.java.
 */
void main() {
    long n = 91;
    long teiler = 0;

    for (long i = 2; i < n; i++) {
        if (n % i == 0) {
            teiler = i;
            break;
        }
    }

    IO.println("Erster Teiler: " + teiler);
    ExerciseChecker.check("91 hat ersten Teiler 7", teiler == 7);
    ExerciseChecker.summary();
}
