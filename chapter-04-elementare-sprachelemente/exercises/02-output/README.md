# 02 — Ausgabe und Formatierung

Nur Aufgaben. Lösungen liegen gespiegelt unter `solutions/02-output`.

---

## E06 — Mehrzeilige Ausgabe exakt planen

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Erzeuge exakt drei Zeilen: `Java`, `25`, `Start!`.

### 2. Eingaben / Ausgaben
Keine Eingabe. Drei Zeilen Ausgabe.

### 3. Constraints / Randfälle
Genau drei `IO.println()`-Aufrufe.

### 4. Teilaufgaben
- [ ] drei Ausgaben schreiben
- [ ] Reihenfolge prüfen
- [ ] keine Zusatzleerzeile
- [ ] exakt vergleichen
- [ ] Unterschied zu `print` erklären

### 5. Denkweg
`println` schreibt Inhalt plus Zeilenumbruch.

### 6. Pseudocode
```text
"Java" AUSGEBEN
"25" AUSGEBEN
"Start!" AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    // TODO
}
```

### 8. Schnelltests
- 3 Zeilen
- keine vierte Leerzeile

---

## E07 — String-Verkettung und Rechnen

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Sorge dafür, dass `3.3 + 2 = 5.3` ausgegeben wird.

### 2. Eingaben / Ausgaben
Keine Eingabe.

### 3. Constraints / Randfälle
Nur Klammern und `IO.println` verwenden.

### 4. Teilaufgaben
- [ ] fehlerhafte Variante analysieren
- [ ] numerischen Teilausdruck isolieren
- [ ] Klammern setzen
- [ ] Ausgabe prüfen
- [ ] Linksassoziativität erklären

### 5. Denkweg
Sobald links ein String entstanden ist, wird `+` zur Verkettung.

### 6. Pseudocode
```text
SUMME = 3.3 + 2
TEXT + SUMME AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    IO.println("3.3 + 2 = " + /* TODO */);
}
```

### 8. Schnelltests
- Ausgabe endet mit `5.3`
- Zahl nicht als fertigen String eintragen

---

## E08 — Math.PI mit printf

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Gib `Math.PI` rechtsbündig in einem Feld der Breite 12 mit fünf Nachkommastellen aus.

### 2. Eingaben / Ausgaben
Keine Eingabe.

### 3. Constraints / Randfälle
`IO.printf` und `%n` verwenden.

### 4. Teilaufgaben
- [ ] Feldbreite festlegen
- [ ] Genauigkeit festlegen
- [ ] Gleitkommaformat wählen
- [ ] Zeilenumbruch ergänzen
- [ ] Ausgabe prüfen

### 5. Denkweg
Breite und Nachkommastellen sind zwei getrennte Formatparameter.

### 6. Pseudocode
```text
FORMAT = BREITE 12, 5 NACHKOMMASTELLEN
PI FORMATIEREN
```

### 7. Java-Skelett
```java
void main() {
    IO.printf(/* TODO */, Math.PI);
}
```

### 8. Schnelltests
- fünf Nachkommastellen
- Feldbreite 12

---

## E09 — Escape-Sequenzen

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Erzeuge mit einem einzigen String-Literal zwei Zeilen mit Tabulator und sichtbaren Anführungszeichen.

### 2. Eingaben / Ausgaben
Erste Zeile: `Name:    "Ada"`; zweite Zeile: `Java 25`.

### 3. Constraints / Randfälle
Ein `println`, ein String-Literal.

### 4. Teilaufgaben
- [ ] `\t` einsetzen
- [ ] sichtbare Anführungszeichen escapen
- [ ] `\n` einsetzen
- [ ] String korrekt schließen
- [ ] Ausgabe prüfen

### 5. Denkweg
Escape-Sequenzen gehören zur Quelltextsyntax.

### 6. Pseudocode
```text
NAME + TAB + "ADA"
ZEILENUMBRUCH
JAVA 25
```

### 7. Java-Skelett
```java
void main() {
    IO.println(/* TODO */);
}
```

### 8. Schnelltests
- sichtbare `"Ada"`
- zweite Zeile `Java 25`

---

## E10 — Formatierte Rechnungstabelle

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Gib eine kleine Rechnung mit Produkt, Menge, Einzelpreis und Gesamtpreis tabellarisch aus.

### 2. Eingaben / Ausgaben
Produkt `Kabel`, Menge `3`, Preis `4.95`.

### 3. Constraints / Randfälle
Gesamtpreis berechnen, nicht fest eintragen. `printf` verwenden.

### 4. Teilaufgaben
- [ ] Werte speichern
- [ ] Gesamt berechnen
- [ ] Header schreiben
- [ ] Spalten ausrichten
- [ ] Preise mit zwei Nachkommastellen formatieren

### 5. Denkweg
Berechnung und Darstellung getrennt behandeln.

### 6. Pseudocode
```text
GESAMT = MENGE * PREIS
HEADER AUSGEBEN
DATENZEILE FORMATIEREN
```

### 7. Java-Skelett
```java
void main() {
    String produkt = "Kabel";
    int menge = 3;
    double preis = 4.95;

    // TODO: Gesamt
    // TODO: Tabelle
}
```

### 8. Schnelltests
- Gesamt = 14.85
- Preiswerte mit 2 Nachkommastellen
