/**
 * Corrige de l'exercice 19.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise19AverageDivisionBug.java.
 */
void main() {
    int gesamtMinuten = 7;
    int tickets = 2;

    double average = (double) gesamtMinuten / tickets;

    IO.println(average);
    ExerciseChecker.check("Durchschnitt 3.5", average == 3.5);
    ExerciseChecker.summary();
}
