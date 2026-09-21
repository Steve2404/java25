/**
 * Corrige de l'exercice 07.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise07AlignedMeasurementTable.java.
 */
void main() {
    double u1 = 1.2;
    double u2 = 12.3456;
    double u3 = 0.0049;

    IO.printf("%10.3f%10.3f%10.3f%n", u1, u2, u3);

    ExerciseChecker.check("Quelldaten bleiben erhalten", u2 == 12.3456);
    ExerciseChecker.summary();
}
