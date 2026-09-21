/**
 * MINI-PROJET 03 - Energie-Monitor fuer einen Serverraum
 * =======================================================
 *
 * Niveau : moyen -> difficile
 *
 * Situation reelle :
 * Ein Serverraum besitzt sieben historische Tageswerte. Das Programm soll
 * Durchschnitt, Maximum, Anzahl hoher Tage und eine heutige Anomalie bestimmen.
 *
 * Bekannte Notions:
 * Arrays, Enhanced-for, double, if, Akkumulatoren, Vergleiche, printf.
 *
 * ==================================================================
 * TODO 1 : Historische Werte analysieren
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du hast sieben Messkarten. Du willst wissen, wie viel sie zusammen ergeben,
 * welche Karte am groessten ist und wie oft ein Wert ueber 12 liegt.
 *
 * -- Essayons a la main --
 * Werte: 10, 12, 11, 13, 9, 10, 11
 * Summe = 76, Maximum = 13, ueber 12 = 1.
 *
 * -- Le plan --
 * 1. Summe auf 0 setzen.
 * 2. Maximum sinnvoll initialisieren.
 * 3. Mit Enhanced-for alle Werte durchlaufen.
 * 4. Summe, Maximum und Hoch-Tage aktualisieren.
 * 5. Durchschnitt berechnen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Spaeter ja: Durchschnitt und Maximum koennten eigene Methoden sein.
 * Hier trainieren wir zuerst den Schleifenmechanismus direkt.
 *
 * ==================================================================
 * TODO 2 : Heutigen Wert als Anomalie klassifizieren
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Heute ist nur dann auffaellig, wenn der Verbrauch mehr als die Haelfte
 * ueber dem normalen Durchschnitt liegt.
 *
 * -- Essayons a la main --
 * Durchschnitt etwa 10.857; Grenze etwa 16.286; heute 24 -> Anomalie.
 *
 * -- Le plan --
 * 1. Grenze = durchschnitt * 1.5.
 * 2. Heute mit Grenze vergleichen.
 * 3. boolean anomalie speichern.
 * 4. Bericht mit printf ausgeben.
 * 5. Das Ergebnis sprachlich erklaeren.
 *
 * Indices techniques Java :
 * - Enhanced-for: for (double wert : historie).
 * - Fuer den Durchschnitt durch historie.length teilen.
 */
void main() {
    double[] historie = {10, 12, 11, 13, 9, 10, 11};
    double heute = 24.0;

    // TODO 1
    // Ecris ton code ici.

    // TODO 2
    // Ecris ton code ici.
}
