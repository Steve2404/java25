/**
 * Corrige de l'exercice 33.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise33PositiveInputDoWhile.java.
 */
void main() {
    int anzahl;

    do {
        anzahl = Simput.gint("Positive Anzahl: ");
    } while (anzahl <= 0);

    IO.println("Akzeptiert: " + anzahl);
}
