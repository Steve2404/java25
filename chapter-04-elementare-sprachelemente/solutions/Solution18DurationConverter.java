/**
 * Corrige de l'exercice 18.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise18DurationConverter.java.
 */
void main() {
    int gesamt = Simput.gint("Gesamtsekunden: ");

    int stunden = gesamt / 3600;
    int rest = gesamt % 3600;
    int minuten = rest / 60;
    int sekunden = rest % 60;

    IO.println(stunden + "h " + minuten + "m " + sekunden + "s");
    ExerciseChecker.check("3665 -> 1:1:5",
            stunden == 1 && minuten == 1 && sekunden == 5);
    ExerciseChecker.summary();
}
