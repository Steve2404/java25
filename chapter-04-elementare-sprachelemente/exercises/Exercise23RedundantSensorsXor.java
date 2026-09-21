/**
 * EXERCICE 23 - Zwei redundante Sensoren mit XOR pruefen
 * =====================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Zwei Tuersensoren sollten denselben Zustand melden. Ein Wartungsalarm soll genau dann aktiv sein, wenn nur einer der beiden Sensoren `true` meldet.
 *
 * Notions du cours :
 * boolesches XOR `^`, zwei boolean-Operanden.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne den Wartungsalarm mit XOR.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn beide Sensoren dasselbe sagen, ist alles konsistent. Wenn nur einer `Ja` sagt und der andere `Nein`, stimmt etwas nicht.
 *
 * -- Essayons a la main --
 * true ^ false = true. true ^ true = false.
 *
 * -- Le plan --
 * 1. Lege beide Sensorwerte an.
 * 2. Verknuepfe sie mit booleschem XOR.
 * 3. Speichere `wartungsalarm`.
 * 4. Gib den Alarm aus.
 * 5. Pruefe die ungleiche Kombination.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. XOR drueckt genau die benoetigte Zweierbeziehung aus.
 *
 * Exemples a verifier :
 * - true,false -> true
 * - false,true -> true
 * - true,true -> false
 * - false,false -> false
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `^` mit booleans ist true, wenn die Werte verschieden sind.
 * - Nicht mit `||` verwechseln.
 */
void main() {
    boolean sensorA = true;
    boolean sensorB = false;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Nur ein Sensor aktiv", wartungsalarm);
    ExerciseChecker.summary();
}
