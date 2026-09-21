# 06 — Numerische Grenzfälle

Nur Aufgaben. Lösungen liegen unter `solutions/06-numeric-limits`.

---

## E32 — int-Overflow beobachten

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Erhöhe `Integer.MAX_VALUE` um 1 und beobachte den neuen Wert.

### 2. Eingaben / Ausgaben
Keine Eingabe.

### 3. Constraints / Randfälle
Nur primitive `int`-Arithmetik.

### 4. Teilaufgaben
- [ ] Maximalwert speichern
- [ ] um 1 erhöhen
- [ ] Ergebnis vorhersagen
- [ ] ausgeben
- [ ] erklären, warum keine Exception entsteht

### 5. Denkweg
Primitive Ganzzahlen besitzen einen festen Wertebereich und laufen zyklisch über.

### 6. Pseudocode
```text
x = INT_MAX
x = x + 1
x AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int x = Integer.MAX_VALUE;
    // TODO
}
```

### 8. Schnelltests
Vergleiche Ergebnis mit `Integer.MIN_VALUE`.

---

## E33 — long-Overflow mit Multiplikation

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Multipliziere einen sehr großen `long`-Wert mit 2 und prüfe, ob das Ergebnis plausibel bleibt.

### 2. Eingaben / Ausgaben
Startwert `Long.MAX_VALUE / 2 + 1`.

### 3. Constraints / Randfälle
Keine Big-Number-Klassen.

### 4. Teilaufgaben
- [ ] Startwert berechnen
- [ ] mit 2 multiplizieren
- [ ] Vorzeichen prüfen
- [ ] Ergebnis ausgeben
- [ ] Overflow erklären

### 5. Denkweg
Auch `long` ist endlich; größere Breite verhindert Overflow nicht grundsätzlich.

### 6. Pseudocode
```text
x = LONG_MAX/2 + 1
y = x*2
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    long x = Long.MAX_VALUE / 2 + 1;
    // TODO
}
```

### 8. Schnelltests
Ist `y` negativ?

---

## E34 — Infinity und NaN

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Erzeuge bewusst `Infinity` und `NaN` mit `double`.

### 2. Eingaben / Ausgaben
Keine Eingabe.

### 3. Constraints / Randfälle
Nutze `1.0/0.0` und `0.0/0.0`.

### 4. Teilaufgaben
- [ ] beide Werte berechnen
- [ ] ausgeben
- [ ] mit `Double.isInfinite` prüfen
- [ ] mit `Double.isNaN` prüfen
- [ ] Unterschied zu Ganzzahldivision durch null erklären

### 5. Denkweg
Floating Point folgt IEEE-754 und besitzt Sonderwerte.

### 6. Pseudocode
```text
a = 1.0/0.0
b = 0.0/0.0
prüfen
```

### 7. Java-Skelett
```java
void main() {
    // TODO
}
```

### 8. Schnelltests
- `a` unendlich
- `b` NaN

---

## E35 — 0.1 + 0.2

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Prüfe, ob `0.1 + 0.2 == 0.3` ist, und gib zusätzlich den berechneten Wert mit vielen Nachkommastellen aus.

### 2. Eingaben / Ausgaben
Keine Eingabe.

### 3. Constraints / Randfälle
Nutze `double`.

### 4. Teilaufgaben
- [ ] Summe speichern
- [ ] exakten Vergleich ausführen
- [ ] Wert mit hoher Präzision ausgeben
- [ ] binäre Darstellung erklären
- [ ] eine kleine Toleranzidee formulieren

### 5. Denkweg
Viele Dezimalbrüche sind binär nicht exakt darstellbar.

### 6. Pseudocode
```text
d = 0.1+0.2
d == 0.3 ?
d MIT VIELEN STELLEN AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    double d = 0.1 + 0.2;
    // TODO
}
```

### 8. Schnelltests
Nutze z. B. `%.17f`.

---

## E36 — double-Auflösung bei 1.0

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Finde den größten Exponenten `i`, für den `1.0 + 2^-i > 1.0` noch gilt.

### 2. Eingaben / Ausgaben
Keine Eingabe. Erwartung in der Nähe von 52.

### 3. Constraints / Randfälle
Schleife und `Math.scalb(1.0, -i)` verwenden.

### 4. Teilaufgaben
- [ ] `i=0` starten
- [ ] Bedingung formulieren
- [ ] `i` erhöhen
- [ ] ersten nicht mehr unterscheidbaren Wert erkennen
- [ ] letzten gültigen Wert ausgeben
- [ ] Bedeutung erklären

### 5. Denkweg
Die relative Auflösung von `double` ist endlich.

### 6. Pseudocode
```text
i=0
SOLANGE 1 + 2^-i > 1
  i++
AUSGEBEN i-1
```

### 7. Java-Skelett
```java
void main() {
    int i = 0;
    // TODO while
}
```

### 8. Schnelltests
Erwarte typischerweise `52`.

**Reflexion:** Warum gilt dieses Ergebnis speziell in der Nähe von `1.0`?
