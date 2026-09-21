/**
 * EXERCICE 42 - Kassenautomat: Rueckgeld in Muenzen zerlegen
 * =========================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein einfacher Kassenautomat muss 63 Cent Rueckgeld mit den Muenzen 50, 20, 10, 5, 2 und 1 Cent zerlegen. Es soll jeweils zuerst die groesste moegliche Muenze genommen werden.
 *
 * Notions du cours :
 * Ganzzahldivision, `%`, schrittweiser Rest, Algorithmik.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne die Anzahl jeder Muenze fuer 63 Cent.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du gibst immer so viele grosse Muenzen wie moeglich heraus. Danach arbeitest du nur noch mit dem Rest.
 *
 * -- Essayons a la main --
 * 63 -> 1x50, Rest13 -> 0x20, 1x10 Rest3 -> 0x5, 1x2 Rest1, 1x1.
 *
 * -- Le plan --
 * 1. Starte mit `rest=63`.
 * 2. Berechne Anzahl 50-Cent und aktualisiere Rest.
 * 3. Wiederhole fuer 20,10,5,2,1.
 * 4. Gib jede Anzahl aus.
 * 5. Pruefe, dass der Endrest 0 ist und der Wert wieder 63 ergibt.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Mental kann jede Muenze als gleiche kleine Rezeptbox gesehen werden, aber ohne Methoden wiederholen wir das Muster bewusst.
 *
 * Exemples a verifier :
 * - 63 -> 1x50, 1x10, 1x2, 1x1
 * - 100 -> 2x50
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Anzahl = `rest / muenzwert`.
 * - Neuer Rest = `rest % muenzwert`.
 */
void main() {
    int rueckgeld = 63;
    int rest = rueckgeld;
    
    // TODO 1
    // Ecris ton code ici.
    
    int rekonstruiert = c50 * 50 + c20 * 20 + c10 * 10 + c5 * 5 + c2 * 2 + c1;
    ExerciseChecker.check("Wert rekonstruiert", rekonstruiert == rueckgeld);
    ExerciseChecker.check("Rest null", rest == 0);
    ExerciseChecker.summary();
}
