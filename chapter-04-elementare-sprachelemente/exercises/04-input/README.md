# 04 — Konsoleneingabe mit Simput

Nur Aufgaben. Lösungen liegen unter `solutions/04-input`.

---

## E19 — Drei Datentypen einlesen

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Lies Alter, Körpergröße und Initiale mit den passenden `Simput`-Methoden ein.

### 2. Eingaben / Ausgaben
Beispiel: `33`, `1.82`, `L` → alle drei Werte wieder ausgeben.

### 3. Constraints / Randfälle
Nutze `gint()`, `gdouble()`, `gchar()`. Keine Casts.

### 4. Teilaufgaben
- [ ] Alter als `int`
- [ ] Größe als `double`
- [ ] Initiale als `char`
- [ ] passende Prompts schreiben
- [ ] Werte ausgeben
- [ ] Zieltypen erklären

### 5. Denkweg
Wähle die Eingabemethode passend zum Datentyp, nicht passend zur sichtbaren Form allein.

### 6. Pseudocode
```text
alter LESEN
groesse LESEN
initiale LESEN
ALLE AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    // TODO int alter
    // TODO double groesse
    // TODO char initiale
    // TODO Ausgabe
}
```

### 8. Schnelltests
- `33`
- `1.82`
- `L`

**Reflexion:** Warum wäre `gint()` für die Körpergröße unpassend?

---

## E20 — Rechteck-Rechner

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Lies Breite und Höhe als `double` ein und berechne Fläche und Umfang.

### 2. Eingaben / Ausgaben
`5.5`, `2.0` → Fläche `11.0`, Umfang `15.0`.

### 3. Constraints / Randfälle
Nur `Simput.gdouble()`, `+ - * /`, Variablen und Ausgabe verwenden.

### 4. Teilaufgaben
- [ ] Breite lesen
- [ ] Höhe lesen
- [ ] Fläche berechnen
- [ ] Umfang berechnen
- [ ] beide Ergebnisse ausgeben

### 5. Denkweg
Trenne Eingabe, Berechnung und Ausgabe.

### 6. Pseudocode
```text
breite LESEN
hoehe LESEN
flaeche = breite * hoehe
umfang = 2 * (breite + hoehe)
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    double breite = Simput.gdouble("Breite: ");
    // TODO
}
```

### 8. Schnelltests
- `5.5`, `2.0`
- `1.0`, `1.0`
- `0.5`, `8.0`

**Reflexion:** Warum sollte die Berechnung nicht direkt im Prompt stehen?

---

## E21 — Sekunden zerlegen

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies eine nichtnegative Gesamtzahl von Sekunden ein und zerlege sie in Minuten und Restsekunden.

### 2. Eingaben / Ausgaben
`125` → `2 Minuten, 5 Sekunden`.

### 3. Constraints / Randfälle
`int`, Ganzzahldivision und Restoperator verwenden.

### 4. Teilaufgaben
- [ ] Sekunden lesen
- [ ] Minuten mit `/` berechnen
- [ ] Restsekunden mit `%`
- [ ] Ergebnis formatieren
- [ ] `0` testen
- [ ] `59`, `60`, `61` testen

### 5. Denkweg
Ganzzahldivision liefert die vollen Gruppen; `%` liefert den Rest.

### 6. Pseudocode
```text
gesamt LESEN
minuten = gesamt / 60
rest = gesamt % 60
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int gesamt = Simput.gint("Sekunden: ");
    // TODO
}
```

### 8. Schnelltests
- `0` → `0 / 0`
- `59` → `0 / 59`
- `125` → `2 / 5`

**Reflexion:** Warum ist `double` hier unnötig?

---

## E22 — Zwei Zahlen, vier Grundoperationen

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies zwei `double`-Werte ein und berechne Summe, Differenz, Produkt und Quotient.

### 2. Eingaben / Ausgaben
`8.0`, `2.0` → `10.0`, `6.0`, `16.0`, `4.0`.

### 3. Constraints / Randfälle
Für diese Übung darf der zweite Wert nicht `0.0` sein. Noch keine eigene Exception-Behandlung.

### 4. Teilaufgaben
- [ ] zwei Werte lesen
- [ ] vier Ergebnisse berechnen
- [ ] jede Operation getrennt speichern
- [ ] Ergebnisse ausgeben
- [ ] Reihenfolge der Operanden bei Subtraktion/Division beachten

### 5. Denkweg
Operation und Operandreihenfolge explizit notieren.

### 6. Pseudocode
```text
a LESEN
b LESEN
summe = a + b
differenz = a - b
produkt = a * b
quotient = a / b
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    double a = Simput.gdouble("a: ");
    double b = Simput.gdouble("b: ");
    // TODO
}
```

### 8. Schnelltests
- `8, 2`
- `-3, 4`
- `1.5, 0.5`

**Reflexion:** Warum ist `a / b` nicht dasselbe wie `b / a`?

---

## E23 — Eingabe-Kette mit Zwischenwert

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Lies drei ganze Zahlen ein. Berechne zuerst die Summe der ersten beiden und multipliziere dieses Zwischenergebnis mit der dritten Zahl.

### 2. Eingaben / Ausgaben
`2`, `3`, `4` → `20`.

### 3. Constraints / Randfälle
Zwischenergebnis in einer eigenen Variablen speichern. Keine Ein-Zeilen-Gesamtlösung.

### 4. Teilaufgaben
- [ ] drei Werte lesen
- [ ] Zwischensumme speichern
- [ ] Endergebnis berechnen
- [ ] Typen notieren
- [ ] Ergebnis ausgeben
- [ ] `(a+b)*c` mit `a+b*c` vergleichen

### 5. Denkweg
Zwischenwerte machen Operatorreihenfolge und Debugging sichtbar.

### 6. Pseudocode
```text
a,b,c LESEN
zwischen = a + b
result = zwischen * c
AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    int a = Simput.gint("a: ");
    int b = Simput.gint("b: ");
    int c = Simput.gint("c: ");

    // TODO
}
```

### 8. Schnelltests
- `2,3,4` → `20`
- `0,5,2` → `10`
- `-2,3,4` → `4`

**Reflexion:** Welche falsche Ausgabe bekämst du bei `a + b * c` für `2,3,4`?
