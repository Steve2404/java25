/**
 * Corrige de l'exercice 25.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise25ProductionCounterOverflow.java.
 */
void main() {
    int counter = Integer.MAX_VALUE;
    counter++;

    IO.println(counter);
    ExerciseChecker.check("Wrap auf MIN_VALUE", counter == Integer.MIN_VALUE);
    ExerciseChecker.summary();
}
