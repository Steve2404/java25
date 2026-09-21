/**
 * Corrige de l'exercice 13.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise13InventoryPromotion.java.
 */
void main() {
    byte kleinlager = 10;
    short hauptlager = 20;

    int total = kleinlager + hauptlager;

    ExerciseChecker.check("Summe 30", total == 30);
    ExerciseChecker.summary();
}
