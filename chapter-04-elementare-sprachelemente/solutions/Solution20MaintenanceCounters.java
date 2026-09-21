/**
 * Corrige de l'exercice 20.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise20MaintenanceCounters.java.
 */
void main() {
    int i = 5;

    int alterStand = i++;
    int freigabeStand = ++i;

    ExerciseChecker.check("Alter Stand", alterStand == 5);
    ExerciseChecker.check("Endzaehler", i == 7);
    ExerciseChecker.check("Freigabestand", freigabeStand == 7);
    ExerciseChecker.summary();
}
