/**
 * EXERCICE 19 - Durchschnitt ohne Ganzzahldivisionsfehler
 * ======================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Helpdesk berechnet die durchschnittliche Bearbeitungszeit aus 7 Minuten fuer 2 Tickets. Der Bericht darf nicht 3.0 statt 3.5 anzeigen.
 *
 * Notions du cours :
 * Ganzzahldivision, Cast-Zeitpunkt, `double`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne den exakten Durchschnitt 3.5, ohne erst Nachkommastellen zu verlieren.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn du 7 Bonbons auf 2 Personen verteilst und zuerst nur ganze Bonbons erlaubst, bleiben halbe Bonbons unsichtbar. Du musst die Rechnung frueh genug als Dezimalrechnung behandeln.
 *
 * -- Essayons a la main --
 * 7 / 2 = 3 bei int. Aber 7.0 / 2 = 3.5.
 *
 * -- Le plan --
 * 1. Speichere Summe und Anzahl als int.
 * 2. Sorge vor der Division fuer einen double-Operanden.
 * 3. Berechne `average`.
 * 4. Gib den Wert aus.
 * 5. Pruefe 3.5.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die zentrale Frage ist genau der Typ im Divisionsmoment.
 *
 * Exemples a verifier :
 * - 7 / 2 als int -> 3
 * - 7.0 / 2 -> 3.5
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ein Cast auf einen Operanden vor der Division reicht.
 * - Ein Cast erst nach `7 / 2` kommt zu spaet.
 */
void main() {
    int gesamtMinuten = 7;
    int tickets = 2;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(average);
    ExerciseChecker.check("Durchschnitt 3.5", average == 3.5);
    ExerciseChecker.summary();
}
