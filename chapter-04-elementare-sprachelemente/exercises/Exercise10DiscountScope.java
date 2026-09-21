/**
 * EXERCICE 10 - Rabatt-Scope in einer Bestellung reparieren
 * ========================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Shop berechnet fuer grosse Bestellungen einen Rabatt. Der berechnete Endpreis wird nach dem `if` gebraucht, darf dort also nicht aus dem Scope verschwinden.
 *
 * Notions du cours :
 * Block-Scope, Deklarationsstelle, Zuweisung in einem `if`.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Platziere die Ergebnisvariable so, dass sie im `if` berechnet und danach ausgegeben werden kann.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn du eine Notiz in einem abgeschlossenen Raum liegen laesst, kannst du sie draussen nicht mehr lesen. Deklariere die Variable dort, wo beide Bereiche sie sehen koennen.
 *
 * -- Essayons a la main --
 * preis=100, rabattAktiv=true -> endpreis=90. Die Variable muss nach dem Block noch existieren.
 *
 * -- Le plan --
 * 1. Lege die Eingangsdaten an.
 * 2. Deklariere `endpreis` vor dem `if`.
 * 3. Setze zuerst den Normalpreis.
 * 4. Ueberschreibe bei aktivem Rabatt auf 90 Prozent.
 * 5. Pruefe den Wert nach dem Block.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Das Problem ist die Lebens-/Sichtbarkeitsgrenze einer einzigen Variable.
 *
 * Exemples a verifier :
 * - 100 mit Rabatt -> 90.0
 * - 100 ohne Rabatt -> 100.0
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Eine lokale Variable ist ab ihrer Deklaration nur innerhalb ihres Blocks sichtbar.
 * - Die Zuweisung darf im `if` bleiben.
 */
void main() {
    double preis = 100.0;
    boolean rabattAktiv = true;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(endpreis);
    ExerciseChecker.check("Rabattpreis", endpreis == 90.0);
    ExerciseChecker.summary();
}
