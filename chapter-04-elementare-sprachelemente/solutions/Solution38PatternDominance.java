/**
 * Corrige de l'exercice 38.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise38PatternDominance.java.
 */
void main() {
    Object value = "VPN";

    String result = switch (value) {
        case String s when s.length() <= 5 -> "KURZTEXT";
        case String s -> "TEXT";
        case Object o -> "ANDERES";
    };

    ExerciseChecker.check("Kurzer String erkannt", result.equals("KURZTEXT"));
    ExerciseChecker.summary();
}
