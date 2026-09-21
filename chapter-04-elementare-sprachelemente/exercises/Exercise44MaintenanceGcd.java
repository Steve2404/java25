/**
 * EXERCICE 44 - Wartungsfenster mit GGT synchronisieren
 * ====================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Zwei Maschinen brauchen alle 84 bzw. 126 Stunden einen Wartungsrhythmus. Fuer eine gemeinsame Rasterung wird ihr groesster gemeinsamer Teiler gesucht.
 *
 * Notions du cours :
 * Euklidischer Algorithmus, `while`, `%`, Zustandsverschiebung.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne den GGT von 84 und 126 mit dem Modulo-Verfahren.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du ersetzt ein grosses Zahlenpaar immer wieder durch `kleinere Zahl und Rest`. Irgendwann ist der Rest 0. Die andere Zahl ist dann der GGT.
 *
 * -- Essayons a la main --
 * 126%84=42 -> Paar 84,42 -> 84%42=0 -> GGT 42.
 *
 * -- Le plan --
 * 1. Speichere x=84 und y=126.
 * 2. Solange y nicht 0 ist: berechne Rest.
 * 3. Verschiebe x=y.
 * 4. Setze y=Rest.
 * 5. Nach der Schleife ist x der GGT.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Der Algorithmus waere spaeter ein guter Methoden-Kandidat, aber in diesem Kapitel bleibt er sichtbar im main.
 *
 * Exemples a verifier :
 * - 84,126 -> 42
 * - 48,18 -> 6
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Die Reihenfolge der Startwerte ist fuer den GGT egal.
 * - Merke vor dem Ueberschreiben den Rest.
 */
void main() {
    long x = 84;
    long y = 126;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("GGT: " + x);
    ExerciseChecker.check("GGT 42", x == 42);
    ExerciseChecker.summary();
}
