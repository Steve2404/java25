/**
 * Corrige de l'exercice 24.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise24AccessRule.java.
 */
void main() {
    boolean badgeGueltig = true;
    boolean admin = false;
    boolean serviceZeit = true;

    boolean zutritt = badgeGueltig && (admin || serviceZeit);

    ExerciseChecker.check("Zutritt erlaubt", zutritt);
    ExerciseChecker.summary();
}
