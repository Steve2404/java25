/**
 * EXERCICE 17 - Raumflaeche per Konsole berechnen
 * ==============================================
 *
 * Niveau : facile -> moyen
 *
 * Histoire :
 * Ein Gebaeudeservice erfasst Laenge und Breite eines Raums, um Material fuer einen neuen Boden zu planen.
 *
 * Notions du cours :
 * `Simput.gdouble()`, Multiplikation, Zwischenvariable, Ausgabe.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Lies Laenge und Breite und berechne die Flaeche.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Ein Rechteck ist wie ein Teppich. Wenn du weisst, wie lang und wie breit er ist, bekommst du seine Flaeche durch Multiplikation.
 *
 * -- Essayons a la main --
 * 5.5 m * 2.0 m = 11.0 m².
 *
 * -- Le plan --
 * 1. Lies `laenge` als double.
 * 2. Lies `breite` als double.
 * 3. Berechne `flaeche`.
 * 4. Gib das Ergebnis aus.
 * 5. Teste mit 5.5 und 2.0.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Eingabe, Rechnung und Ausgabe bilden hier einen kleinen geraden Ablauf.
 *
 * Exemples a verifier :
 * - 5.5 und 2.0 -> 11.0
 * - 1.0 und 1.0 -> 1.0
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Nutze `Simput.gdouble()`.
 * - Die Flaeche ist `laenge * breite`.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("Flaeche: " + flaeche);
    ExerciseChecker.check("Testflaeche 11.0", Math.abs(flaeche - 11.0) < 1e-12);
    ExerciseChecker.summary();
}
