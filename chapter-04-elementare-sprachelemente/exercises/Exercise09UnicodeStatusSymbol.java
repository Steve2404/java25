/**
 * EXERCICE 09 - Unicode-Statussymbol verarbeiten
 * =============================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein altes Geraet liefert den Code 65 fuer seinen Statusbuchstaben. Das Programm soll sowohl das Zeichen als auch den numerischen Code anzeigen.
 *
 * Notions du cours :
 * `char`, Unicode-Codewert, Widening `char -> int`.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Speichere 65 als `char`, ueberfuehre das Zeichen nach `int` und pruefe beide Sichtweisen.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Ein `char` ist wie eine Nummer mit einem Zeichenschild. Die Nummer 65 traegt hier das Schild `A`.
 *
 * -- Essayons a la main --
 * 65 als `char` -> 'A'. Dasselbe `char` nach `int` -> 65.
 *
 * -- Le plan --
 * 1. Deklariere `char status` aus dem konstanten Wert 65.
 * 2. Deklariere `int code` aus `status`.
 * 3. Gib Zeichen und Code aus.
 * 4. Pruefe beide Werte.
 * 5. Notiere mental die alternative Schreibweise `\u0041`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Eine Variable zeigt denselben Wert in zwei Darstellungsformen.
 *
 * Exemples a verifier :
 * - 65 -> A
 * - `'A'` nach int -> 65
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Eine passende konstante Ganzzahl kann direkt einem `char` zugewiesen werden.
 * - `char` kann erweiternd nach `int` konvertiert werden.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(status);
    IO.println(code);
    ExerciseChecker.check("Zeichen A", status == 'A');
    ExerciseChecker.check("Code 65", code == 65);
    ExerciseChecker.summary();
}
