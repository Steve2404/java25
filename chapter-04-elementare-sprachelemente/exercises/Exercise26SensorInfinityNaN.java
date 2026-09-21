/**
 * EXERCICE 26 - Sensor-Sonderwerte Infinity und NaN erkennen
 * =========================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Messalgorithmus teilt Gleitkommawerte durch 0. Statt sofort abzustuerzen entstehen IEEE-754-Sonderwerte, die das Monitoring erkennen soll.
 *
 * Notions du cours :
 * `double`, Division durch 0.0, `Infinity`, `NaN`, `Double.isInfinite`, `Double.isNaN`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Erzeuge je einen unendlichen und einen NaN-Wert und erkenne beide stabil.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Bei Gleitkommazahlen hat Java besondere Schilder fuer `unendlich` und `keine normale Zahl`. Diese Schilder sind Werte im Rechenmodell.
 *
 * -- Essayons a la main --
 * 1.0/0.0 -> Infinity. 0.0/0.0 -> NaN.
 *
 * -- Le plan --
 * 1. Berechne `infinite`.
 * 2. Berechne `notANumber`.
 * 3. Pruefe den ersten mit `Double.isInfinite`.
 * 4. Pruefe den zweiten mit `Double.isNaN`.
 * 5. Gib beide aus.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Zwei Sonderwerte werden direkt beobachtet.
 *
 * Exemples a verifier :
 * - 1.0/0.0 -> Infinity
 * - 0.0/0.0 -> NaN
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Vergleiche NaN nicht mit `== NaN`.
 * - Nutze die dafuer vorgesehenen `Double`-Pruefmethoden.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(infinite);
    IO.println(notANumber);
    ExerciseChecker.check("Infinity erkannt", Double.isInfinite(infinite));
    ExerciseChecker.check("NaN erkannt", Double.isNaN(notANumber));
    ExerciseChecker.summary();
}
