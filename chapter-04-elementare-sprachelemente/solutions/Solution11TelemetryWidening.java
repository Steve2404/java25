/**
 * Corrige de l'exercice 11.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise11TelemetryWidening.java.
 */
void main() {
    byte b = 100;
    short s = b;
    int i = s;
    long l = i;
    double d = l;

    ExerciseChecker.check("Wert bleibt 100", d == 100.0);
    ExerciseChecker.summary();
}
