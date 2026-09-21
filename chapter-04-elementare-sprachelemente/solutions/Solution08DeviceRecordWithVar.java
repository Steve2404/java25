/**
 * Corrige de l'exercice 08.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise08DeviceRecordWithVar.java.
 */
void main() {
    var count = 10;
    var serial = 10L;
    var voltage = 230.0;
    var status = 'A';

    ExerciseChecker.check("count", count + 1 == 11);
    ExerciseChecker.check("serial", serial == 10L);
    ExerciseChecker.check("voltage", voltage / 2 == 115.0);
    ExerciseChecker.check("status", status == 'A');
    ExerciseChecker.summary();
}
