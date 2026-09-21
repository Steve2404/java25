/**
 * Corrige de l'exercice 16.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise16VisitorCheckIn.java.
 */
void main() {
    int alter = Simput.gint("Alter: ");
    double groesse = Simput.gdouble("Groesse: ");
    char initiale = Simput.gchar("Initiale: ");

    IO.println(alter);
    IO.println(groesse);
    IO.println(initiale);

    ExerciseChecker.check("Test-Alter 33", alter == 33);
    ExerciseChecker.check("Test-Groesse 1.82", Math.abs(groesse - 1.82) < 1e-12);
    ExerciseChecker.check("Test-Initiale L", initiale == 'L');
    ExerciseChecker.summary();
}
