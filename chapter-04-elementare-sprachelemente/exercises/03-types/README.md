# 03 — Variablen und Datentypen

Nur Aufgaben. Lösungen liegen unter `solutions/03-types`.

---

## E11 — Literaltypen mit `var`

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Deklariere `var`-Variablen mit `10`, `10L`, `10.0` und `'x'` und bestimme die inferierten Typen.

### 2. Eingaben / Ausgaben
Keine Eingabe. Vier Werte ausgeben.

### 3. Constraints / Randfälle
Nur `var` in den Deklarationen.

### 4. Teilaufgaben
- [ ] vier Variablen anlegen
- [ ] Typen vorhersagen
- [ ] Werte ausgeben
- [ ] je Typ eine passende Operation nennen
- [ ] erklären, warum `var` nicht dynamisch ist

### 5. Denkweg
Der Compiler inferiert (= déduit) den Typ aus dem Initialisierungsausdruck.

### 6. Pseudocode
```text
a = 10
b = 10L
c = 10.0
d = 'x'
ALLE AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    // TODO a,b,c,d mit var
    // TODO Ausgabe
}
```

### 8. Schnelltests
- `a` verhält sich wie `int`
- `b` wie `long`
- `c` wie `double`
- `d` wie `char`

---

## E12 — `char` und Unicode

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Speichere den numerischen Wert 65 in einem `char` und gib Zeichen sowie Codewert aus.

### 2. Eingaben / Ausgaben
Keine Eingabe. Ausgabe: `A` und `65`.

### 3. Constraints / Randfälle
Keine String-Konvertierung.

### 4. Teilaufgaben
- [ ] `char` aus 65 erzeugen
- [ ] Zeichen ausgeben
- [ ] nach `int` zuweisen
- [ ] Codewert ausgeben
- [ ] zweite Schreibweise mit Unicode-Escape notieren

### 5. Denkweg
`char` ist ein primitiver numerischer Typ mit Zeichendarstellung.

### 6. Pseudocode
```text
c = CHAR MIT CODE 65
code = c ALS int
c AUSGEBEN
code AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    // TODO char c
    // TODO int code
}
```

### 8. Schnelltests
- `A`
- `65`

---

## E13 — Block-Scope

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Repariere einen Scope-Fehler so, dass ein im `if` berechneter Wert danach ausgegeben werden kann.

### 2. Eingaben / Ausgaben
`x = 7`, erwartete Ausgabe `14`.

### 3. Constraints / Randfälle
Berechnung `x * 2` muss im `if` bleiben.

### 4. Teilaufgaben
- [ ] Scope-Fehler erkennen
- [ ] Ergebnisvariable passend deklarieren
- [ ] im `if` zuweisen
- [ ] hinter dem Block ausgeben
- [ ] Gültigkeitsbereich erklären

### 5. Denkweg
Die Deklarationsstelle bestimmt den Gültigkeitsbereich (= portée).

### 6. Pseudocode
```text
x = 7
result VOR IF DEKLARIEREN
WENN x > 5
  result = x * 2
result AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int x = 7;
    // TODO result
    if (x > 5) {
        // TODO
    }
    // TODO Ausgabe
}
```

### 8. Schnelltests
- kompiliert
- Ausgabe `14`

---

## E14 — Widening-Konvertierung

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Baue eine Kette `byte → short → int → long → double` ohne explizite Casts.

### 2. Eingaben / Ausgaben
Ausgangswert `100`, Endausgabe `100.0`.

### 3. Constraints / Randfälle
Keine Casts.

### 4. Teilaufgaben
- [ ] `byte` deklarieren
- [ ] nach `short`
- [ ] nach `int`
- [ ] nach `long`
- [ ] nach `double`
- [ ] Endwert ausgeben

### 5. Denkweg
Erweiternde Konvertierung (= conversion élargissante) ist in dieser Richtung implizit erlaubt.

### 6. Pseudocode
```text
byte -> short -> int -> long -> double
```

### 7. Java-Skelett
```java
void main() {
    byte b = 100;
    // TODO Kette
}
```

### 8. Schnelltests
- kein Cast
- Endwert `100.0`

---

## E15 — Narrowing-Cast

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Wandle `12.9` mit einem expliziten Cast in `int` um und beobachte den Informationsverlust.

### 2. Eingaben / Ausgaben
Original `12.9`, Ergebnis `12`.

### 3. Constraints / Randfälle
Keine Rundungsfunktion.

### 4. Teilaufgaben
- [ ] `double` speichern
- [ ] nach `int` casten
- [ ] beide Werte ausgeben
- [ ] Verhalten bei `-12.9` vorhersagen
- [ ] Unterschied zu Rundung erklären

### 5. Denkweg
Ein Narrowing-Cast kann Information verlieren.

### 6. Pseudocode
```text
d = 12.9
i = CAST int VON d
BEIDE AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    double d = 12.9;
    // TODO int i
}
```

### 8. Schnelltests
- Ergebnis `12`
- keine `Math.round`

---

## E16 — `byte + short` Promotion

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Speichere das Ergebnis von `byte + short` im korrekten Typ.

### 2. Eingaben / Ausgaben
`byte b=10`, `short s=20`, Ausgabe `30`.

### 3. Constraints / Randfälle
Kein unnötiger Cast.

### 4. Teilaufgaben
- [ ] Operanden deklarieren
- [ ] Ergebnistyp vorhersagen
- [ ] passenden Zieltyp wählen
- [ ] kompilieren
- [ ] Promotionsregel erklären

### 5. Denkweg
Binäre Arithmetik promotet kleinere Ganzzahltypen mindestens zu `int`.

### 6. Pseudocode
```text
b = byte 10
s = short 20
result = b + s MIT KORREKTEM TYP
```

### 7. Java-Skelett
```java
void main() {
    byte b = 10;
    short s = 20;
    // TODO result
}
```

### 8. Schnelltests
- Ausgabe `30`
- kein Cast

---

## E17 — `final` als Konstante

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Speichere den Faktor `1.95583` einmal als `final double` und benutze ihn zur DM-Euro-Umrechnung.

### 2. Eingaben / Ausgaben
`19.5583 DM` -> ungefähr `10.0 Euro`.

### 3. Constraints / Randfälle
Faktor nur einmal deklarieren, danach nicht neu zuweisen.

### 4. Teilaufgaben
- [ ] Konstante anlegen
- [ ] DM-Wert speichern
- [ ] Euro berechnen
- [ ] ausgeben
- [ ] erklären, was `final` verhindert

### 5. Denkweg
`final` verhindert Neuzuweisung, ändert aber nicht den Datentyp.

### 6. Pseudocode
```text
FINAL KURS = 1.95583
dm = 19.5583
euro = dm / KURS
```

### 7. Java-Skelett
```java
void main() {
    // TODO final Konstante
    double dm = 19.5583;
    // TODO euro
}
```

### 8. Schnelltests
- ca. `10.0`
- Konstante unverändert

---

## E18 — Gemischte Arithmetik

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Bestimme Wert und Typ von `int + long * double`, bevor du den Code ausführst.

### 2. Eingaben / Ausgaben
`a=2`, `b=3L`, `c=4.5`, erwarteter Endwert `15.5`.

### 3. Constraints / Randfälle
Vor der IDE eine schriftliche Typanalyse machen.

### 4. Teilaufgaben
- [ ] Präzedenz anwenden
- [ ] Typ von `b*c` bestimmen
- [ ] Zwischenwert berechnen
- [ ] Typ der Addition bestimmen
- [ ] Ergebnis speichern
- [ ] Vorhersage mit Lauf vergleichen

### 5. Denkweg
Nicht nur Endwert, sondern jeden Zwischentyp notieren.

### 6. Pseudocode
```text
tmp = b * c
TYPE(tmp)?
result = a + tmp
TYPE(result)?
```

### 7. Java-Skelett
```java
void main() {
    int a = 2;
    long b = 3L;
    double c = 4.5;

    // TODO result mit richtigem Typ
}
```

### 8. Schnelltests
- Endwert `15.5`
- Ergebnistyp `double`
