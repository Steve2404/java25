/**
 * EXERCICE 15 - Energiekosten mit gemischten Typen berechnen
 * =========================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Zaehler liefert 3 ganze Betriebsstunden als `long`, die Leistung ist 4.5 kW als `double`, und eine Grundgebuehr ist 2 Euro als `int`. Daraus wird ein Gesamtwert berechnet.
 *
 * Notions du cours :
 * Operatorpraezedenz, gemischte Arithmetik, numerische Promotion, Zwischentypen.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne `grundgebuehr + stunden * leistung` und bestimme den korrekten Ergebnistyp.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Ein Teil der Rechnung benutzt ganze Zahlen, ein anderer Dezimalzahlen. Sobald die Dezimalzahl in einem Rechenschritt mitmacht, braucht das Ergebnis genug Platz fuer Nachkommastellen.
 *
 * -- Essayons a la main --
 * 3L * 4.5 = 13.5; 2 + 13.5 = 15.5.
 *
 * -- Le plan --
 * 1. Speichere die drei Quelldaten mit den angegebenen Typen.
 * 2. Berechne zuerst gedanklich `stunden * leistung`.
 * 3. Bestimme dessen Typ.
 * 4. Addiere die Grundgebuehr.
 * 5. Speichere das Endergebnis im passenden Typ.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Gerade weil keine Methode ablenkt, sind die Zwischentypen gut sichtbar.
 *
 * Exemples a verifier :
 * - 2 + 3L * 4.5 -> 15.5
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `*` wird vor `+` ausgewertet.
 * - Bei der Multiplikation mit `double` entsteht ein `double`-Ergebnis.
 */
void main() {
    int grundgebuehr = 2;
    long stunden = 3L;
    double leistung = 4.5;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(kosten);
    ExerciseChecker.check("Kosten 15.5", kosten == 15.5);
    ExerciseChecker.summary();
}
