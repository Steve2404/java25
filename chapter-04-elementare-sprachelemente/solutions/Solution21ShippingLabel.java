/**
 * Corrige de l'exercice 21.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise21ShippingLabel.java.
 */
void main() {
    int gewicht = 24;

    String label = gewicht >= 20 ? "SCHWER" : "STANDARD";

    IO.println(label);
    ExerciseChecker.check("Schweres Paket", label.equals("SCHWER"));
    ExerciseChecker.summary();
}
