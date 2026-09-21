/**
 * EXERCICE 21 - Versandlabel mit ternärem Operator erzeugen
 * ========================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Pakete ab 20 kg brauchen das Label `SCHWER`, leichtere Pakete das Label `STANDARD`. Der Wert soll als Ausdruck berechnet werden.
 *
 * Notions du cours :
 * ternaerer Operator `?:`, Vergleich, String-Ergebnis.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne das Label ohne `if`.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du hast genau zwei Aufkleber. Eine einzige Ja/Nein-Frage entscheidet, welcher genommen wird.
 *
 * -- Essayons a la main --
 * gewicht=24 -> 24>=20 ist true -> `SCHWER`.
 *
 * -- Le plan --
 * 1. Speichere das Gewicht.
 * 2. Formuliere die Bedingung `gewicht >= 20`.
 * 3. Setze true-Text und false-Text.
 * 4. Speichere das Ergebnis in `label`.
 * 5. Pruefe `SCHWER`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Der ternäre Operator ist selbst bereits ein kompakter Entscheidungs-Ausdruck.
 *
 * Exemples a verifier :
 * - 24 -> SCHWER
 * - 12 -> STANDARD
 * - 20 -> SCHWER
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Form: `bedingung ? wertWennTrue : wertWennFalse`.
 * - Beide Zweige liefern hier Strings.
 */
void main() {
    int gewicht = 24;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(label);
    ExerciseChecker.check("Schweres Paket", label.equals("SCHWER"));
    ExerciseChecker.summary();
}
