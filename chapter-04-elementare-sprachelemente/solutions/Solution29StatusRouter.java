/**
 * Corrige de l'exercice 29.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise29StatusRouter.java.
 */
void main() {
    int code = 2;

    String text = switch (code) {
        case 0 -> "OK";
        case 1 -> "WARNUNG";
        case 2 -> "FEHLER";
        default -> "UNBEKANNT";
    };

    IO.println(text);
    ExerciseChecker.check("Code 2", text.equals("FEHLER"));
    ExerciseChecker.summary();
}
