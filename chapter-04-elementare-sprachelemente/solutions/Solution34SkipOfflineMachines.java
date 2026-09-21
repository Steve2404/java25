/**
 * Corrige de l'exercice 34.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise34SkipOfflineMachines.java.
 */
void main() {
    int verarbeitet = 0;

    for (int id = 1; id <= 8; id++) {
        if (id % 2 == 0) {
            continue;
        }

        IO.println("Diagnose " + id);
        verarbeitet++;
    }

    ExerciseChecker.check("Vier Maschinen diagnostiziert", verarbeitet == 4);
    ExerciseChecker.summary();
}
