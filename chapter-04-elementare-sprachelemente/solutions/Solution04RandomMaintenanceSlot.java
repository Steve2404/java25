/**
 * Corrige de l'exercice 04.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise04RandomMaintenanceSlot.java.
 */
void main() {
    var random = new Random();

    int slot = random.nextInt(10) + 1;

    IO.println("Wartungsplatz: " + slot);
    ExerciseChecker.check("Slot im Bereich 1..10", slot >= 1 && slot <= 10);
    ExerciseChecker.summary();
}
