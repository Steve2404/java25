/**
 * Corrige de l'exercice 32.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise32RetryLoop.java.
 */
void main() {
    int versuche = 0;

    while (versuche < 3) {
        IO.println("Versuch " + (versuche + 1));
        versuche++;
    }

    ExerciseChecker.check("Genau drei Versuche", versuche == 3);
    ExerciseChecker.summary();
}
