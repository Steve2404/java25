# 07 — Ablaufsteuerung

Nur Aufgaben. Lösungen liegen unter `solutions/07-control-flow`.

---

## E37 — if / else mit Vorzeichen

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Lies eine ganze Zahl ein und gib `positiv`, `negativ` oder `null` aus.

### 2. Eingaben / Ausgaben
`5` → `positiv`, `-2` → `negativ`, `0` → `null`.

### 3. Constraints / Randfälle
Nutze `if / else if / else`.

### 4. Teilaufgaben
- [ ] Zahl lesen
- [ ] positive Werte erkennen
- [ ] negative Werte erkennen
- [ ] Null behandeln
- [ ] genau eine Ausgabe erzeugen

### 5. Denkweg
Die Bedingungen müssen sich gegenseitig sauber ausschließen.

### 6. Pseudocode
```text
zahl LESEN
WENN zahl > 0
  positiv
SONST WENN zahl < 0
  negativ
SONST
  null
```

### 7. Java-Skelett
```java
void main() {
    int zahl = Simput.gint("Zahl: ");
    // TODO
}
```

### 8. Schnelltests
`5`, `-2`, `0`.

---

## E38 — Moderner switch

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Wandle die Zahlen `1..5` in deutsche Wörter um.

### 2. Eingaben / Ausgaben
`3` → `drei`; andere Werte → `unbekannt`.

### 3. Constraints / Randfälle
Nutze eine `switch`-Expression mit Arrow-Cases.

### 4. Teilaufgaben
- [ ] Zahl lesen
- [ ] Fälle 1..5
- [ ] default
- [ ] Ergebnis als String speichern
- [ ] ausgeben

### 5. Denkweg
Eine `switch`-Expression liefert einen Wert.

### 6. Pseudocode
```text
wort = SWITCH zahl
  1 -> eins
  ...
  default -> unbekannt
```

### 7. Java-Skelett
```java
void main() {
    int zahl = Simput.gint("1..5: ");
    // TODO
}
```

### 8. Schnelltests
1, 3, 5, 9.

---

## E39 — Summe 1 bis n mit for

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Berechne die Summe aller ganzen Zahlen von 1 bis `n`.

### 2. Eingaben / Ausgaben
`n=5` → `15`.

### 3. Constraints / Randfälle
Nutze eine `for`-Schleife. `n >= 0`.

### 4. Teilaufgaben
- [ ] n lesen
- [ ] Summenvariable initialisieren
- [ ] Schleife 1..n
- [ ] laufende Summe aktualisieren
- [ ] Ergebnis ausgeben

### 5. Denkweg
Akkumulator vor der Schleife initialisieren und pro Durchgang aktualisieren.

### 6. Pseudocode
```text
sum=0
FÜR i=1 BIS n
  sum = sum+i
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int n = Simput.gint("n: ");
    // TODO
}
```

### 8. Schnelltests
0 → 0, 1 → 1, 5 → 15.

---

## E40 — Countdown mit while

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Lies eine positive Zahl und zähle bis 0 herunter.

### 2. Eingaben / Ausgaben
`3` → `3 2 1 0`.

### 3. Constraints / Randfälle
Nutze `while`.

### 4. Teilaufgaben
- [ ] Startwert lesen
- [ ] Bedingung formulieren
- [ ] aktuellen Wert ausgeben
- [ ] Zustand verändern
- [ ] Ende bei 0 sicherstellen

### 5. Denkweg
Jede Schleife braucht eine Zustandsänderung, die die Endbedingung erreichbar macht.

### 6. Pseudocode
```text
n LESEN
SOLANGE n >= 0
  n AUSGEBEN
  n--
```

### 7. Java-Skelett
```java
void main() {
    int n = Simput.gint("Start: ");
    // TODO
}
```

### 8. Schnelltests
0, 1, 3.

---

## E41 — do-while mindestens einmal

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies wiederholt eine Zahl, bis eine positive Zahl eingegeben wurde.

### 2. Eingaben / Ausgaben
Folge `-2, 0, 7` → endet bei `7`.

### 3. Constraints / Randfälle
Nutze `do-while`.

### 4. Teilaufgaben
- [ ] Variable deklarieren
- [ ] Eingabe im `do`
- [ ] Bedingung hinter dem Rumpf
- [ ] positive Zahl ausgeben
- [ ] erklären, warum der Rumpf mindestens einmal läuft

### 5. Denkweg
Die Bedingung wird erst nach dem ersten Durchgang geprüft.

### 6. Pseudocode
```text
DO
  zahl LESEN
WHILE zahl <= 0
zahl AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int zahl;
    // TODO
}
```

### 8. Schnelltests
7 sofort; -2,0,7.

---

## E42 — continue: gerade Werte überspringen

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Gib von 1 bis 10 nur ungerade Zahlen aus.

### 2. Eingaben / Ausgaben
`1 3 5 7 9`.

### 3. Constraints / Randfälle
Nutze `for` und `continue`.

### 4. Teilaufgaben
- [ ] Schleife 1..10
- [ ] gerade Zahl erkennen
- [ ] bei gerade `continue`
- [ ] ungerade ausgeben
- [ ] Update-Verhalten erklären

### 5. Denkweg
`continue` beendet nur den restlichen aktuellen Rumpf.

### 6. Pseudocode
```text
FÜR i=1..10
  WENN gerade
    CONTINUE
  i AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    // TODO
}
```

### 8. Schnelltests
Kein gerader Wert darf erscheinen.

---

## E43 — break: ersten Teiler finden

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies `n >= 2` und finde den ersten Teiler ab 2.

### 2. Eingaben / Ausgaben
`21` → erster Teiler `3`; `17` → kein Teiler vor `17`.

### 3. Constraints / Randfälle
Nutze `for` und `break`. Noch keine Methoden schreiben.

### 4. Teilaufgaben
- [ ] Zahl lesen
- [ ] Schleife ab 2
- [ ] Rest prüfen
- [ ] ersten Treffer speichern
- [ ] `break`
- [ ] Ergebnis ausgeben

### 5. Denkweg
Sobald der kleinste Teiler gefunden ist, sind spätere Kandidaten unnötig.

### 6. Pseudocode
```text
teiler=0
FÜR i=2 BIS n-1
  WENN n%i==0
    teiler=i
    BREAK
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    long n = Simput.glong("n: ");
    // TODO
}
```

### 8. Schnelltests
21 → 3, 25 → 5, 17 → keiner.

---

## E44 — Primzahltest bis sqrt

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Entscheide effizient, ob eine Zahl prim ist.

### 2. Eingaben / Ausgaben
`29` → Primzahl, `35` → keine Primzahl.

### 3. Constraints / Randfälle
Teste nur bis `floor(sqrt(n))`. Nutze `break`.

### 4. Teilaufgaben
- [ ] n lesen
- [ ] n < 2 behandeln
- [ ] Grenze berechnen
- [ ] booleschen Zustand
- [ ] Schleife schreiben
- [ ] bei Teiler abbrechen
- [ ] Ergebnis ausgeben

### 5. Denkweg
Bei einer zusammengesetzten Zahl existiert mindestens ein Faktor nicht größer als die Quadratwurzel.

### 6. Pseudocode
```text
WENN n<2 -> nicht prim
grenze=floor(sqrt(n))
teiler=false
FÜR i=2..grenze
  WENN n%i==0
    teiler=true
    BREAK
```

### 7. Java-Skelett
```java
void main() {
    long n = Simput.glong("n: ");
    // TODO
}
```

### 8. Schnelltests
2, 3, 4, 29, 35, 97.

---

## E45 — Euklid mit Modulo

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Berechne den größten gemeinsamen Teiler zweier positiver `long`-Werte.

### 2. Eingaben / Ausgaben
`48,18` → `6`.

### 3. Constraints / Randfälle
Nutze `while` und `%`. Keine Bibliotheks-GGT-Methode.

### 4. Teilaufgaben
- [ ] zwei Werte lesen
- [ ] Kopien für Arbeitswerte
- [ ] Rest berechnen
- [ ] Werte verschieben
- [ ] bis zweiter Wert 0
- [ ] GGT ausgeben

### 5. Denkweg
`ggT(x,y) = ggT(y, x%y)`.

### 6. Pseudocode
```text
x=a
y=b
SOLANGE y != 0
  rest=x%y
  x=y
  y=rest
x AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    long a = Simput.glong("a: ");
    long b = Simput.glong("b: ");
    // TODO
}
```

### 8. Schnelltests
48/18 → 6, 21/14 → 7, 17/5 → 1.
