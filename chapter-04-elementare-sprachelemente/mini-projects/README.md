# Mini-Projekte — Kapitel 4

Diese Projekte verbinden mehrere Themen gleichzeitig.  
Lösungen: [../solutions/mini-projects/README.md](../solutions/mini-projects/README.md)

---

# P01 — Zahlenlabor

## Ziel
Baue ein wiederholtes Konsolenmenü:

1. Zahl analysieren
2. Primzahl prüfen
3. GGT berechnen
4. GUI-Zahl einlesen und verdoppeln
0. Programm beenden

## Anforderungen
- `while(true)` als Hauptmenü
- moderner `switch`
- `Simput` für Konsoleneingaben
- `JOptionPane` für GUI-Funktion und Beenden-Bestätigung
- Parität mit `%`
- Primzahlprüfung bis `sqrt(n)`
- GGT mit Euklid / Modulo
- `break`, `continue` oder `return` nur mit klarer Begründung
- keine Konzepte aus späteren Kapiteln

## TODO
- [ ] Menü ausgeben
- [ ] Menüwahl lesen
- [ ] Case 1: Vorzeichen, Parität, Quadrat
- [ ] Case 2: Primzahl
- [ ] Case 3: GGT
- [ ] Case 4: GUI-Eingabe → String → long → Ergebnis
- [ ] Case 0: ConfirmDialog
- [ ] ungültige Menüwahl behandeln
- [ ] mindestens 8 Testfälle dokumentieren

## Testfälle
- Analyse: `-7`, `0`, `12`
- Primzahl: `2`, `21`, `29`
- GGT: `48/18`
- GUI: `12`
- Ende: Ja / Nein

---

# P02 — Konsolen-Taschenrechner mit Statistik

## Ziel
Baue einen Taschenrechner, der wiederholt zwei Zahlen und eine Operation verarbeitet.

Unterstützte Operationen:
- `+`
- `-`
- `*`
- `/`
- `%`

Zusätzlich soll das Programm mitzählen:
- wie viele Rechnungen durchgeführt wurden,
- wie oft Division gewählt wurde,
- wie viele Ergebnisse positiv, negativ oder null waren.

## Anforderungen
- Eingaben mit `Simput`
- Operation über `char`
- Auswahl über `switch`
- Wiederholung mit Schleife
- Division durch 0 vor der Berechnung prüfen
- nach jeder Rechnung fragen, ob weitergerechnet werden soll
- am Ende Statistik ausgeben

## TODO
- [ ] Zähler initialisieren
- [ ] zwei Zahlen lesen
- [ ] Operator lesen
- [ ] switch schreiben
- [ ] Division/Modulo durch 0 behandeln
- [ ] Ergebnis klassifizieren
- [ ] Gesamtzähler aktualisieren
- [ ] Weiterfrage
- [ ] Abschlussstatistik ausgeben

## Beispiel
```text
a: 10
Operator: /
b: 2
Ergebnis: 5.0

Weiter? j

a: -3
Operator: *
b: 4
Ergebnis: -12.0

Weiter? n

Rechnungen: 2
Divisionen: 1
Positive Ergebnisse: 1
Negative Ergebnisse: 1
Null-Ergebnisse: 0
```

## Randfälle
- Division durch 0
- Modulo durch 0
- unbekannter Operator
- Ergebnis 0
- negative Operanden
