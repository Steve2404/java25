/**
 * Corrige de l'exercice 06.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise06FormattedSensorReport.java.
 */
void main() {
    double temperatur = 23.67891;

    IO.printf("Temperatur: %.2f C%n", temperatur);

    ExerciseChecker.check("Messwert unveraendert", temperatur == 23.67891);
    ExerciseChecker.summary();
}
