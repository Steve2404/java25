/**
 * Corrige de l'exercice 10.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise10DiscountScope.java.
 */
void main() {
    double preis = 100.0;
    boolean rabattAktiv = true;

    double endpreis = preis;

    if (rabattAktiv) {
        endpreis = preis * 0.90;
    }

    IO.println(endpreis);
    ExerciseChecker.check("Rabattpreis", endpreis == 90.0);
    ExerciseChecker.summary();
}
