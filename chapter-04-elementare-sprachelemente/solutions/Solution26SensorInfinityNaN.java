/**
 * Corrige de l'exercice 26.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise26SensorInfinityNaN.java.
 */
void main() {
    double infinite = 1.0 / 0.0;
    double notANumber = 0.0 / 0.0;

    IO.println(infinite);
    IO.println(notANumber);
    ExerciseChecker.check("Infinity erkannt", Double.isInfinite(infinite));
    ExerciseChecker.check("NaN erkannt", Double.isNaN(notANumber));
    ExerciseChecker.summary();
}
