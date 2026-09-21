/**
 * Corrige de l'exercice 44.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise44MaintenanceGcd.java.
 */
void main() {
    long x = 84;
    long y = 126;

    while (y != 0) {
        long rest = x % y;
        x = y;
        y = rest;
    }

    IO.println("GGT: " + x);
    ExerciseChecker.check("GGT 42", x == 42);
    ExerciseChecker.summary();
}
