/**
 * Corrige du mini-projet 01.
 * A consulter seulement apres votre propre implementation.
 */
void main() {
    while (true) {
        IO.println("""
                === IT-WARTUNGSKONSOLE ===
                1 - Statuscode klassifizieren
                2 - Geraete-ID auf Primzahl pruefen
                3 - Wartungsintervalle synchronisieren
                0 - Beenden
                """);

        int wahl = Simput.gint("Wahl: ");

        switch (wahl) {
            case 1 -> {
                int code = Simput.gint("Statuscode: ");

                String text = switch (code) {
                    case 0 -> "OK";
                    case 1 -> "WARNUNG";
                    case 2 -> "FEHLER";
                    default -> "UNBEKANNT";
                };

                IO.println(text);
            }

            case 2 -> {
                long n = Simput.glong("Geraete-ID: ");

                if (n < 2) {
                    IO.println("Keine Primzahl.");
                    continue;
                }

                boolean prime = true;
                long grenze = (long) Math.sqrt(n);

                for (long i = 2; i <= grenze; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }

                IO.println(prime ? "Primzahl" : "Keine Primzahl");
            }

            case 3 -> {
                long a = Simput.glong("Intervall A: ");
                long b = Simput.glong("Intervall B: ");

                if (a <= 0 || b <= 0) {
                    IO.println("Nur positive Intervalle.");
                    continue;
                }

                long x = a;
                long y = b;

                while (y != 0) {
                    long rest = x % y;
                    x = y;
                    y = rest;
                }

                IO.println("Gemeinsames Raster (GGT): " + x);
            }

            case 0 -> {
                IO.println("Programm beendet.");
                return;
            }

            default -> IO.println("Unbekannte Wahl.");
        }
    }
}
