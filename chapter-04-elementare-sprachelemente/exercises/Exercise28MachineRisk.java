/**
 * EXERCICE 28 - Maschinenrisiko mit if/else klassifizieren
 * =======================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Eine Maschine meldet Temperatur. Unter 60 Grad ist der Zustand `NORMAL`, von 60 bis unter 80 `WARNUNG`, ab 80 `KRITISCH`.
 *
 * Notions du cours :
 * `if`, `else if`, `else`, geordnete Wertebereiche.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Klassifiziere 83 Grad korrekt als `KRITISCH`.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du hast drei Schubladen fuer Temperaturen. Jede Zahl darf genau in eine Schublade.
 *
 * -- Essayons a la main --
 * 83 >= 80 -> direkt KRITISCH.
 *
 * -- Le plan --
 * 1. Speichere die Temperatur.
 * 2. Pruefe zuerst die kritischste Grenze.
 * 3. Pruefe danach die Warnungsgrenze.
 * 4. Nutze `else` fuer den Rest.
 * 5. Speichere den Text in `status`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Reihenfolge der Bedingungen ist selbst Teil der Geschaeftslogik.
 *
 * Exemples a verifier :
 * - 50 -> NORMAL
 * - 60 -> WARNUNG
 * - 79 -> WARNUNG
 * - 80 -> KRITISCH
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Pruefe von spezifischer/hoeherer Gefahr nach unten.
 * - Jeder Pfad setzt denselben Ergebnis-String.
 */
void main() {
    int temperatur = 83;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(status);
    ExerciseChecker.check("83 ist kritisch", status.equals("KRITISCH"));
    ExerciseChecker.summary();
}
