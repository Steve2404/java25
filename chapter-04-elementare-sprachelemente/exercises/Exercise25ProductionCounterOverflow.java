/**
 * EXERCICE 25 - Produktionszaehler-Overflow erkennen
 * =================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein alter Zaehler steht bereits auf `Integer.MAX_VALUE`. Ein weiteres Ereignis wird addiert. Das Monitoring soll verstehen, warum danach ein negativer Wert auftaucht.
 *
 * Notions du cours :
 * primitiver `int`-Overflow, Wrap-around, keine automatische Exception.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Erhoehe den Maximalwert um 1 und pruefe den resultierenden Minimalwert.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Der Zaehler ist wie ein Kilometerzaehler mit fester Stellenzahl. Nach der letzten moeglichen Zahl springt er im primitiven Integer-Modell auf die andere Seite des Wertebereichs.
 *
 * -- Essayons a la main --
 * MAX_VALUE + 1 -> MIN_VALUE.
 *
 * -- Le plan --
 * 1. Speichere `Integer.MAX_VALUE`.
 * 2. Erhoehe um 1.
 * 3. Gib den neuen Wert aus.
 * 4. Vergleiche mit `Integer.MIN_VALUE`.
 * 5. Beobachte: keine Exception wird automatisch geworfen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Der Grenzuebergang selbst ist das Experiment.
 *
 * Exemples a verifier :
 * - 2147483647 + 1 -> -2147483648
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Nutze primitive int-Arithmetik.
 * - Die Sprache meldet Overflow hier nicht automatisch.
 */
void main() {
    int counter = Integer.MAX_VALUE;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(counter);
    ExerciseChecker.check("Wrap auf MIN_VALUE", counter == Integer.MIN_VALUE);
    ExerciseChecker.summary();
}
