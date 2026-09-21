/**
 * EXERCICE 29 - Statuscodes mit moderner switch-Expression routen
 * ==============================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein interner Dienst liefert Codes 0, 1, 2 oder andere Werte. Das Monitoring soll daraus `OK`, `WARNUNG`, `FEHLER` oder `UNBEKANNT` erzeugen.
 *
 * Notions du cours :
 * moderne `switch`-Expression, Arrow-Cases, `default`, Rueckgabewert.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Erzeuge den Status-String fuer Code 2 mit einer switch-Expression.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Stell dir einen Verteiler mit beschrifteten Ausgaengen vor. Der Code nimmt genau einen passenden Ausgang und liefert dort einen Text.
 *
 * -- Essayons a la main --
 * code=2 -> case 2 -> FEHLER.
 *
 * -- Le plan --
 * 1. Speichere den Code.
 * 2. Starte eine switch-Expression.
 * 3. Definiere die bekannten Codes.
 * 4. Fuege `default` hinzu.
 * 5. Speichere das Ergebnis in `text`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Der switch selbst ist die Entscheidungsbox.
 *
 * Exemples a verifier :
 * - 0 -> OK
 * - 1 -> WARNUNG
 * - 2 -> FEHLER
 * - 9 -> UNBEKANNT
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Syntax: `String text = switch (code) { ... };`.
 * - Arrow-Cases fallen nicht in den naechsten Fall durch.
 */
void main() {
    int code = 2;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(text);
    ExerciseChecker.check("Code 2", text.equals("FEHLER"));
    ExerciseChecker.summary();
}
