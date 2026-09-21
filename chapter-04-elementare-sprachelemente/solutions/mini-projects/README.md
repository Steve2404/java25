# Lösungen — Mini-Projekte Kapitel 4

# P01 — Zahlenlabor

```java
import javax.swing.*;

void main() {
    while (true) {
        IO.println("""
                
                ===== ZAHLENLABOR =====
                1 - Zahl analysieren
                2 - Primzahl prüfen
                3 - GGT berechnen
                4 - GUI-Zahl verdoppeln
                0 - Beenden
                """);

        int wahl = Simput.gint("Wahl: ");

        switch (wahl) {
            case 1 -> {
                long zahl = Simput.glong("Zahl: ");

                String paritaet =
                        zahl % 2 == 0 ? "gerade" : "ungerade";

                String vorzeichen =
                        zahl > 0 ? "positiv"
                      : zahl < 0 ? "negativ"
                      : "null";

                double quadrat = (double) zahl * zahl;

                IO.println("Parität: " + paritaet);
                IO.println("Vorzeichen: " + vorzeichen);
                IO.println("Quadrat: " + quadrat);
            }

            case 2 -> {
                long n = Simput.glong("n >= 2: ");

                if (n < 2) {
                    IO.println("Ungültig.");
                    continue;
                }

                long grenze = (long) Math.sqrt(n);
                boolean teiler = false;

                for (long i = 2; i <= grenze; i++) {
                    if (n % i == 0) {
                        teiler = true;
                        IO.println("Teiler: " + i);
                        break;
                    }
                }

                IO.println(
                        teiler ? "Keine Primzahl." : "Primzahl."
                );
            }

            case 3 -> {
                long a = Simput.glong("a: ");
                long b = Simput.glong("b: ");

                if (a <= 0 || b <= 0) {
                    IO.println("Nur positive Werte.");
                    continue;
                }

                long x = a;
                long y = b;

                while (y != 0) {
                    long rest = x % y;
                    x = y;
                    y = rest;
                }

                IO.println("GGT: " + x);
            }

            case 4 -> {
                String text = JOptionPane.showInputDialog(
                        null,
                        "Ganze Zahl:",
                        "GUI-Eingabe",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (text == null) {
                    continue;
                }

                long n = Long.parseLong(text);
                long doppelt = n * 2;

                JOptionPane.showMessageDialog(
                        null,
                        "Doppelt: " + doppelt,
                        "Ergebnis",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            case 0 -> {
                int result = JOptionPane.showConfirmDialog(
                        null,
                        "Programm wirklich beenden?",
                        "Beenden",
                        JOptionPane.YES_NO_OPTION
                );

                if (result == JOptionPane.YES_OPTION) {
                    return;
                }
            }

            default -> IO.println("Ungültige Auswahl.");
        }
    }
}
```

---

# P02 — Konsolen-Taschenrechner mit Statistik

```java
void main() {
    int rechnungen = 0;
    int divisionen = 0;
    int positiv = 0;
    int negativ = 0;
    int nullErgebnisse = 0;

    char weiter;

    do {
        double a = Simput.gdouble("a: ");
        char op = Simput.gchar("Operator (+,-,*,/,%): ");
        double b = Simput.gdouble("b: ");

        boolean gueltig = true;
        double result = 0.0;

        switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;

            case '/' -> {
                if (b == 0.0) {
                    IO.println("Division durch 0 nicht erlaubt.");
                    gueltig = false;
                } else {
                    result = a / b;
                    divisionen++;
                }
            }

            case '%' -> {
                if (b == 0.0) {
                    IO.println("Modulo durch 0 nicht erlaubt.");
                    gueltig = false;
                } else {
                    result = a % b;
                }
            }

            default -> {
                IO.println("Unbekannter Operator.");
                gueltig = false;
            }
        }

        if (gueltig) {
            rechnungen++;
            IO.println("Ergebnis: " + result);

            if (result > 0) {
                positiv++;
            } else if (result < 0) {
                negativ++;
            } else {
                nullErgebnisse++;
            }
        }

        weiter = Simput.gchar("Weiter? (j/n): ");

    } while (weiter == 'j' || weiter == 'J');

    IO.println("Rechnungen: " + rechnungen);
    IO.println("Divisionen: " + divisionen);
    IO.println("Positive Ergebnisse: " + positiv);
    IO.println("Negative Ergebnisse: " + negativ);
    IO.println("Null-Ergebnisse: " + nullErgebnisse);
}
```

## Warum diese Struktur?
- `do-while` garantiert mindestens eine Rechnung.
- `switch` trennt die Operatorfälle.
- `gueltig` verhindert, dass fehlerhafte Operationen in die Statistik eingehen.
- Die Statistik benutzt einfache Zähler und Bedingungen.
