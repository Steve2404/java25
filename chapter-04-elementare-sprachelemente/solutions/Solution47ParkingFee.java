/**
 * Corrige de l'exercice 47.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise47ParkingFee.java.
 */
void main() {
    int stunden = 5;
    double gebuehr;

    if (stunden <= 0) {
        gebuehr = 0.0;
    } else {
        gebuehr = 2.0 + (stunden - 1) * 1.5;
    }

    IO.printf("Gebuehr: %.2f Euro%n", gebuehr);
    ExerciseChecker.check("5 Stunden kosten 8 Euro", gebuehr == 8.0);
    ExerciseChecker.summary();
}
