/**
 * EXERCICE 47 - Parkgebuehr aus Dauer berechnen
 * ============================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Parkhaus verlangt fuer die erste angefangene Stunde 2.00 Euro. Jede weitere angefangene Stunde kostet 1.50 Euro. Ein Fahrzeug war 5 Stunden dort.
 *
 * Notions du cours :
 * if, Ganzzahlwerte fuer Stunden, gemischte Rechnung mit double.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne fuer 5 Stunden eine Gebuehr von 8.00 Euro.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Die erste Stunde hat einen eigenen Preis. Danach zaehlst du nur noch die zusaetzlichen Stunden und multiplizierst sie mit ihrem Preis.
 *
 * -- Essayons a la main --
 * erste Stunde 2.00 + 4 weitere * 1.50 = 8.00.
 *
 * -- Le plan --
 * 1. Speichere Stunden=5.
 * 2. Behandle 0 Stunden als 0 Gebuehr.
 * 3. Bei mindestens 1 Stunde starte mit 2.00.
 * 4. Addiere `(stunden-1)*1.50`.
 * 5. Pruefe 8.00.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Tarifregel ist noch klein genug fuer einen lesbaren if-Block.
 *
 * Exemples a verifier :
 * - 0 -> 0.00
 * - 1 -> 2.00
 * - 5 -> 8.00
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Nutze `double gebuehr`.
 * - Die zusaetzlichen Stunden sind `stunden - 1`.
 */
void main() {
    int stunden = 5;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.printf("Gebuehr: %.2f Euro%n", gebuehr);
    ExerciseChecker.check("5 Stunden kosten 8 Euro", gebuehr == 8.0);
    ExerciseChecker.summary();
}
