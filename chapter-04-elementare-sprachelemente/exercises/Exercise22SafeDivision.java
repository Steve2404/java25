/**
 * EXERCICE 22 - Sichere Division mit Short-Circuit
 * ===============================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Diagnoseprogramm soll pruefen, ob `100 / divisor` groesser als 10 ist. Bei divisor 0 darf die Division ueberhaupt nicht ausgefuehrt werden.
 *
 * Notions du cours :
 * `&&`, Short-Circuit-Auswertung, Division durch null vermeiden.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Baue eine einzige boolesche Bedingung, die zuerst den Divisor schuetzt.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Bevor du durch eine Zahl teilst, schaust du zuerst, ob dort ueberhaupt etwas anderes als Null steht. Wenn die erste Tuer schon sagt `Nein`, gehst du nicht mehr durch die zweite.
 *
 * -- Essayons a la main --
 * divisor=0 -> erste Bedingung false -> rechte Division wird nicht ausgewertet -> safe=false.
 *
 * -- Le plan --
 * 1. Speichere divisor=0.
 * 2. Pruefe links `divisor != 0`.
 * 3. Verbinde mit `&&`.
 * 4. Setze rechts den eigentlichen Divisionsvergleich.
 * 5. Pruefe, dass das Programm ohne Exception false liefert.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Gerade die eine kombinierte Bedingung demonstriert Short-Circuit.
 *
 * Exemples a verifier :
 * - divisor=0 -> false ohne Exception
 * - divisor=5 -> 100/5=20 -> true
 * - divisor=20 -> 5>10 -> false
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Bei `a && b` wird `b` nur ausgewertet, wenn `a` true ist.
 * - Setze die sichere Vorbedingung links.
 */
void main() {
    int divisor = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Null sicher abgefangen", !safe);
    ExerciseChecker.summary();
}
