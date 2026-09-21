# 05 — Operatoren und Ausdrücke

Nur Aufgaben. Lösungen liegen unter `solutions/05-operators`.

---

## E24 — Ganzzahldivision verstehen

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Bestimme Wert und Typ von drei fast gleichen Ausdrücken.

### 2. Eingaben / Ausgaben
Keine Eingabe. Analysiere:
- `7 / 2`
- `7 / 2.0`
- `(double) (7 / 2)`

### 3. Constraints / Randfälle
Vor der IDE schriftlich auswerten.

### 4. Teilaufgaben
- [ ] Operanden-Typen bestimmen
- [ ] Division ausführen
- [ ] Ergebnistyp notieren
- [ ] Cast-Zeitpunkt erklären
- [ ] Ergebnisse vergleichen

### 5. Denkweg
Ein Cast nach einer Ganzzahldivision kann verlorene Nachkommastellen nicht zurückholen.

### 6. Pseudocode
```text
FÜR JEDEN AUSDRUCK
  operandentypen BESTIMMEN
  operation AUSFÜHREN
  ergebnistyp NOTIEREN
```

### 7. Java-Skelett
```java
void main() {
    // TODO: drei Ergebnisse speichern und ausgeben
}
```

### 8. Schnelltests
Erwarte `3`, `3.5`, `3.0`.

**Reflexion:** Wo müsste der Cast stehen, damit `3.5` entsteht?

---

## E25 — Promotion von byte und short

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Addiere `byte` und `short` und speichere das Ergebnis im korrekten Typ.

### 2. Eingaben / Ausgaben
`10 + 20 = 30`.

### 3. Constraints / Randfälle
Kein Cast.

### 4. Teilaufgaben
- [ ] Operanden deklarieren
- [ ] Ergebnistyp vorhersagen
- [ ] passende Zielvariable wählen
- [ ] Ausgabe schreiben
- [ ] Promotionsregel erklären

### 5. Denkweg
Kleine Ganzzahltypen werden bei binärer Arithmetik mindestens zu `int` promotet.

### 6. Pseudocode
```text
b = byte 10
s = short 20
result = b + s
```

### 7. Java-Skelett
```java
void main() {
    byte b = 10;
    short s = 20;
    // TODO
}
```

### 8. Schnelltests
- Ergebnis `30`
- kein `byte result`

---

## E26 — Prä- und Postinkrement

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Verfolge exakt, wann `i` erhöht wird.

### 2. Eingaben / Ausgaben
Start `i=5`; berechne:
`a = i++`, danach `b = ++i`.

### 3. Constraints / Randfälle
Jeden Zwischenzustand schriftlich notieren.

### 4. Teilaufgaben
- [ ] Startwert notieren
- [ ] Wert von `a`
- [ ] neuer Wert von `i`
- [ ] Wert von `b`
- [ ] Endwert von `i`
- [ ] alles ausgeben

### 5. Denkweg
Postinkrement liefert den alten Wert, Präinkrement den neuen.

### 6. Pseudocode
```text
i=5
a = ALTER i; DANACH i++
i++; b = NEUER i
```

### 7. Java-Skelett
```java
void main() {
    int i = 5;
    // TODO
}
```

### 8. Schnelltests
Erwarte Endzustand `i=7, a=5, b=7`.

---

## E27 — Ternärer Operator

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies eine Temperatur und wähle mit genau einem ternären Operator zwischen `"heiß"` und `"normal"`.

### 2. Eingaben / Ausgaben
`31` → `heiß`, `20` → `normal`.

### 3. Constraints / Randfälle
Kein `if`.

### 4. Teilaufgaben
- [ ] Temperatur lesen
- [ ] Bedingung formulieren
- [ ] beide Ergebnisstrings einsetzen
- [ ] Ergebnis speichern
- [ ] ausgeben

### 5. Denkweg
Der ternäre Operator ist ein Ausdruck und liefert einen Wert.

### 6. Pseudocode
```text
temp LESEN
text = temp >= 30 ? heiß : normal
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int temperatur = Simput.gint("Temperatur: ");
    // TODO
}
```

### 8. Schnelltests
- 29 → normal
- 30 → heiß
- 40 → heiß

---

## E28 — Short-Circuit als Schutz

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Prüfe sicher, ob `10 / x > 2`, ohne bei `x == 0` eine Ganzzahldivision durch null auszuführen.

### 2. Eingaben / Ausgaben
`x=0` → `false`; `x=2` → `true`.

### 3. Constraints / Randfälle
Nutze genau eine boolesche Expression mit `&&`.

### 4. Teilaufgaben
- [ ] zuerst `x != 0` prüfen
- [ ] zweite Bedingung formulieren
- [ ] Ergebnis speichern
- [ ] `x=0` testen
- [ ] Short-Circuit erklären

### 5. Denkweg
Die rechte Seite von `&&` wird nur ausgewertet, wenn die linke Seite `true` ist.

### 6. Pseudocode
```text
safe = x != 0 UND 10/x > 2
```

### 7. Java-Skelett
```java
void main() {
    int x = Simput.gint("x: ");
    // TODO boolean safe
}
```

### 8. Schnelltests
- 0 → false
- 2 → true
- 10 → false

---

## E29 — Boolesches XOR

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Zwei Sensoren liefern `boolean`-Werte. Eine Warnung soll genau dann aktiv sein, wenn **genau einer** der Sensoren aktiv ist.

### 2. Eingaben / Ausgaben
`true,false` → `true`; `true,true` → `false`.

### 3. Constraints / Randfälle
Nutze boolesches `^`.

### 4. Teilaufgaben
- [ ] zwei Booleans deklarieren
- [ ] XOR anwenden
- [ ] Wahrheitstabelle erstellen
- [ ] Ergebnis ausgeben
- [ ] Unterschied zu `||` erklären

### 5. Denkweg
XOR ist `true`, wenn die Operanden verschieden sind.

### 6. Pseudocode
```text
warning = sensorA XOR sensorB
```

### 7. Java-Skelett
```java
void main() {
    boolean sensorA = true;
    boolean sensorB = false;
    // TODO
}
```

### 8. Schnelltests
Alle vier Kombinationen testen.

---

## E30 — Parität in einer Anweisung

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies eine ganze Zahl ein und gib in einer einzigen Ausgabefunktion `gerade` oder `ungerade` aus.

### 2. Eingaben / Ausgaben
`8` → `gerade`, `7` → `ungerade`.

### 3. Constraints / Randfälle
Ternärer Operator; keine extra Ergebnisvariable.

### 4. Teilaufgaben
- [ ] Zahl lesen
- [ ] Rest durch 2 prüfen
- [ ] ternären Operator bilden
- [ ] direkt ausgeben
- [ ] negative Zahlen testen

### 5. Denkweg
Parität hängt nur davon ab, ob der Rest bei Division durch 2 null ist.

### 6. Pseudocode
```text
zahl LESEN
AUSGEBEN zahl%2==0 ? gerade : ungerade
```

### 7. Java-Skelett
```java
void main() {
    int zahl = Simput.gint("Zahl: ");
    // TODO eine Ausgabeanweisung
}
```

### 8. Schnelltests
- 0 → gerade
- -3 → ungerade
- 12 → gerade

---

## E31 — Gemischter Ausdruck

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Bestimme Wert und Typ von `a + b * c / 2` für `int a=2`, `long b=3L`, `double c=4.0`.

### 2. Eingaben / Ausgaben
Erwarteter Wert erst schriftlich bestimmen.

### 3. Constraints / Randfälle
Jeden Zwischentyp notieren.

### 4. Teilaufgaben
- [ ] Präzedenz bestimmen
- [ ] Typ von `b*c`
- [ ] Division analysieren
- [ ] Addition analysieren
- [ ] Endtyp bestimmen
- [ ] mit IDE vergleichen

### 5. Denkweg
Sobald `double` beteiligt ist, werden numerische Teilausdrücke typischerweise zu `double` promotet.

### 6. Pseudocode
```text
tmp1 = b*c
tmp2 = tmp1/2
result = a+tmp2
```

### 7. Java-Skelett
```java
void main() {
    int a = 2;
    long b = 3L;
    double c = 4.0;
    // TODO
}
```

### 8. Schnelltests
Erwarte `8.0` vom Typ `double`.

**Reflexion:** Warum bleibt die Division hier keine Ganzzahldivision?
