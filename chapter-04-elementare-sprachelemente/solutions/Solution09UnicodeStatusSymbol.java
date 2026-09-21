/**
 * Corrige de l'exercice 09.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise09UnicodeStatusSymbol.java.
 */
void main() {
    char status = 65;
    int code = status;

    IO.println(status);
    IO.println(code);
    ExerciseChecker.check("Zeichen A", status == 'A');
    ExerciseChecker.check("Code 65", code == 65);
    ExerciseChecker.summary();
}
