/**
 * Corrige de l'exercice 37.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise37PatternSupportRouter.java.
 */
void main() {
    Object ticket = 503;

    String route = switch (ticket) {
        case null -> "KEIN_TICKET";
        case String s -> "TEXT";
        case Integer i when i >= 500 -> "SERVERFEHLER";
        case Integer i -> "CODE";
        default -> "SONSTIG";
    };

    IO.println(route);
    ExerciseChecker.check("503 wird Serverfehler", route.equals("SERVERFEHLER"));
    ExerciseChecker.summary();
}
