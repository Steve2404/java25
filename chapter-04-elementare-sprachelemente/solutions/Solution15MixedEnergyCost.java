/**
 * Corrige de l'exercice 15.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise15MixedEnergyCost.java.
 */
void main() {
    int grundgebuehr = 2;
    long stunden = 3L;
    double leistung = 4.5;

    double kosten = grundgebuehr + stunden * leistung;

    IO.println(kosten);
    ExerciseChecker.check("Kosten 15.5", kosten == 15.5);
    ExerciseChecker.summary();
}
