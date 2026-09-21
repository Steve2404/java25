/**
 * Corrige de l'exercice 01.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise01VisitorBadge.java.
 */
void main() {
    String prenom = "Ada";
    int raum = 204;

    String badge = prenom + " - Raum " + raum;

    IO.println(badge);
    ExerciseChecker.check("Badge exakt", badge.equals("Ada - Raum 204"));
    ExerciseChecker.summary();
}
