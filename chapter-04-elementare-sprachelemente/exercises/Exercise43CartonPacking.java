/**
 * EXERCICE 43 - Lagerlogistik: Kartons optimal fuellen
 * ===================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * 137 identische Artikel sollen in Kartons mit Kapazitaet 24 verpackt werden. Das Lager braucht volle Kartons, Restartikel und die tatsaechlich benoetigte Kartonzahl.
 *
 * Notions du cours :
 * Ganzzahldivision, Restoperator, Bedingung fuer angebrochenen Karton.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne volle Kartons, Rest und Gesamtzahl benoetigter Kartons.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du fuellst so viele volle Kartons wie moeglich. Wenn danach auch nur ein Artikel uebrig ist, brauchst du noch einen weiteren Karton.
 *
 * -- Essayons a la main --
 * 137 / 24 = 5 volle Kartons, Rest 17. Weil Rest > 0, Gesamt = 6.
 *
 * -- Le plan --
 * 1. Speichere Artikelzahl und Kapazitaet.
 * 2. Berechne volle Kartons mit `/`.
 * 3. Berechne Rest mit `%`.
 * 4. Setze Gesamt auf volle Kartons plus eventuell 1.
 * 5. Pruefe 5 / 17 / 6.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Diese kleine Kapazitaetsrechnung ist ein zusammenhaengender Algorithmus.
 *
 * Exemples a verifier :
 * - 137,24 -> voll=5 rest=17 gesamt=6
 * - 48,24 -> voll=2 rest=0 gesamt=2
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ein angebrochener Karton ist nur bei `rest > 0` noetig.
 * - Der ternäre Operator passt hier gut fuer die zusaetzliche 1.
 */
void main() {
    int artikel = 137;
    int kapazitaet = 24;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Volle Kartons", voll == 5);
    ExerciseChecker.check("Rest", rest == 17);
    ExerciseChecker.check("Gesamt", gesamt == 6);
    ExerciseChecker.summary();
}
