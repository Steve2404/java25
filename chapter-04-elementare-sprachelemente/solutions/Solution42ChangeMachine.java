/**
 * Corrige de l'exercice 42.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise42ChangeMachine.java.
 */
void main() {
    int rueckgeld = 63;
    int rest = rueckgeld;

    int c50 = rest / 50;
    rest %= 50;

    int c20 = rest / 20;
    rest %= 20;

    int c10 = rest / 10;
    rest %= 10;

    int c5 = rest / 5;
    rest %= 5;

    int c2 = rest / 2;
    rest %= 2;

    int c1 = rest;

    int rekonstruiert = c50 * 50 + c20 * 20 + c10 * 10 + c5 * 5 + c2 * 2 + c1;
    ExerciseChecker.check("Wert rekonstruiert", rekonstruiert == rueckgeld);
    ExerciseChecker.check("Rest null", rest == 0);
    ExerciseChecker.summary();
}
