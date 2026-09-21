/**
 * Corrige de l'exercice 36.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise36LabeledGridSearch.java.
 */
void main() {
    int foundRow = -1;
    int foundCol = -1;

    outer:
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 4; col++) {
            if (row == 1 && col == 2) {
                foundRow = row;
                foundCol = col;
                break outer;
            }
        }
    }

    ExerciseChecker.check("Ziel gefunden", foundRow == 1 && foundCol == 2);
    ExerciseChecker.summary();
}
