/**
 * EXERCICE 05 - Rechnungszeile korrekt berechnen
 * =============================================
 *
 * Niveau : facile -> moyen
 *
 * Histoire :
 * Ein Kassentool soll `3 Artikel x 12 Euro = 36 Euro` anzeigen. Eine falsche String-Verkettung darf die Rechnung nicht in Textstuecke zerlegen.
 *
 * Notions du cours :
 * `IO.println`, `+`, String-Verkettung, Klammern, Auswertungsreihenfolge.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne zuerst den numerischen Gesamtpreis und baue danach die Rechnungszeile.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn du zu frueh Text an eine Zahl klebst, klebt Java spaetere Zahlen vielleicht nur noch als Zeichen hinten dran. Rechne deshalb zuerst, schreibe danach den Satz.
 *
 * -- Essayons a la main --
 * 3 * 12 = 36. Erst danach: `3 Artikel x 12 Euro = 36 Euro`.
 *
 * -- Le plan --
 * 1. Speichere `anzahl` und `preis`.
 * 2. Berechne `gesamt` numerisch.
 * 3. Baue `zeile` als String.
 * 4. Gib `zeile` aus.
 * 5. Pruefe Zahl und Text getrennt.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Rechnung und Darstellung sind zwei mentale Schritte, aber noch keine eigenen Methoden.
 *
 * Exemples a verifier :
 * - 3 und 12 -> 36
 * - 1 und 7 -> 7
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Multiplikation hat hoehere Praezedenz als String-Verkettung.
 * - Eine eigene Zwischenvariable fuer `gesamt` macht die Absicht klar.
 */
void main() {
    int anzahl = 3;
    int preis = 12;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(zeile);
    ExerciseChecker.check("Gesamtpreis", gesamt == 36);
    ExerciseChecker.check("Rechnungszeile", zeile.equals("3 Artikel x 12 Euro = 36 Euro"));
    ExerciseChecker.summary();
}
