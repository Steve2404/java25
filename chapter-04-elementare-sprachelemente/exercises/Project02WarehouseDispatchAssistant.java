/**
 * MINI-PROJET 02 - Lager- und Versandassistent
 * =============================================
 *
 * Niveau : difficile
 *
 * Situation reelle :
 * Ein Lager soll fuer einen Auftrag berechnen:
 * - wie viele Kartons benoetigt werden,
 * - wie viele Artikel im letzten Karton liegen,
 * - ob das Paket STANDARD oder SCHWER ist,
 * - wie viel Gesamtgewicht versendet wird.
 *
 * Bekannte Notions:
 * Simput, int, double, final, /, %, ternaerer Operator, if, printf.
 *
 * ==================================================================
 * TODO 1 : Kapazitaetsplanung
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du fuellst zuerst volle Kartons. Bleibt etwas uebrig, brauchst du einen
 * weiteren Karton. Das ist dieselbe Idee wie bei Division und Rest.
 *
 * -- Essayons a la main --
 * 137 Artikel, 24 pro Karton -> 5 volle Kartons, Rest 17, gesamt 6.
 *
 * -- Le plan --
 * 1. Artikelzahl und Kapazitaet lesen.
 * 2. Volle Kartons mit Ganzzahldivision berechnen.
 * 3. Rest mit % berechnen.
 * 4. Bei Rest > 0 einen weiteren Karton zaehlen.
 * 5. Ergebnis ausgeben.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Spaeter ja; hier soll die Arithmetik direkt sichtbar bleiben.
 *
 * ==================================================================
 * TODO 2 : Gewicht und Versandklasse
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Jeder Artikel wiegt gleich viel. Gesamtgewicht ist Anzahl mal Einzelgewicht.
 * Ab 20 kg bekommt der Versand ein anderes Label.
 *
 * -- Essayons a la main --
 * 137 Artikel * 0.18 kg = 24.66 kg -> SCHWER.
 *
 * -- Le plan --
 * 1. Einzelgewicht als double lesen.
 * 2. Gesamtgewicht berechnen.
 * 3. Mit ternaerem Operator STANDARD/SCHWER bestimmen.
 * 4. Gewicht mit zwei Nachkommastellen ausgeben.
 * 5. Alle Resultate zusammen anzeigen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Noch nicht. Es sind zwei zusammenhaengende Schritte desselben Versandauftrags.
 *
 * Indices techniques Java :
 * - Nutze int fuer Artikel/Kartons.
 * - Nutze double fuer Gewicht.
 * - Der Ausdruck rest > 0 ? 1 : 0 kann den Zusatzkarton ausdruecken.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.

    // TODO 2
    // Ecris ton code ici.
}
