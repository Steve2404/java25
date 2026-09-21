/**
 * EXERCICE 45 - Geraete-ID auf Primzahl pruefen
 * ============================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Testsystem markiert bestimmte IDs nur dann als Sondergruppe, wenn sie Primzahlen sind. Die Beispiel-ID ist 97.
 *
 * Notions du cours :
 * Primzahltest, `Math.sqrt`, `for`, `%`, `break`, boolean-Zustand.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Pruefe 97 nur bis zur Quadratwurzel und entscheide, ob die ID prim ist.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn eine Zahl aus zwei groesseren Faktoren gebaut ist, hat sie auch einen Faktor auf der kleineren Seite der Quadratwurzel. Deshalb musst du nicht bis 96 testen.
 *
 * -- Essayons a la main --
 * sqrt(97) < 10. Teste 2..9; kein Rest 0 -> prim.
 *
 * -- Le plan --
 * 1. Setze n=97.
 * 2. Setze `prime = n >= 2`.
 * 3. Berechne die ganzzahlige Grenze aus sqrt.
 * 4. Teste Teiler 2 bis Grenze.
 * 5. Bei Treffer: prime=false und break.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Spaeter waere `isPrime` eine gute Methode. Hier bleibt der Algorithmus im main, weil Methoden noch nicht das Lernziel sind.
 *
 * Exemples a verifier :
 * - 97 -> prim
 * - 91 -> nicht prim (Teiler 7)
 * - 2 -> prim
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Nutze `(long) Math.sqrt(n)` fuer die Grenze.
 * - Sobald ein Teiler gefunden ist, kann die Suche enden.
 */
void main() {
    long n = 97;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(prime ? "Primzahl" : "Keine Primzahl");
    ExerciseChecker.check("97 ist prim", prime);
    ExerciseChecker.summary();
}
