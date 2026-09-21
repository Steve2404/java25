/**
 * Corrige de l'exercice 23.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise23RedundantSensorsXor.java.
 */
void main() {
    boolean sensorA = true;
    boolean sensorB = false;

    boolean wartungsalarm = sensorA ^ sensorB;

    ExerciseChecker.check("Nur ein Sensor aktiv", wartungsalarm);
    ExerciseChecker.summary();
}
