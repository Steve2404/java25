/**
 * Corrige de l'exercice 17.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise17RoomArea.java.
 */
void main() {
    double laenge = Simput.gdouble("Laenge: ");
    double breite = Simput.gdouble("Breite: ");
    double flaeche = laenge * breite;

    IO.println("Flaeche: " + flaeche);
    ExerciseChecker.check("Testflaeche 11.0", Math.abs(flaeche - 11.0) < 1e-12);
    ExerciseChecker.summary();
}
