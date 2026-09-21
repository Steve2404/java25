/**
 * Corrige du mini-projet 03.
 */
void main() {
    double[] historie = {10, 12, 11, 13, 9, 10, 11};
    double heute = 24.0;

    double summe = 0.0;
    double maximum = historie[0];
    int hoheTage = 0;

    for (double wert : historie) {
        summe += wert;

        if (wert > maximum) {
            maximum = wert;
        }

        if (wert > 12.0) {
            hoheTage++;
        }
    }

    double durchschnitt = summe / historie.length;
    double grenze = durchschnitt * 1.5;
    boolean anomalie = heute > grenze;

    IO.printf("Durchschnitt: %.3f%n", durchschnitt);
    IO.printf("Maximum: %.1f%n", maximum);
    IO.println("Tage > 12: " + hoheTage);
    IO.printf("Heute: %.1f%n", heute);
    IO.println("Anomalie: " + anomalie);
}
