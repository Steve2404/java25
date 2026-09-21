/**
 * EXERCICE 46 - Pruefziffer aus Dezimalziffern berechnen
 * =====================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Eine einfache interne Inventarnummer 48317 soll eine Kontrollziffer bekommen. Dazu werden alle Dezimalziffern addiert und die Summe modulo 10 genommen.
 *
 * Notions du cours :
 * `while`, `% 10`, `/ 10`, Akkumulator, Algorithmik.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne fuer 48317 die Ziffernsumme und daraus die Kontrollziffer.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du nimmst immer die letzte Ziffer ab, legst sie auf einen Summenstapel und schneidest sie danach von der Zahl weg.
 *
 * -- Essayons a la main --
 * 48317 -> 7+1+3+8+4=23 -> 23%10=3.
 *
 * -- Le plan --
 * 1. Kopiere die Nummer in eine Arbeitsvariable.
 * 2. Setze Summe auf 0.
 * 3. Hole letzte Ziffer mit `% 10`.
 * 4. Entferne letzte Ziffer mit `/= 10`.
 * 5. Nach der Schleife: checksum=summe%10.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Ja, als spaetere wiederverwendbare Funktion waere die Pruefziffer eine gute Box. In diesem Kapitel implementieren wir sie noch direkt.
 *
 * Exemples a verifier :
 * - 48317 -> Summe 23 -> Checksum 3
 * - 1000 -> Summe 1 -> Checksum 1
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Bei positiver Ganzzahl entfernt Ganzzahldivision durch 10 die letzte Dezimalziffer.
 * - Der Rest durch 10 liefert die letzte Ziffer.
 */
void main() {
    long inventar = 48317;
    long arbeit = inventar;
    int summe = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Ziffernsumme 23", summe == 23);
    ExerciseChecker.check("Checksum 3", checksum == 3);
    ExerciseChecker.summary();
}
