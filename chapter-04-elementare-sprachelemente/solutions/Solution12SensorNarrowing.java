/**
 * Corrige de l'exercice 12.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise12SensorNarrowing.java.
 */
void main() {
    double raw = 12.9;
    int legacy = (int) raw;

    IO.println("raw=" + raw + ", legacy=" + legacy);
    ExerciseChecker.check("Abgeschnitten auf 12", legacy == 12);
    ExerciseChecker.summary();
}
