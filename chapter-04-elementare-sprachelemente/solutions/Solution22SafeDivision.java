/**
 * Corrige de l'exercice 22.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise22SafeDivision.java.
 */
void main() {
    int divisor = 0;

    boolean safe = divisor != 0 && 100 / divisor > 10;

    ExerciseChecker.check("Null sicher abgefangen", !safe);
    ExerciseChecker.summary();
}
