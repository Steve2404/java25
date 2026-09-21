/**
 * Corrige de l'exercice 30.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise30LegacySwitchFallThrough.java.
 */
void main() {
    int stufe = 1;
    int preis = 0;

    switch (stufe) {
        case 1:
            preis = 10;
            break;
        case 2:
            preis = 20;
            break;
        default:
            preis = 99;
    }

    ExerciseChecker.check("Stufe 1 bleibt 10", preis == 10);
    ExerciseChecker.summary();
}
