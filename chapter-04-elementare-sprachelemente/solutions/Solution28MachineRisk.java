/**
 * Corrige de l'exercice 28.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise28MachineRisk.java.
 */
void main() {
    int temperatur = 83;
    String status;

    if (temperatur >= 80) {
        status = "KRITISCH";
    } else if (temperatur >= 60) {
        status = "WARNUNG";
    } else {
        status = "NORMAL";
    }

    IO.println(status);
    ExerciseChecker.check("83 ist kritisch", status.equals("KRITISCH"));
    ExerciseChecker.summary();
}
