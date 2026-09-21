/**
 * EXERCICE 30 - Legacy-switch-Fall-through in einer Tariflogik reparieren
 * ======================================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein altes Tarifprogramm setzt fuer Stufe 1 zuerst 10 Euro, laeuft dann aber ohne `break` weiter und ueberschreibt den Preis. Du sollst die klassische Logik reparieren.
 *
 * Notions du cours :
 * klassischer `switch`, Doppelpunkt-Syntax, Fall-through, `break`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Sorge dafuer, dass Stufe 1 wirklich 10 Euro ergibt und nicht von spaeteren Faellen ueberschrieben wird.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn du nach dem richtigen Schalter nicht stoppst, rutschst du in die naechsten Schalter weiter. `break` ist die Stopptuer.
 *
 * -- Essayons a la main --
 * stufe=1. Ohne break: 10 -> 20 -> 99. Mit break nach case 1 bleibt 10.
 *
 * -- Le plan --
 * 1. Lege `preis` an.
 * 2. Schreibe den klassischen switch.
 * 3. Setze in jedem bekannten Fall den Preis.
 * 4. Beende jeden Fall mit `break`.
 * 5. Pruefe fuer Stufe 1 den Wert 10.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Aufgabe soll gerade das Kontrollflussverhalten im klassischen switch sichtbar machen.
 *
 * Exemples a verifier :
 * - 1 -> 10
 * - 2 -> 20
 * - andere -> 99
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `break` beendet den switch-Fallfluss.
 * - `default` kann ebenfalls einen Preis setzen.
 */
void main() {
    int stufe = 1;
    int preis = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Stufe 1 bleibt 10", preis == 10);
    ExerciseChecker.summary();
}
