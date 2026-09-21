/**
 * Corrige de l'exercice 48.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise48EnergyAnomaly.java.
 */
void main() {
    double[] historie = {10, 12, 11, 13, 9, 10, 11};
    double heute = 24.0;
    double summe = 0.0;

    for (double wert : historie) {
        summe += wert;
    }

    double durchschnitt = summe / historie.length;
    double grenze = durchschnitt * 1.5;
    boolean anomalie = heute > grenze;

    IO.println("Durchschnitt: " + durchschnitt);
    IO.println("Anomalie: " + anomalie);
    ExerciseChecker.check("24 ist Anomalie", anomalie);
    ExerciseChecker.summary();
}
