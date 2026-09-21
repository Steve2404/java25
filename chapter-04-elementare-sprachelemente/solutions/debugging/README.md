# Lösungen — Debugging Pack Kapitel 4

## D01
Kompiliert nicht. `3.14` ist `double`. Korrekt: `float f = 3.14F;`.

## D02
Kompiliert nicht. `x` ist außerhalb seines Block-Scope nicht sichtbar.

## D03
Kompiliert, aber logisch falsch. `aktiv = false` ist eine Zuweisung. Korrekt z. B. `if (aktiv)`.

## D04
Kompiliert, Ergebnis `2.0`. Die Ganzzahldivision passiert vor dem Cast. Für `2.5`: `5.0 / 2`.

## D05
Kompiliert nicht. `a+b` ist `int`. Korrekt: `int c = a+b;`.

## D06
Kompiliert, aber Endlosschleife. `i` wird nie verändert.

## D07
Kompiliert, aber Endlosschleife. Das `;` ist der leere Schleifenrumpf.

## D08
Kompiliert; `text` endet als `"C"` wegen Fall-through.

## D09
Kompiliert; Ausgabe `0`, `2`. `continue` überspringt nur den restlichen Rumpf.

## D10
Kompiliert; zur Laufzeit `NumberFormatException`.

## D11
Kompiliert; bei Abbrechen kann `s == null` sein. `parseLong(null)` führt im behandelten Fall zu `NumberFormatException`.

## D12
Kompiliert, aber semantisch falsch. Vergleiche mit `JOptionPane.YES_OPTION`, nicht mit `YES_NO_OPTION`.

## D13
Kompiliert nicht. `showMessageDialog()` liefert `void`.

## D14
Kompiliert nicht. `showInputDialog()` liefert `String`, nicht `long`.

## D15
Kompiliert und läuft. `y == Integer.MIN_VALUE` wegen Overflow.

## D16
Kompiliert; Bedingung ist typischerweise `false` wegen binärer Floating-Point-Darstellung.
