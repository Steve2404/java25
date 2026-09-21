/**
 * EXERCICE 36 - Sitzplatzmatrix mit Label gezielt verlassen
 * ========================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Saalplan wird als 3x4-Gitter durchsucht. Gesucht wird der erste Platz mit Koordinate Zeile 1, Spalte 2. Nach dem Fund sollen beide Schleifen sofort enden.
 *
 * Notions du cours :
 * verschachtelte `for`-Schleifen, Label, `break label`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Beende beide Schleifen mit einem Label, sobald die Zielkoordinate gefunden wurde.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du suchst in Schubladen, die in groesseren Schubladen liegen. Ein normales `break` wuerde nur die kleine Schubladenreihe verlassen. Das Label zeigt die groessere Ausgangstuer.
 *
 * -- Essayons a la main --
 * Zeile 0 komplett, dann Zeile 1: Spalte 0,1,2 -> Fund -> beide Schleifen enden.
 *
 * -- Le plan --
 * 1. Lege Fundkoordinaten mit -1 an.
 * 2. Gib der aeusseren Schleife ein Label.
 * 3. Durchsuche Zeilen und Spalten.
 * 4. Beim Treffer Werte speichern.
 * 5. Mit `break outer` beide Schleifen verlassen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Das Label gehoert direkt zum Kontrollfluss der verschachtelten Suche.
 *
 * Exemples a verifier :
 * - Ziel 1,2 -> foundRow=1 und foundCol=2
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Schreibe `outer:` direkt vor die aeussere Schleife.
 * - `break outer;` verlaesst die markierte Schleife.
 */
void main() {
    int foundRow = -1;
    int foundCol = -1;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Ziel gefunden", foundRow == 1 && foundCol == 2);
    ExerciseChecker.summary();
}
