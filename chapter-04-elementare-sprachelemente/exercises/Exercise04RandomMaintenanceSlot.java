/**
 * EXERCICE 04 - Wartungsplatz zufaellig zuteilen
 * =============================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Fuer einen Hardware-Test stehen zehn Wartungsplaetze mit den Nummern 1 bis 10 zur Verfuegung. Ein Platz soll zufaellig ausgewaehlt werden.
 *
 * Notions du cours :
 * `Random`, `nextInt(bound)`, exklusiver oberer Grenzwert, Verschiebung eines Wertebereichs.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Erzeuge einen zufaelligen Platz im Bereich 1 bis einschliesslich 10.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Die Zufallsmaschine gibt bei `nextInt(10)` nur 0 bis 9 aus. Wir wollen aber Schilder 1 bis 10. Also schieben wir jedes Ergebnis um eins nach oben.
 *
 * -- Essayons a la main --
 * 0 wird 1, 1 wird 2, ..., 9 wird 10.
 *
 * -- Le plan --
 * 1. Erzeuge ein `Random`-Objekt.
 * 2. Hole einen Wert mit `nextInt(10)`.
 * 3. Verschiebe den Wert um 1.
 * 4. Speichere ihn in `slot`.
 * 5. Pruefe nur die stabile Eigenschaft: 1 <= slot <= 10.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Das Problem besteht aus einer kurzen, zusammenhaengenden Berechnung.
 *
 * Exemples a verifier :
 * - Erlaubt: 1
 * - Erlaubt: 10
 * - Nie erlaubt: 0 oder 11
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `nextInt(10)` liefert 0..9.
 * - Teste beim Zufall eine Bereichseigenschaft, nicht einen festen Zufallswert.
 */
void main() {
    var random = new Random();
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("Wartungsplatz: " + slot);
    ExerciseChecker.check("Slot im Bereich 1..10", slot >= 1 && slot <= 10);
    ExerciseChecker.summary();
}
