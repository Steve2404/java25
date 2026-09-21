/**
 * Corrige de l'exercice 31.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise31WeeklyEnergyTotal.java.
 */
void main() {
    int[] werte = {3, 4, 5, 2, 6, 1, 4};
    int summe = 0;

    for (int i = 0; i < werte.length; i++) {
        summe += werte[i];
    }

    IO.println(summe);
    ExerciseChecker.check("Wochensumme 25", summe == 25);
    ExerciseChecker.summary();
}
