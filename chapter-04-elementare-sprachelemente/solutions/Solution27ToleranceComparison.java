/**
 * Corrige de l'exercice 27.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise27ToleranceComparison.java.
 */
void main() {
    double d = 0.1 + 0.2;
    double soll = 0.3;
    double toleranz = 1e-12;

    boolean nahezuGleich = Math.abs(d - soll) < toleranz;

    ExerciseChecker.check("Kalibrierung akzeptiert", nahezuGleich);
    ExerciseChecker.summary();
}
