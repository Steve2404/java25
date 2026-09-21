/**
 * EXERCICE 08 - Geraetedaten mit var korrekt typisieren
 * ====================================================
 *
 * Niveau : facile -> moyen
 *
 * Histoire :
 * Ein Inventurprogramm speichert Stueckzahl, Seriennummer, Spannung und Statuszeichen. `var` soll verwendet werden, ohne die statischen Typen zu vergessen.
 *
 * Notions du cours :
 * `var`, Literaltypen `int`, `long`, `double`, `char`.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Deklariere vier Variablen mit `var` aus den vorgegebenen Literalen und benutze je eine typgerechte Operation.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * `var` ist kein Zauberbehaelter, der spaeter jeden Typ annimmt. Java schaut beim ersten Einfuellen genau hin und klebt dann ein festes Typetikett darauf.
 *
 * -- Essayons a la main --
 * 10 -> int, 10L -> long, 230.0 -> double, 'A' -> char.
 *
 * -- Le plan --
 * 1. Lege vier `var`-Variablen an.
 * 2. Nutze die geforderten Literale.
 * 3. Berechne aus der Stueckzahl `count + 1`.
 * 4. Berechne aus der Spannung `voltage / 2`.
 * 5. Pruefe die Werte.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Es geht um vier parallele Deklarationen und einfache Operationen.
 *
 * Exemples a verifier :
 * - `var count = 10` verhaelt sich wie int.
 * - `var serial = 10L` verhaelt sich wie long.
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Das Suffix `L` macht ein Ganzzahlliteral zu `long`.
 * - Ein Dezimalliteral wie `230.0` ist standardmaessig `double`.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("count", count + 1 == 11);
    ExerciseChecker.check("serial", serial == 10L);
    ExerciseChecker.check("voltage", voltage / 2 == 115.0);
    ExerciseChecker.check("status", status == 'A');
    ExerciseChecker.summary();
}
