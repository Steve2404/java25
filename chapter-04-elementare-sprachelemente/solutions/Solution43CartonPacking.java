/**
 * Corrige de l'exercice 43.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise43CartonPacking.java.
 */
void main() {
    int artikel = 137;
    int kapazitaet = 24;

    int voll = artikel / kapazitaet;
    int rest = artikel % kapazitaet;
    int gesamt = voll + (rest > 0 ? 1 : 0);

    ExerciseChecker.check("Volle Kartons", voll == 5);
    ExerciseChecker.check("Rest", rest == 17);
    ExerciseChecker.check("Gesamt", gesamt == 6);
    ExerciseChecker.summary();
}
