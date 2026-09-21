/**
 * Corrige du mini-projet 02.
 */
void main() {
    int artikel = Simput.gint("Artikelzahl: ");
    int kapazitaet = Simput.gint("Kapazitaet pro Karton: ");
    double einzelgewicht = Simput.gdouble("Gewicht pro Artikel (kg): ");

    int volleKartons = artikel / kapazitaet;
    int rest = artikel % kapazitaet;
    int kartonsGesamt = volleKartons + (rest > 0 ? 1 : 0);

    double gesamtgewicht = artikel * einzelgewicht;
    String klasse = gesamtgewicht >= 20.0 ? "SCHWER" : "STANDARD";

    IO.println("Volle Kartons: " + volleKartons);
    IO.println("Restartikel: " + rest);
    IO.println("Kartons gesamt: " + kartonsGesamt);
    IO.printf("Gesamtgewicht: %.2f kg%n", gesamtgewicht);
    IO.println("Versandklasse: " + klasse);
}
