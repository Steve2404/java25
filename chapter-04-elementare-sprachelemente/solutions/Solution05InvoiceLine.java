/**
 * Corrige de l'exercice 05.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise05InvoiceLine.java.
 */
void main() {
    int anzahl = 3;
    int preis = 12;

    int gesamt = anzahl * preis;
    String zeile = anzahl + " Artikel x " + preis + " Euro = " + gesamt + " Euro";

    IO.println(zeile);
    ExerciseChecker.check("Gesamtpreis", gesamt == 36);
    ExerciseChecker.check("Rechnungszeile", zeile.equals("3 Artikel x 12 Euro = 36 Euro"));
    ExerciseChecker.summary();
}
