/**
 * EXERCICE 13 - Lagerbestaende ohne Typfalle addieren
 * ==================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Zwei sehr kleine Lagerzaehler werden als `byte` und `short` geliefert. Ihre Summe soll ohne unnoetigen Cast gespeichert werden.
 *
 * Notions du cours :
 * binaere numerische Promotion kleiner Ganzzahltypen zu `int`.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Speichere `byte + short` im korrekten Ergebnistyp.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Auch wenn beide kleinen Behaelter nur kleine Zahlen halten, benutzt Java fuer die Rechnung eine groessere Rechenkiste namens `int`.
 *
 * -- Essayons a la main --
 * 10 + 20 = 30. Der Wert ist klein, aber der Ausdruckstyp ist trotzdem `int`.
 *
 * -- Le plan --
 * 1. Deklariere `byte` und `short`.
 * 2. Addiere beide.
 * 3. Waehle den Ergebnistyp nach der Promotionsregel.
 * 4. Gib die Summe aus.
 * 5. Pruefe den Wert 30.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Aufgabe soll genau einen Ausdruckstyp sichtbar machen.
 *
 * Exemples a verifier :
 * - 10 byte + 20 short -> int 30
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Der Ergebnistyp richtet sich nicht nur danach, ob 30 in byte passen wuerde.
 * - Kein Cast ist erforderlich, wenn das Ziel `int` ist.
 */
void main() {
    byte kleinlager = 10;
    short hauptlager = 20;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Summe 30", total == 30);
    ExerciseChecker.summary();
}
