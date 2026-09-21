/**
 * Corrige de l'exercice 14.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise14FixedConversionRate.java.
 */
void main() {
    final double DM_PRO_EURO = 1.95583;
    double dm = 19.5583;

    double euro = dm / DM_PRO_EURO;

    IO.println(euro);
    ExerciseChecker.check("10 Euro", Math.abs(euro - 10.0) < 1e-12);
    ExerciseChecker.summary();
}
