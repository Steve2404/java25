/**
 * Corrige de l'exercice 02.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise02DeploymentArguments.java.
 */
void main(String[] args) {
    int count = 0;

    for (String arg : args) {
        IO.println(arg);
        count++;
    }

    ExerciseChecker.check("Alle Argumente gezaehlt", count == args.length);
    ExerciseChecker.summary();
}
