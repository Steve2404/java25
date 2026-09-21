/**
 * Corrige de l'exercice 39.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise39PrimitivePreviewSwitch.java.
 */
void main() {
    int status = 13;
    boolean serviceMode = true;

    String statusText = switch (status) {
        case 0 -> "okay";
        case 1 -> "warning";
        case int i when i >= 2 && i <= 25 -> "error: " + i;
        case int i -> "unknown status: " + i;
    };

    String modeText = switch (serviceMode) {
        case false -> "NORMAL";
        case true -> "SERVICE";
    };

    ExerciseChecker.check("Status 13", statusText.equals("error: 13"));
    ExerciseChecker.check("Service true", modeText.equals("SERVICE"));
    ExerciseChecker.summary();
}
